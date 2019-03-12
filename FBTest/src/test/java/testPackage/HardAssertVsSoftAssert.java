package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertVsSoftAssert {

	WebDriver driver;
	
	/*
	@Test(description="Hard Assert")
	public void verifyHomePage(){
		
		System.out.println("Browser invoked");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		System.out.println("Invoking the url");
		
		driver.navigate().to("https://www.google.com");
		Assert.assertEquals("Google1", driver.getTitle());
		System.out.println("Hard assert success");
		
		Assert.assertEquals(driver.getTitle(),"Google");
		System.out.println("Hard assert failed");
		driver.close();
		
	}
	*/
	
	@Test(description="Soft Assert")
	public void verifyHomePage2(){
		
		SoftAssert softAssert = new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		System.out.println("Invoking the url");
		
		driver.navigate().to("https://www.google.com");
		softAssert.assertEquals("Google1", driver.getTitle(),"Assertion failed");
		System.out.println("Soft assert failed");
		
		Assert.assertEquals("Google",driver.getTitle());
		System.out.println("Soft assert success");
		driver.close();
		softAssert.assertAll();
		
	}
	
}
