package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	//click on forgot password link 
	@FindBy(xpath = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']") WebElement ForgottenPassword;	
	
	@FindBy(xpath="//input[@id='input-email']") WebElement EmailAdd;
	
	@FindBy(xpath="//input[@value='Continue']") WebElement Continue;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement EmailSuccessAlert;
	
	//action method 
	
	public void ClickForgottenPassword() {
		ForgottenPassword.click();
	}
	
	public void SetEmail(String email) {
		EmailAdd.sendKeys(email);
	}
	
	public void Clickcontinue() {
		Continue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (EmailSuccessAlert.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	
	
	
	
	}
}
	


