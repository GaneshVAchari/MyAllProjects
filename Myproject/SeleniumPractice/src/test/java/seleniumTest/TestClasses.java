package seleniumTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import javax.sql.rowset.WebRowSet;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClasses extends BaseClass{
	
	
	/*WebDriver driver= null;
	

	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://shop.thetestingworld.com/index.php?");
	}
	@Test
	public void searchAndAddToCart() throws IOException
	{
		driver.findElement(By.xpath(getData(0,1))).sendKeys(getData(0,2));
		driver.findElement(By.xpath(getData(1,1))).click();
		driver.findElement(By.xpath(getData(2,1))).click();
		driver.findElement(By.xpath(getData(3,1))).click();
		driver.findElement(By.xpath(getData(4,1))).click();
		driver.findElement(By.xpath(getData(5,1))).click();
		driver.findElement(By.xpath(getData(6,1))).click();
		driver.findElement(By.xpath(getData(7,1))).sendKeys(getData(7,2));
		driver.findElement(By.xpath(getData(8,1))).sendKeys(getData(8,2));
	}
	
	@Test
	public void BrowserCLose()
	{
		driver.close();
	}*/
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://erp.globallogic.com/OA_HTML/AppsLocalLogin.jsp");
	driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("ganesh.achari");
	driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("Vasu@1989");
	driver.findElement(By.xpath("//*[@id=\"ButtonBox\"]/button[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[3]/form/span[2]/div[3]/div/div[1]/div/div[3]/div[1]/div[2]/table[2]/tbody/tr/td/div/table/tbody/tr/td[1]/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/ul/li[1]/a/div[1]/img[1]")).click();
	driver.findElement(By.xpath("/html/body/div[3]/form/span[2]/div[3]/div/div[1]/div/div[3]/div[1]/div[2]/table[2]/tbody/tr/td/div/table/tbody/tr/td[1]/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/ul/li[1]/ul/li[11]/a/div[2]")).click();
	driver.findElement(By.xpath("/html/body/div[3]/form/span[2]/div[3]/div/div[1]/div/div[3]/div[1]/div[2]/table[2]/tbody/tr/td/div/table/tbody/tr/td[1]/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/ul/li[1]/ul/li[11]/ul/li[2]/a/div[2]")).click();
	
	}
}
