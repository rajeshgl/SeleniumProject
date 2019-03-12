package testPackage;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Feb27 {
	
	WebDriver driver;
	
	@Test
	public void loginBrowser() throws IOException, AWTException{
		
		//load the object repository file where the properties are defined
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Rajesh\\workspace\\FBTest\\config.properties");
		properties.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		System.out.println("Invoking the url");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();		
		
		driver.findElement(By.id("email")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		
		Robot robot = new Robot();  //Robot class is from Java library to handle OS Pop-ups coming in web applications
		robot.keyPress(KeyEvent.VK_TAB); //clicks TAB button
		robot.keyPress(KeyEvent.VK_TAB); //clicks TAB button
		robot.keyPress(KeyEvent.VK_ENTER); //clicks ENTER button and then navigates to homepage of application
		
		
  /*
		driver.get("file://C:/Users/Rajesh/Downloads/iframe.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("uname_01"));
		Actions builder = new Actions(driver);
		Action act = builder.click(element).keyDown(Keys.SHIFT).sendKeys("Rajesh").contextClick().build(); //clicks username field
        act.perform();       
		
	*/
		
	}

}
