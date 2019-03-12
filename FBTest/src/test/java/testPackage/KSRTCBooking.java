package testPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.CalendarHandle;

public class KSRTCBooking {
	
	/*WebDriver driver;
	
	Properties properties;
	FileInputStream fis;
	
	@BeforeMethod
	public void invokeBrowserAndURL() throws IOException{
		
		//load the object repository file where the properties are defined
			
		        properties = new Properties();
				fis = new FileInputStream("C:\\Users\\Rajesh\\workspace\\FBTest\\config.properties");
				properties.load(fis);
		    
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Invoking the url");
		driver.navigate().to("https://www.ksrtc.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void searchBuses(){
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(properties.getProperty("fromCity"));
		driver.findElement(By.id("toPlaceName")).sendKeys(properties.getProperty("toCity"));
		driver.findElement(By.xpath("//*[@id='txtJourneyDate']")).click();
		CalendarHandle.Calendar("25","March");
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		driver.close();
		System.out.println("Browser has been closed");
	}*/
	
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
	Properties properties;
	FileInputStream fis;
	Robot robot=new Robot();
	 
	//load the object repository file where the properties are defined
	
    properties = new Properties();
	fis = new FileInputStream("C:\\Users\\Rajesh\\workspace\\FBTest\\config.properties");
	properties.load(fis);
	
		// TODO Auto-generated method stub
			String mon="April";
			//int dd=4;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");	 
	    driver.manage().window().maximize();
	    
	    CalendarHandle search= PageFactory.initElements(driver, CalendarHandle.class);
	    
	    driver.findElement(By.id("fromPlaceName")).sendKeys(properties.getProperty("fromCity"));
	    Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("toPlaceName")).sendKeys(properties.getProperty("toCity"));
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);	
		
	    search.onward_Journey.click();
	    
	    System.out.println("First "+search.month.getText());

	    while(true)
	    {	
		
	    	  	if(search.month.getText().equals(mon))
	    {
	    	break;
	    }
	    else
	    {
	    	search.next.click();
	    	System.out.println("Clicked");
	    		    		    	
	    }
	  	    }
	    
	    System.out.println("Second "+search.month.getText());
	  
	     search.selectDate(driver, 4).click();
	   
         search.clickSearch(driver).click();
	}
	
}
