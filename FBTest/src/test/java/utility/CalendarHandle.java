package utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CalendarHandle {
	
	/*public static void main(String args[])
	{
	*/
         /* public static WebDriver driver;
	
	public static void Calendar(String dd, String mth){
		 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Opening the browser");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Invoking the url");
		driver.navigate().to("https://www.ksrtc.in");
		driver.manage().window().maximize();
		
		WebElement month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]"));
		WebElement next = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
		
		while(month.getText()!=mth){
			next.click();
			break;
		}
        
		WebElement date = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr/td//a[contains(text(),'"+dd+"')]"));	
        date.click();
		
		//driver.findElement(By.id("txtJourneyDate")).click();
		//driver.findElement(By.xpath("//*[@id='txtJourneyDate']")).click();
		
		
		
		//-> //*[@id="ui-datepicker-div"]//table//tbody//tr//td//a  (Relative xpath of a calendar date)
		//*[@id="ui-datepicker-div"]//table//tbody//tr//td//a
		
		

		
		String mth="March";
        int dd=28;
        
		
				while(month.getText()!=mth)
				{
					if(month.getText().equalsIgnoreCase(mth))
			{
				WebElement date = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr/td//a[contains(text(),'"+dd+"')]"));
				date.click();
				break;
			}
			
			else
			{
				next.click();
				WebElement date = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr/td//a[contains(text(),'"+dd+"')]"));
				date.click();
			}
				
				}
				
				
				
		while(true)
		{
			if(month.getText().equalsIgnoreCase(mth))
			{
				WebElement date = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr/td//a[contains(text(),'"+dd+"')]"));
				date.click();
				break;
			}
			
			else
			{
				next.click();
				
				WebElement date = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr/td//a[contains(text(),'"+dd+"')]"));	
		        date.click();
			}
		}
				
		
		
		//WebElement 
		//*[@id="ui-datepicker-div"]/table/tbody/tr[4]/td[2]/a
					
			
	}*/

	
	   /*  main method starts: to check the calendarHandle utility as a individual component
	    
	  public static void main (String[] args){
      	
      	CalendarHandle.Calendar("18", "March");
      }
      
      main method end:
      */
	
	static WebElement element;

	@FindBy(how=How.XPATH,using= "//*[@id='txtJourneyDate']")
	public WebElement onward_Journey;
	
	@FindBy(how=How.XPATH,using= "//*[@id='ui-datepicker-div']/div/div/span[1]")
	public WebElement month;
	

	@FindBy(how=How.XPATH,using= "//*[@id='ui-datepicker-div']/div/a[2]/span")
	public WebElement next;
	
	
	@FindBy(how=How.XPATH,using= "//div[@id='ui-datepicker-div']//table//tbody//tr//td//a[contains(text(),'4')]")
	public WebElement date;
		
	public WebElement selectDate(WebDriver driver,int dd)
			
	{//	System.out.println("//div[@id='ui-datepicker-div']//table//tbody//tr//td//a[contains(text(),'"+dd+"')]");
		 
element=driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//tbody//tr//td//a[contains(text(),'"+dd+"')]"));
	    return element;
       			
	}

	public WebElement clickSearch(WebDriver driver){
		
		element= driver.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button"));
		
		return element;
	}
	
	
	
}


