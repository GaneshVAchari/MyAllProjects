package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class LoginPage extends Page{
	
	public zohoAppPage doLogin(String username, String password)
	{
		type("email_XPATH",username);
		type("password_XPATH",password);
		click("signbtn_XPATH");
		click("close_button_XPATH");
		return new zohoAppPage();
	}

	public void doSigninwithGoogle() {
		
	}
	
	public void forgotPwd()
	{
		
	}
	
	public void dosignUpNow()
	{
		
	}
}
