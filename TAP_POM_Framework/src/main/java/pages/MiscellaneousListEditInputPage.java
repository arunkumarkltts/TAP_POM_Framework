package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousListEditInputPage extends TapWrappers{

	public MiscellaneousListEditInputPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousListEditInput.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Edit Input");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousListEditInput.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousListEditInput.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousListEditInput.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousListEditInput.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousListEditInput.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousListEditInput.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousListEditInput.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousListEditInput.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousListEditInput.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousListEditInputPage enterInputName(String data){
	    	String inputName = prop.getProperty("MiscellaneousListEditInput.InputName.Name");
		enterByName(inputName, data);
		return this;		
	}

	public MiscellaneousListEditInputPage enterIconName(String data){
	    	String iconName = prop.getProperty("MiscellaneousListEditInput.IconName.Name");
		enterByName(iconName, data);
		return this;		
	}

	public MiscellaneousListEditInputPage enterToolTip(String data){
	    	String toolTip = prop.getProperty("MiscellaneousListEditInput.ToolTip.Name");
		enterByName(toolTip, data);
		return this;		
	}

	public MiscellaneousListInputsPage clickCancel(){
	    	String cancelButton = prop.getProperty("MiscellaneousListEditInput.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return new MiscellaneousListInputsPage(driver, test);		
	}

	public MiscellaneousListEditInputPage clickUpdateInput(){
	    	String submitButton = prop.getProperty("MiscellaneousListEditInput.SubmitButton.Xpath");
		clickByXpath(submitButton);
		return this;		
	}

	public MiscellaneousListEditInputPage verifyUpdateInputStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousListEditInput.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "has been added");
		return this;		
	}

	public MiscellaneousListInputsPage clickClosePopup(){
	    	String closePopup = prop.getProperty("MiscellaneousListEditInput.VerificationPopupCloseButton.Xpath");
		clickByXpath(closePopup);
		return new MiscellaneousListInputsPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousListEditInput.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
