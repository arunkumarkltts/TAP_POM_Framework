package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousAddNewInputPage extends TapWrappers{

	public MiscellaneousAddNewInputPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousAddNewInput.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "New Input");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousAddNewInput.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousAddNewInput.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousAddNewInput.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousAddNewInput.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousAddNewInput.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousAddNewInput.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousAddNewInput.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousAddNewInput.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousAddNewInput.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousAddNewInputPage enterInputName(String data){
	    	String deviceName = prop.getProperty("MiscellaneousAddNewInput.DeviceName.Name");
		enterByName(deviceName, data);
		return this;		
	}

	public MiscellaneousAddNewInputPage enterIconName(String data){
	    	String iconName = prop.getProperty("MiscellaneousAddNewInput.IconName.Name");
		enterByName(iconName, data);
		return this;		
	}

	public MiscellaneousAddNewInputPage enterToolTip(String data){
	    	String toolTip = prop.getProperty("MiscellaneousAddNewInput.ToolTip.Name");
		enterByName(toolTip, data);
		return this;		
	}

	public MiscellaneousPage clickCancel(){
	    	String cancelButton = prop.getProperty("MiscellaneousAddNewInput.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return new MiscellaneousPage(driver, test);		
	}

	public MiscellaneousAddNewInputPage clickAddNewInput(){
	    	String submitButton = prop.getProperty("MiscellaneousAddNewInput.SubmitButton.Xpath");
		clickByXpath(submitButton);
		return this;		
	}

	public MiscellaneousAddNewInputPage verifyAddNewInputStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousAddNewInput.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "has been added");
		return this;		
	}

	public MiscellaneousListInputsPage clickClosePopup(){
	    	String closePopup = prop.getProperty("MiscellaneousAddNewInput.VerificationPopupCloseButton.Xpath");
		clickByXpath(closePopup);
		return new MiscellaneousListInputsPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousAddNewInput.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
