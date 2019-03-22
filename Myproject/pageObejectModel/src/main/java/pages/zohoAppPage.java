package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;
import crm.CRMHomePage;

public class zohoAppPage extends Page {
	
	public void goToCalender()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[1]/div/a/div")).click();
	}
	public void goToCliq()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[2]/div/a/div")).click();
	}
	public void goToConnect()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[3]/div/a/div")).click();
	}
	public CRMHomePage goToCRM()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[4]/div/a/div")).click();
		return new CRMHomePage();
	}
	public void goToDesk()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[5]/div/a/div")).click();
	}
	public void goToMail()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[6]/div/a/div")).click();
	}
	public void goToMeeting()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/div")).click();
	}
	public void goToPeople()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[8]/div/a/div")).click();
	}

	public void goToSalesIQ()
	{
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[9]/div/a/div")).click();
	}
}
