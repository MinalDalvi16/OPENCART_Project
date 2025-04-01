package testCases;

import org.testng.annotations.Test;

import pageObjects.Search_module;
import testBase.BaseClass;

public class TC_007_Verify_search_funtionality extends BaseClass {
	
	
	
	@Test
	
	public void SearchFuntionality() {
		
		Search_module sear= new Search_module(driver);
		
		sear.typesearch();
		
		sear.click_btn();
		
	}

}
