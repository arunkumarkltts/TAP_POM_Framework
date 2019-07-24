package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class UsersPage extends TapWrappers{

	public UsersPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Users.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, " Users");

	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("Users.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("Users.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("Users.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("Users.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("Users.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("Users.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("Users.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("Users.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("Users.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public UsersPage clickDownloadActiveUserList(){
	    	String downloadActiveUserList = prop.getProperty("Users.DownloadActiveUserList.LinkText");
		clickByLinkText(downloadActiveUserList);
		return this;		
	}

	public UsersPage clickJumpToInactive(){
	    	String jumpToInactive = prop.getProperty("Users.JumpToInactive.LinkText");
		clickByPartialLinkText(jumpToInactive);
		return this;		
	}

	public UsersPage enterActiveSearch(String data){
	    	String activeSearch = prop.getProperty("Users.ActiveSearch.Xpath");
		enterByXpath(activeSearch, data);
		return this;		
	}

	public UsersPage clickClearActiveSearch(){
	    	String clearActiveSearch = prop.getProperty("Users.ClearActiveSearch.Xpath");
		clickByXpath(clearActiveSearch);
		return this;		
	}

	public UsersPage clickJumpToActive(){
	    	String jumpToActive = prop.getProperty("Users.JumpToActive.LinkText");
		clickByPartialLinkText(jumpToActive);
		return this;		
	}

	public UsersPage enterInactiveSearch(String data){
	    	String inactiveSearch = prop.getProperty("Users.InactiveSearch.Xpath");
		enterByXpath(inactiveSearch, data);
		return this;		
	}

	public UsersPage clickClearInactiveSearch(){
	    	String clearInactiveSearch = prop.getProperty("Users.ClearInactiveSearch.Xpath");
		clickByXpath(clearInactiveSearch);
		return this;		
	}

	public CompanyPage clickActiveUsersCompanyName(String row){
	    	String companyName = getTextByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[6]/a");
		clickByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[6]/a");
		return new CompanyPage(driver, test, companyName);		
	}

	public UsersPage clickActiveUsersActions(String row){
		clickByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[8]/a");
		return this;		
	}

	public CompanyPage clickInactiveUsersCompanyName(String row){
	    	String companyName = getTextByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[6]/a");
		clickByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[6]/a");
		return new CompanyPage(driver, test, companyName);		
	}

	public UsersPage clickInactiveUsersActions(String row){
		clickByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[8]/a");
		return this;		
	}

	public UsersPage verifyActiveUsersCount(int count){
	    	String nextButton = prop.getProperty("Users.ActiveUsersNextButton.Xpath");
		int rowCount = getRowCount("//table[@id='users-active']/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public UsersPage verifyInactiveUsersCount(int count){
	    	String nextButton = prop.getProperty("Users.InactiveUsersNextButton.Xpath");
		int rowCount = getRowCount("//table[@id='users-inactive']/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public UsersPage verifyActiveUserId(String userId){
		verifyTextByXpath("//table[@id='users-active']/tbody/tr[1]/td[1]", userId);
		return this;		
	}

	public UsersPage verifyInactiveUserId(String userId){
		verifyTextByXpath("//table[@id='users-inactive']/tbody/tr[1]/td[1]", userId);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Users.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
