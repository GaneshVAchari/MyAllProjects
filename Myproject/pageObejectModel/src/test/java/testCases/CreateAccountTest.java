package testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import crmAccounts.CreateAccountPage;
import crmAccounts.crmAccountPages;
import pages.zohoAppPage;
import utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String, String> data) {
		zohoAppPage zp=new zohoAppPage();
		zp.goToCRM();
		crmAccountPages account=Page.menu.gotoAccounts();
		CreateAccountPage cap=account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		
	}

}
