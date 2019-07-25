package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousAddEditDeleteAndroidVersionPage extends TapWrappers{

	public MiscellaneousAddEditDeleteAndroidVersionPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Add Android versions");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage enterAndroidVersion(String data){
	    	String androidVersion = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.AndroidVersion.Xpath");
		enterByXpath(androidVersion, data);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage enterOrder(String data){
	    	String order = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.Order.Xpath");
		enterByXpath(order, data);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickCancelButton(){
	    	String cancel = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.CancelButton.Xpath");
		clickByXpath(cancel);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickAddVersion(){
	    	String addVersion = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.SubmitButton.Xpath");
		clickByXpath(addVersion);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickUpdateVersion(){
	    	String updateVersion = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.SubmitButton.Xpath");
		clickByXpath(updateVersion);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage enterSearch(String data){
	    	String search = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.Search.Xpath");
		enterByXpath(search, data);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickClearSearch(){
	    	String clearSearch = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.ClearSearch.Xpath");
		clickByXpath(clearSearch);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickUpdate(String row){
		clickByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[4]/a[1]");
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickDelete(String row){
		clickByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[4]/a[2]");
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage verifyAddAndroidVersionStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "Successfully Add New Android Version");
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickPopupOkButton(){
	    	String closePopup = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.VerificationPopupCloseButton.Xpath");
		clickByXpath(closePopup);
		return this;		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clicOk(){
	    	acceptAlert();
		return this;
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickCancel(){
	    	dismissAlert();
		return this;
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousAddEditDeleteAndroidVersion.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
