package crmAccounts;

import org.openqa.selenium.By;

import base.Page;

public class crmAccountPages extends Page {
	
	public CreateAccountPage gotoCreateAccounts()
	{
		driver.findElement(By.xpath("/html/body/div[13]/div[13]/crm-begin-page/crm-accounts-blankpage/div/div/div/div/div[1]/div/div/link-to[1]/lyte-button/button")).click();
		return new CreateAccountPage();
	}
	
	public void gotoImportAccount()
	{
		
	}

}
