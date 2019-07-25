package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousDeleteInputsPage extends TapWrappers{

	public MiscellaneousDeleteInputsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousDeleteInputs.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Delete Inputs");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousDeleteInputs.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousDeleteInputs.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousDeleteInputs.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousDeleteInputs.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousDeleteInputs.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousDeleteInputs.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousDeleteInputs.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousDeleteInputs.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousDeleteInputs.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousDeleteInputsPage enterSearch(String data){
	    	String search = prop.getProperty("MiscellaneousDeleteInputs.Search.Xpath");
		enterByXpath(search, data);
		return this;		
	}

	public MiscellaneousDeleteInputsPage clickClearSearch(){
	    	String clearSearch = prop.getProperty("MiscellaneousDeleteInputs.ClearSearch.Xpath");
		clickByXpath(clearSearch);
		return this;		
	}

	public MiscellaneousDeleteInputsPage clickActionsDelete(String row){
		clickByXpath("//table[@id='input-active']/tbody/tr["+row+"]/td[5]/a");
		return this;		
	}

	public MiscellaneousDeleteInputsPage clickOk(){
	    	acceptAlert();
		return this;
	}

	public MiscellaneousDeleteInputsPage clickCancel(){
	    	dismissAlert();
		return this;
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousDeleteInputs.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
