package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.Page;
import crm.CRMHomePage;
import crmAccounts.CreateAccountPage;
import crmAccounts.crmAccountPages;
import pages.HomePage;
import pages.LoginPage;
import pages.zohoAppPage;

public class LoginTest{

	public static void main(String[] args) {
		
		HomePage home=new HomePage();
		LoginPage lp=home.goToLogin();
		zohoAppPage zp=lp.doLogin("ganesh.achari0@gmail.com", "gva_9341036521");
		zp.goToCRM();
		crmAccountPages account=Page.menu.gotoAccounts();
		CreateAccountPage cap=account.gotoCreateAccounts();
		cap.createAccount("Ganesh");
		
		
	}

}
