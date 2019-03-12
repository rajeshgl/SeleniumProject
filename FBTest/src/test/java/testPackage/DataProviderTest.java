package testPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	private static WebDriver driver;
	
	@DataProvider(name="Authentication") //@DataProvider annotation of TestNG is used to implement data read feature within class itself
	private static Object[] credentials(){
		
		return new Object[][]{{"testuser1","passwd1"},{"testuser2","passwd2"}};

	}
	
	//here we are calling the data provider object with its name
	
	@Test(dataProvider="Authentication")  //the description is added to denote data provider is used in this test method
	public void test(String sUsername, String sPassword) throws AWTException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(sUsername);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
	
		
	}

}
