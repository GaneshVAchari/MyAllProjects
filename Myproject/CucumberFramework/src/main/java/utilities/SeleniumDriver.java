package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	
	//Initialize webdrive
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIMEOUT=50;
	
	
	private SeleniumDriver()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ganesh.achari\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\executables\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		waitDriver=new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	public  static void openPage(String url)
	{
		driver.get(url);
	}
	
    public static WebDriver getDriver()
    {
    	return driver;
    }
    
    public static void setUpDriver()
    {
    	if(seleniumDriver==null)
    	{
    		seleniumDriver=new SeleniumDriver();
    	}
    }
    
    public static void tearDown()
    {
    	if(driver != null)
    	{
    		driver.quit();
    	}
    	seleniumDriver=null;
    }
}
