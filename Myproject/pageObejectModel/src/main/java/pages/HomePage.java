package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class HomePage extends Page{
	
	public void goToCustomers()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).click();
	}
	
	public void goToSupport()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
	}
	public void goToCustomerSales()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[3]")).click();
	}
	public LoginPage goToLogin()
	{
		click("loginlink_XPATH");
		return new LoginPage();
	}
	public void goToSignUp()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[5]")).click();
	}
	
}
