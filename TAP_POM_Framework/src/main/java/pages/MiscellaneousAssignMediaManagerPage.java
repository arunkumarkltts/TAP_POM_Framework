package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousAssignMediaManagerPage extends TapWrappers{

	public MiscellaneousAssignMediaManagerPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousAssignMediaManager.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Assignment Media Manager To Airlines");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousAssignMediaManager.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousAssignMediaManager.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousAssignMediaManager.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousAssignMediaManager.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousAssignMediaManager.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousAssignMediaManager.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousAssignMediaManager.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousAssignMediaManager.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousAssignMediaManager.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousAssignMediaManagerPage selectMediaManager(String data){
	    	String mediaManager = prop.getProperty("MiscellaneousAssignMediaManager.MediaManagerDropDown.Xpath");
		selectVisibileTextByXPath(mediaManager, data);
		return this;		
	}

	public MiscellaneousAssignMediaManagerPage selectAirlines(String data){
	    	String airlines = prop.getProperty("MiscellaneousAssignMediaManager.AirlinesDropDown.Xpath");
		selectVisibileTextByXPath(airlines, data);
		return this;		
	}

	public MiscellaneousAssignMediaManagerPage clickAssignMM(){
	    	String assignMM = prop.getProperty("MiscellaneousAssignMediaManager.AssignMMButton.Xpath");
		clickByXpath(assignMM);
		return this;		
	}

	public MiscellaneousAssignMediaManagerPage verifyMediaManagerAssignmentStatus(){
	    	String mediaManagerAssignmentStatus = prop.getProperty("MiscellaneousAssignMediaManager.VerifySubmit.Xpath");
		verifyTextContainsByXpath(mediaManagerAssignmentStatus, "Successfully Media manager assignment to airlines");
		return this;		
	}

	public MiscellaneousAssignMediaManagerPage clickOkButton(){
	    	String okButton = prop.getProperty("MiscellaneousAssignMediaManager.VerificationPopupOkButton.Xpath");
		clickByXpath(okButton);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousAssignMediaManager.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
