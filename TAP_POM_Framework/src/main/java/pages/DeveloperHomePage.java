package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class DeveloperHomePage extends TapWrappers{

	public DeveloperHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("DeveloperHome.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "My Apps - Thales Avionics");

	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("DeveloperHome.AddNewApplication.LinkText");
		clickByLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	/*TODO: Need to check the requirements and update the page/class of this method*/
	public DeveloperHomePage clickBrowseApps(){
	    	String mediaManager = prop.getProperty("DeveloperHome.BrowseApps.LinkText");
		clickByLinkText(mediaManager);
		return this;		
	}

	public MyAppsPage clickMyApps(){
	    	String myApps = prop.getProperty("DeveloperHome.MyApps.LinkText");
		clickByLinkText(myApps);
		return new MyAppsPage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("DeveloperHome.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("DeveloperHome.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public DeveloperHomePage enterSearch(String data){
	    	String search = prop.getProperty("DeveloperHome.Search.Xpath");
		enterByXpath(search, data);
		return this;		
	}

	public DeveloperHomePage clickClearSearch(){
	    	String clearSearch = prop.getProperty("DeveloperHome.ClearSearch.Xpath");
	    	clickByXpath(clearSearch);
		return this;
	}

	public NewApplicationPage clickApp(String row){
		clickByXpath("//table[@id=\"orders\"]/tbody/tr["+row+"]/td[2]/a");
		return new NewApplicationPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Home.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}



























