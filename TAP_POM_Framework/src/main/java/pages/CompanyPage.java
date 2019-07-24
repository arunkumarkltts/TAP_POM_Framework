package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class CompanyPage extends TapWrappers{

	private String companyName;

	public CompanyPage(RemoteWebDriver driver, ExtentTest test, String companyName){
		this.driver = driver;
		this.test = test;
		this.companyName = companyName;
	    	String pageVerification = prop.getProperty("Company.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, companyName);
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("Company.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("Company.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("Company.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("Company.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("Company.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("Company.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("Company.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("Company.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("Company.MyAccount.LinkText");
    		clickByLinkText(myAccount);
    		return new MyAccountPage(driver, test);		
    	}

	public HomePage clickCompanyApps(){
	    	String companyApps = prop.getProperty("Company.CompanyApps.LinkText");
    		clickByLinkText(companyApps);
    		return new HomePage(driver, test);		
    	}

	public EditCompanyDetailsPage clickEditCompanyDetails(){
	    	String editCompanyDetails = prop.getProperty("Company.EditCompanyDetails.LinkText");
    		clickByLinkText(editCompanyDetails);
    		return new EditCompanyDetailsPage(driver, test, companyName);		
    	}

	public CompanyPage enterSearch(String data){
	    	String search = prop.getProperty("Company.Search.Xpath");
    		enterByXpath(search, data);
    		return this;		
    	}

	public CompanyPage clickClearSearch(){
	    	String clearSearch = prop.getProperty("Company.ClearSearch.Xpath");
    		clickByXpath(clearSearch);
    		return this;		
    	}

	public CompanyPage clickActionsForUser(String row){
    		clickByLinkText("//table[@id='users']/tbody/tr["+row+"]/td[8]/a");
    		return this;		
    	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Companies.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
