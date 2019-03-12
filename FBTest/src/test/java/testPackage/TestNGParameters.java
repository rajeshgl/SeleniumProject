package testPackage;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGParameters {

	private static WebDriver driver;
	
	@Test
	@Parameters({"sUsername","sPassword"})
	public void test(String sUsername, String sPassword) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(sUsername);
		driver.findElement(By.id("pass")).sendKeys(sPassword);
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	
		//Next line is used for validation
		WebElement ele=driver.findElement(By.xpath("//span[@class='_2md']"));//xpath of f image
		System.out.println(ele.getText());
		Assert.assertEquals(ele.getText(), "Facebook");
		
		//after writing the script, right-click on the class file(TestNGParameters -> TestNG -> Convert to TestNG -> click on Finish
		// in the .xml file that is generated, specify the parameter values and run as -> TestNG Suite
		
	}
	
}
