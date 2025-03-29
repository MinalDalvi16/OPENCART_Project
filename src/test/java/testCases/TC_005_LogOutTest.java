package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogOut_Button;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_005_LogOutTest extends BaseClass{
	
	@Test(dependsOnMethods = "testCases.LoginTest_02.verify_login")
	
	public void verify_LogOutTest() {
		
		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("dalvi.minal16@gmail.com");
		lp.setPassword("Test@1998");
		lp.clickLogin();
		
		LogOut_Button button =new LogOut_Button(driver);
		button.ClickLogout();
		
	}
	

}
