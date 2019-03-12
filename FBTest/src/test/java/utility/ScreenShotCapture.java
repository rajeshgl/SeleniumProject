package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotCapture {
	
	//creating a method getScreenshot and passing two parameters
	//driver and screenshotName
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception{
		
		//below line is just to append the date format with the screenshot name to avoid duplicate names
		
		String dateName = new SimpleDateFormat("yyyyMMdhhmmss").format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//after execution, you could see a folder "FailedTestScreenshots" under src folder
		
		String destination = System.getProperty("user.dir")+"//FailedTestScreenshots//"+screenshotName+dateName+".png";
				
		File finalDestination = new File(destination);		
		
		//FileUtils.copyFile(source, finalDestination);
		
		FileHandler.copy(source,finalDestination);

		
		//returns the captured file path
		
		return destination;
		
	}

}
