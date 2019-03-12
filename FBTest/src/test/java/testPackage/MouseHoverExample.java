package testPackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverExample {

	@Test
	public void mouseHoverExample(){
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");
		driver=new ChromeDriver();
		System.out.println("Invoking the url");
		//driver.get("https://www.easemytrip.com");
		driver.get("file://C:/Users/Rajesh/Downloads/iframe.html");
		driver.manage().window().maximize();
		
		//hover over mouse operations start
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Festival')]"));
		WebElement data = driver.findElement(By.xpath("//a[contains(text(),'Pongal')]"));
		//WebElement element = driver.findElement(By.xpath("//*[@class='dropbtn']"));
		//WebElement data = driver.findElement(By.linkText("Pongal"));
		data.click();
		
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action act = builder.moveToElement(element).build();
		//Action act = builder.moveToElement(element).moveToElement(data).click().build();
		act.perform();
		//hover over mouse operations end
		
		//double click operation start
		/*
		WebElement element = driver.findElement(By.id("dblClkButton_01"));
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action act =  builder.doubleClick(element).build();
		System.out.println();
		act.perform();
		
		Alert alert = driver.switchTo().alert();
	    System.out.println("Alert message displayed is "+alert.getText());	
		alert.accept();
		*/
		//double click operation end
	}
}
