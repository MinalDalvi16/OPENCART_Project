package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	
	
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Locators
	
	@FindBy(xpath="//input[@name=\"firstname\"]") WebElement FirstName;
	@FindBy(xpath="//input[@name=\"lastname\"]") WebElement LastName;
	@FindBy(xpath="//input[@name=\"email\"]") WebElement Email;
	@FindBy(xpath="//input[@name='telephone']") WebElement telephone;


	@FindBy(xpath="//input[@name=\"password\"]") WebElement Password;
	
	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txtConfirmPassword;

	
	@FindBy(xpath="//input[@name='agree']") WebElement agree;
	
	
	@FindBy(xpath="//input[@value='Continue']") WebElement Continue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	
	
	//action method
	
	public void setFirstName(String Fname) {
		FirstName.sendKeys(Fname);
	}
	
public void setLastName(String Lname) {
	LastName.sendKeys(Lname);
	}

public void setEmail(String email) {
	Email.sendKeys(email);
    }

public void settelephone(String tel) {
	telephone.sendKeys(tel);
    }


public void setPassword(String pwd) {
	
	Password.sendKeys(pwd);
	}

public void setConfirmPassword(String pwd) {
	txtConfirmPassword.sendKeys(pwd);
   }


public void clickAgree() {
	agree.click();
   }

public void clickContinueButton() {
	Continue.click();
   }

public String getConfirmationMsg() {
	try {
		return (msgConfirmation.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}

	

}
}



	
	
	
	
	


