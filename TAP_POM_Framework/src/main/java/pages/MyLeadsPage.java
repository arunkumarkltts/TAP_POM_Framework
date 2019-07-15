package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MyLeadsPage extends TapWrappers{

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This in not My Leads Page", "FAIL");
		}		
	}
	
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage(driver, test);
	}
	
	public FindLeadsPage clickFindLeads(){
		clickByLink("Find Leads");
		return new FindLeadsPage(driver, test);
	}

	public MergeLeadsPage clickMergeLeads(){
		clickByLink("Merge Leads");
		return new MergeLeadsPage(driver, test);
	}
}