package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class LoginTest_02 extends BaseClass {
	
	
	
	@Test 
	
	public void verify_login() {
		
		
		logger.info("***********Strating TC_02 Login Test************");
		
		//home page
		try {
		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		hp.clickLogin();
		
		
		
		//login page
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("dalvi.minal16@gmail.com");
		lp.setPassword("Test@1998");
		lp.clickLogin();
		logger.info("clicked on ligin button..");
		
		
		//my account page
		MyAccountPage page = new MyAccountPage(driver);
		boolean targetpage=page.isMyAccountExists();
		
		
		Assert.assertEquals(targetpage, true,"Login failed");
		}
	catch(Exception e)
	{
		Assert.fail();
	}
	
	logger.info("**** Finished TC_002_LoginTest  ****");

				

	}
	
	
	

}
