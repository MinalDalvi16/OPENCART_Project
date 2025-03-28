package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	//constructor
	public HomePage (WebDriver driver) {
		
		super(driver);
		
	}
	
	//locator
	
	@FindBy(xpath="//span[text()='My Account']")WebElement MyAccount;
	@FindBy(xpath="//a[normalize-space()='Register']")WebElement Register;
	@FindBy(xpath="//a[text()='Login']")WebElement Login;

	
	//action method
	
	public void ClickMyAccount() {
		
		MyAccount.click();
	}
	
	
	public void ClickRegister() {
		
		Register.click();

	}
	
	public void ClickLogin() {
		Login.click();
	}
	
	public void clickLogin()    // added in step5
	{
		Login.click();
	}
	

	
	
}
