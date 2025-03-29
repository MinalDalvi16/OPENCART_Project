package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOut_Button extends  BasePage {

	public LogOut_Button(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//locator 
	@FindBy(xpath = "(//a[@class='list-group-item'][normalize-space()='Logout'])[1]")
	WebElement Logout_button;
	
	
	//action method
	
	public void ClickLogout() {
		Logout_button.click();
		
	}
	

}
