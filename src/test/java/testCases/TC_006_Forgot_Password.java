package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_006_Forgot_Password extends BaseClass {
	
	@Test
	
	public void verify_Forgot_PasswordFuntionality() {
		
		
		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		hp.clickLogin();
		
		ForgotPasswordPage page =new ForgotPasswordPage(driver);
		page.ClickForgottenPassword();
		page.SetEmail("dalvi.minal16@gmail.com");
		page.Clickcontinue();
		
		String alertmes=page.getConfirmationMsg();
		
		Assert.assertEquals(alertmes, "An email with a confirmation link has been sent your email address.");
	}

}
