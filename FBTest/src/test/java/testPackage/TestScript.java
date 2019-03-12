package testPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestScript{

public static void main(String[] args) {
		
	    WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		System.out.println("Invoking the url");
		//driver.get("https://www.easemytrip.com");
		driver.get("file://C:/Users/Rajesh/Downloads/iframe.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("a")).sendKeys("Rajesh");
		System.out.println("Username is entered");
		driver.findElement(By.name("b")).sendKeys("R123");
		System.out.println("Password is entered");
		driver.findElement(By.name("c")).click();
		Alert alert = driver.switchTo().alert();
	    System.out.println("Alert message displayed is "+alert.getText());	
		alert.accept();
		
		
		driver.switchTo().frame("iframe_b"); //switching to iframe present in web page
		
		//we can switch between iframes in case many iframes present using index, iframe name or by an unique element present in iframe
		
		System.out.println("switched to iframe"); 
		
		driver.findElement(By.name("a")).sendKeys("frameUser");
		System.out.println("Frame username is entered");
		driver.findElement(By.name("b")).sendKeys("framepwd");
		System.out.println("Frame password is entered");
		
		//List<WebElement>radio = driver.findElements(By.tagName("Radio Buttons"));
	  
		driver.findElement(By.id("button-3")).click();
		System.out.println("Radio button is clicked");
		
		Select selectctry = new Select(driver.findElement(By.name("country")));
		selectctry.selectByIndex(3);
		System.out.println("Country is selected");
		
		driver.findElement(By.name("c")).click();
		
		driver.switchTo().defaultContent(); //switching back to parent web page from iframe
		System.out.println("Switching back to parent page");
		
		System.out.println("Title of the invoked url is "+ driver.getTitle());
		
		driver.findElement(By.name("a")).clear();
		driver.findElement(By.name("a")).sendKeys("Sundar");
		System.out.println("Username2 is entered");
		
		driver.findElement(By.name("a")).clear();
		driver.findElement(By.name("b")).sendKeys("pwd");
		System.out.println("Password2 is entered");
		
		/*Select selectmon = new Select(driver.findElement(By.id("month")));
		selectmon.selectByIndex(1);
		
		Select selectyear = new Select(driver.findElement(By.name("birthday_year")));
		selectyear.selectByValue("1992");
		*/
		
		/*
		driver.findElement(By.xpath("//*[@class='src_btn']")).click();
		Alert alert= driver.switchTo().alert();
		alert.getText();
		alert.accept();
        */
		
		driver.close();
		System.out.println("Browser has been closed");
		
	}

}


