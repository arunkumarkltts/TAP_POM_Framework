package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousDeleteDevicePage extends TapWrappers{

	public MiscellaneousDeleteDevicePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousDeleteDevice.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Delete Device");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousDeleteDevice.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousDeleteDevice.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousDeleteDevice.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousDeleteDevice.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousDeleteDevice.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousDeleteDevice.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousDeleteDevice.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousDeleteDevice.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousDeleteDevice.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousDeleteDevicePage enterSearch(String data){
	    	String search = prop.getProperty("MiscellaneousDeleteDevice.Search.Xpath");
		enterByXpath(search, data);
		return this;		
	}

	public MiscellaneousDeleteDevicePage clickClearSearch(){
	    	String clearSearch = prop.getProperty("MiscellaneousDeleteDevice.ClearSearch.Xpath");
		clickByXpath(clearSearch);
		return this;		
	}

	public MiscellaneousDeleteDevicePage clickActionsDelete(String row){
		clickByXpath("//table[@id='device-inactive']/tbody/tr["+row+"]/td[5]/a");
		return this;		
	}

	public MiscellaneousDeleteDevicePage clickContinue(){
	    	acceptAlert();
		return this;
	}

	public MiscellaneousDeleteDevicePage clickCancel(){
	    	dismissAlert();
		return this;
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousDeleteDevice.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
