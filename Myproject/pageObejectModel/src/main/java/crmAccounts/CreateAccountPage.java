package crmAccounts;

import org.openqa.selenium.By;

import base.Page;

public class CreateAccountPage extends Page{
	
	public void createAccount(String accountName)
	{
		driver.findElement(By.xpath("//*[@id=\"Crm_Accounts_ACCOUNTNAME\"]")).sendKeys(accountName);
	}

}
