package testPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	@Test
	public void windowHandles(){
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		System.out.println("Invoking the url");
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='homeloginbtn']")).click();
		
		String parentPage = driver.getWindowHandle();  //storing session id of the main page
		Set <String> childs = driver.getWindowHandles(); //storing all opened windows using set; set stores all unique windows
		
		for(String window:childs){
			
			driver.switchTo().window(window);
		}
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentPage);
		System.out.println(driver.getTitle());
		
		driver.close();
	}
	
}
