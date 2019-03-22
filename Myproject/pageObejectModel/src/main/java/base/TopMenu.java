package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import crmAccounts.CreateAccountPage;
import crmAccounts.crmAccountPages;

public class TopMenu extends Page{
	
	/*
	  Every page has top menu
	*/
	WebDriver driver;
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	public void gotoHome()
	{
	}
	
	public void gotoLeads()
	{
	}
	public void gotoContacts()
	{
	}
	public crmAccountPages gotoAccounts()
	{
		driver.findElement(By.xpath("/html/body/div[13]/div[11]/div[1]/crm-menu/div[1]/crm-tab/div[2]/div[4]/link-to/a")).click();
		return new crmAccountPages();
	}
	public void gotoDeals()
	{
	}
	public void gotoActivities()
	{
		
	}
	public void gotoReports()
	{
		
	}

	public void gotoSignout()
	{
		driver.findElement(By.xpath("//*[@id=\"topdivuserphoto_3776894000000192015\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"newSettingsDropDown\"]/div[2]/div/div[5]/span")).click();
	}
}
