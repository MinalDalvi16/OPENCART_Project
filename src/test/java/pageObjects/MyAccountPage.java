package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//locator
	
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement MyAccount;
	
	@FindBy(xpath="(//a[@class='list-group-item'][normalize-space()='Logout'])[1]") WebElement Logout;
	
	public boolean isMyAccountExists() {
		try {
		return (MyAccount.isDisplayed());
	}
		catch(Exception e){
			return false;
		}
	}
		
		public void clicklogout() {
			Logout.click();
		}
		
		
	
}


