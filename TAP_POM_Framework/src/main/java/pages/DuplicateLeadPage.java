package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class DuplicateLeadPage extends TapWrappers{

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This in not Duplicate Lead Page", "FAIL");
		}		
	}
	
	public ViewLeadPage clickCreateLead(){
		clickByName("submitButton");	
		return new ViewLeadPage(driver, test);
	}

}

















