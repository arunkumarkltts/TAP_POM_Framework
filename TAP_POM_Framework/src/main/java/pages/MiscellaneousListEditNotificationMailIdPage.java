package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousListEditNotificationMailIdPage extends TapWrappers{

	public MiscellaneousListEditNotificationMailIdPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousListEditNotificationMailId.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Edit Notification Mail-id");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousListEditNotificationMailId.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousListEditNotificationMailId.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousListEditNotificationMailId.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousListEditNotificationMailId.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousListEditNotificationMailId.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousListEditNotificationMailId.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousListEditNotificationMailId.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousListEditNotificationMailId.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousListEditNotificationMailId.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousListEditNotificationMailIdPage enterMailId(String data){
	    	String mailId = prop.getProperty("MiscellaneousListEditNotificationMailId.MailId.Xpath");
		enterByXpath(mailId, data);
		return this;		
	}

	public MiscellaneousListNotificationMailIdPage clickCancel(){
	    	String cancelButton = prop.getProperty("MiscellaneousListEditNotificationMailId.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return new MiscellaneousListNotificationMailIdPage(driver, test);		
	}

	public MiscellaneousListEditNotificationMailIdPage clickUpdateMail(){
	    	String submitButton = prop.getProperty("MiscellaneousListEditNotificationMailId.SubmitButton.Xpath");
		clickByXpath(submitButton);
		return this;		
	}

	public MiscellaneousListEditNotificationMailIdPage verifyUpdateMailStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousListEditNotificationMailId.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "has been updated");
		return this;		
	}

	public MiscellaneousListNotificationMailIdPage clickClosePopup(){
	    	String closePopup = prop.getProperty("MiscellaneousListEditNotificationMailId.VerificationPopupCloseButton.Xpath");
		clickByXpath(closePopup);
		return new MiscellaneousListNotificationMailIdPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousListEditNotificationMailId.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
