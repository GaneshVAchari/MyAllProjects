package testCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.zohoAppPage;
import utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void loginTest(Hashtable<String, String> data)
	{
		HomePage home=new HomePage();
		LoginPage lp=home.goToLogin();
		zohoAppPage zp=lp.doLogin(data.get("username"), data.get("password"));
	}
}
