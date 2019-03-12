package testPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility.ListenerTest.class)     //this line is to represent TestNG listeners are incorporated in this code
public class TestNGAssertion {
	
	WebDriver driver;
	Properties properties = new Properties();
	
	@BeforeTest
	public void openBrowser() throws IOException{
		
		//load the object repository file where the properties are defined
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Rajesh\\workspace\\FBTest\\config.properties");
		properties.load(fis);
		
		System.out.println("Browser invoked");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		System.out.println("Invoking the url");
		
		
	}
	
	@Test(priority=1,description="Login Test")
	public void LoginToFacebook() throws AWTException{
		
		driver.get("https://www.facebook.com");
		//driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();

		System.out.println("Logged in to Facebook");
		
		//Hard Assert example
		Assert.assertEquals(driver.getTitle(),"Facebook","Title is not as expected"); //three arguments (actual, expected, message if assert fails)
		System.out.println("Assertion passed");
		
		/*Robot robot = new Robot();  //Robot class is from Java library to handle OS Pop-ups coming in web applications
		robot.keyPress(KeyEvent.VK_TAB); //clicks TAB button
		robot.keyPress(KeyEvent.VK_TAB); //clicks TAB button
		robot.keyPress(KeyEvent.VK_ENTER); //clicks ENTER button and then navigates to homepage of application
		*/
	}
	
	/*@Test(priority=2)
	public void assertText(){
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=js_g']/div/div/div[1]/div[1]/h1/a/span")); //check this xpath, it's wrong***
		System.out.println(logo.getText());
		Assert.assertEquals(logo.getText(),"Facebook");
	}*/
	
	@Test(priority=2,description="Logout Test",dependsOnMethods="LoginToFacebook")
	public void Logout(){
		
		System.out.println("Logged out of Facebook");
	}
	
	@AfterTest
	public void closeBrowser(){
		
		System.out.println("Closing the browser");
	}

}
