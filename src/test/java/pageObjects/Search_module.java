package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_module extends BasePage {

	public Search_module(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	
	@FindBy(xpath="//input[@name='search']") WebElement search;
	@FindBy(xpath="//i[@class='fa fa-search']") WebElement search_but;
	
	
	
	
	//action method 
	
	public void typesearch() {
		search.sendKeys("iphone");
	}
	
	public void click_btn() {
		search_but.click();
	}
	
	

}
