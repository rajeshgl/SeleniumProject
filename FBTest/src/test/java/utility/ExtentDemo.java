package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {
	
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeTest
	public static void startTest(){
		
		System.out.println(System.getProperty("user.dir")); //user.dir is given so that extent report gets generated in user directory in project itself
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html",true);
		test = report.startTest("ExtentDemo");
	}
	
	@Test
	public void extentReportsDemo() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Facebook – log in or sign up1"))
		{
		   test.log(LogStatus.PASS, "Test Passed successfully");
		}
		
		else
		{
			
			test.log(LogStatus.FAIL,test.addScreenCapture(ScreenShotCapture.getScreenshot(driver,"failed"))+"Test Failed");
			
			//test.log(LogStatus.FAIL,"Test Failed");
		}
	}
	
	@AfterTest
	public static void endTest(){
		
		report.endTest(test);
		report.flush();
	}

}
