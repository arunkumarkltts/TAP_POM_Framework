package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class CompaniesPage extends TapWrappers{

	public CompaniesPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Companies.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Companies");

	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("Companies.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("Companies.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("Companies.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("Companies.Companies.LinkText");
		clickByLinkText(companies);
		return this;		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("Companies.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("Companies.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("Companies.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("Companies.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("Companies.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public CompaniesPage clickDownloadActiveCompaniesList(){
	    	String download = prop.getProperty("Companies.DownloadActiveCompaniesList.LinkText");
		clickByLinkText(download);
		return this;		
	}

	public CompaniesPage verifyDownloadActiveCompaniesList(){
	    	String home = System.getProperty("user.home");
		verifyFileExists(home+"\\Downloads\\TAP_active_companies.csv");
		return this;		
	}

	public CompaniesPage clickJumpToInactive(){
	    	String jumpToInactive = prop.getProperty("Companies.JumpToInactive.LinkText");
		clickByPartialLinkText(jumpToInactive);
		return this;		
	}

	public CompaniesPage enterActiveSearch(String data){
	    	String activeSearch = prop.getProperty("Companies.ActiveSearch.Xpath");
		enterByXpath(activeSearch, data);
		return this;		
	}

	public CompaniesPage clickClearActiveSearch(){
	    	String clearActiveSearch = prop.getProperty("Companies.ClearActiveSearch.Xpath");
		clickByXpath(clearActiveSearch);
		return this;		
	}

	public CompaniesPage clickJumpToActive(){
	    	String jumpToActive = prop.getProperty("Companies.JumpToActive.LinkText");
		clickByPartialLinkText(jumpToActive);
		return this;		
	}

	public CompaniesPage enterInactiveSearch(String data){
	    	String inactiveSearch = prop.getProperty("Companies.InactiveSearch.Xpath");
		enterByXpath(inactiveSearch, data);
		return this;		
	}

	public CompaniesPage clickClearInactiveSearch(){
	    	String clearInactiveSearch = prop.getProperty("Companies.ClearInactiveSearch.Xpath");
		clickByXpath(clearInactiveSearch);
		return this;		
	}

	public CompanyPage clickActiveCompanyName(String row){
	    	String companyName = getTextByXpath("//table[@id='companies-active']/tbody/tr["+row+"]/td[2]/a");
		clickByXpath("//table[@id='companies-active']/tbody/tr["+row+"]/td[2]/a");
		return new CompanyPage(driver, test, companyName);		
	}

	public CompaniesPage clickActiveCompanyActions(String row){
		clickByXpath("//table[@id='companies-active']/tbody/tr["+row+"]/td[6]/a");
		return this;		
	}

	public CompanyPage clickInactiveCompanyName(String row){
	    	String companyName = getTextByXpath("//table[@id='companies-inactive']/tbody/tr["+row+"]/td[2]/a");
		clickByXpath("//table[@id='companies-inactive']/tbody/tr["+row+"]/td[2]/a");
		return new CompanyPage(driver, test, companyName);		
	}

	public CompaniesPage clickInactiveCompanyActions(String row){
		clickByXpath("//table[@id='companies-inactive']/tbody/tr["+row+"]/td[6]/a");
		return this;		
	}

	public CompaniesPage verifyActiveCompaniesCount(int count){
	    	String nextButton = prop.getProperty("Companies.ActiveCompaniesNextButton.Xpath");
		int rowCount = getRowCount("//table[@id='companies-active']/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public CompaniesPage verifyInactiveCompaniesCount(int count){
	    	String nextButton = prop.getProperty("Companies.InactiveCompaniesNextButton.Xpath");
		int rowCount = getRowCount("//table[@id='companies-inactive']/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public CompaniesPage verifyActiveCompanyId(String companyID){
		verifyTextByXpath("//table[@id='companies-active']/tbody/tr[1]/td[1]", companyID);
		return this;		
	}

	public CompaniesPage verifyInactiveCompanyId(String companyID){
		verifyTextByXpath("//table[@id='companies-inactive']/tbody/tr[1]/td[1]", companyID);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Companies.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
