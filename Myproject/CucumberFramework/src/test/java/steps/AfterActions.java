package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utilities.SeleniumDriver;

public class AfterActions {

	@After
	public static void tearDown(Scenario scenario) throws IOException
	{
		WebDriver driver= SeleniumDriver.getDriver();
		
		if(scenario.isFailed())
		{
			byte[] screenshotBytes =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "image/png");
			//File screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(screenshot, new File("C:\\Users\\ganesh.achari\\eclipse-workspace\\CucumberFramework\\target\\"+scenario.getName()+".png"));
		}
		SeleniumDriver.tearDown();
	}
}
