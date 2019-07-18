package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class HomePage extends TapWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Home.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Dashboard");

	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("Home.AddNewApplication.LinkText");
		clickByLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("Home.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("Home.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("Home.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("Home.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("Home.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public MyAppsPage clickMyApps(){
	    	String myApps = prop.getProperty("Home.MyApps.LinkText");
		clickByLinkText(myApps);
		return new MyAppsPage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("Home.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("Home.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public HomePage clickFilterColumns(){
	    	String filterColumns = prop.getProperty("Home.FilterColumns.LinkText");
		clickByLinkText(filterColumns);
		return this;		
	}

	public HomePage clickDownloadActiveApplications(){
	    	String downloadActiveApps = prop.getProperty("Home.DownloadActiveApplications.LinkText");
		clickByLinkText(downloadActiveApps);
		return this;		
	}

	public HomePage clickJumpToInactive(){
	    	String jumpToInactive = prop.getProperty("Home.JumpToInactive.LinkText");
		clickByLinkText(jumpToInactive);
		return this;		
	}

	public HomePage enterActiveSearch(String data){
	    	String activeSearch = prop.getProperty("Home.ActiveSearch.Xpath");
		enterByXpath(activeSearch, data);
		return this;		
	}

	public HomePage clickClearActiveSearch(){
	    	String clearActiveSearch = prop.getProperty("Home.ActiveSearchClear.Xpath");
		clickByXpath(clearActiveSearch);
		return this;		
	}

	public HomePage clickJumpToActive(){
	    	String jumpToActive = prop.getProperty("Home.JumpToActive.LinkText");
		clickByLinkText(jumpToActive);
		return this;		
	}

	public HomePage enterInactiveSearch(String data){
	    	String inactiveSearch = prop.getProperty("Home.InactiveSearch.Xpath");
		enterByXpath(inactiveSearch, data);
		return this;		
	}

	public HomePage clickClearInactiveSearch(){
	    	String clearInactiveSearch = prop.getProperty("Home.InactiveSearchClear.Xpath");
		clickByXpath(clearInactiveSearch);
		return this;		
	}

	public OpeningPage clickLogOff(){
		clickByLinkText("Log Off");
		return new OpeningPage(driver, test);		
	
	}

}



























