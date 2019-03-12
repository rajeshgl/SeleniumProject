package testPackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.ExcelUtils;

@Listeners(utility.ListenerTest.class)     //this line is to represent TestNG listeners are incorporated in this code
public class DataProviderWithExcelFile {

	 WebDriver driver;
	 
	@BeforeMethod
	public void openBrowser() throws Exception{
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			System.out.println("Opening the browser");
			driver=new ChromeDriver();
			System.out.println("Invoking the url");
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
	}
	
	@DataProvider(name="Authentication")
	public Object[][] Authentication() throws Exception{
		
		Object[][] testObjData = ExcelUtils.getExcelData("C:\\Users\\Rajesh\\Documents\\dataprovider.xlsx", "Sheet1");
		return (testObjData);
		
	}
	
	@Test(dataProvider="Authentication")
	public void Login(String sUserName, String sPassword) throws Exception{
		
	 driver.findElement(By.id("email")).sendKeys(sUserName);
	 System.out.println(sUserName);
	 driver.findElement(By.id("pass")).sendKeys(sPassword);
	 System.out.println(sPassword);
	 
	 driver.findElement(By.id("u_0_2")).click();
	 System.out.println("Login successfully");
	 
	    Robot robot = new Robot();  //Robot class is from Java library to handle OS Pop-ups coming in web applications
		robot.keyPress(KeyEvent.VK_TAB); //clicks TAB button
		robot.keyPress(KeyEvent.VK_TAB); //clicks TAB button
		robot.keyPress(KeyEvent.VK_ENTER); //clicks ENTER button and then navigates to homepage of application
		
		 /*WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
		    WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
		    
		    if(logout.isEnabled() && logout.isDisplayed()) {
		        System.out.println("Test case is passed");
		    }
		    else {
		        System.out.println("Test case is failed");
		    }
		    */
		
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}
	
}
