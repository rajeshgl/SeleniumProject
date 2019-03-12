package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarInWebPage {

	WebDriver driver;
	
	@Test
	public void testCalendar(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Invoking the url");
		driver.navigate().to("https://www.ksrtc.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtJourneyDate")).click();
		
		WebElement month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]"));
		
		//-> //*[@id="ui-datepicker-div"]//table//tbody//tr//td//a  (Relative xpath of a calendar date)
		//*[@id="ui-datepicker-div"]//table//tbody//tr//td//a
		
		WebElement next = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
		
		String mth = "March";
				while(month.getText()!=mth){
					next.click();
					break;
				}
		WebElement date = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[2]/a"));	
	
		//WebElement 
        date.click();				
			
	}
}
