package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class EditCompanyDetailsPage extends TapWrappers{

	private String companyName;

	public EditCompanyDetailsPage(RemoteWebDriver driver, ExtentTest test, String companyName){
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

	public EditCompanyDetailsPage enterBillingAddress1(String data){
	    	String billingAddress1 = prop.getProperty("EditCompany.BillingAddress1.Name");   
    		enterByName(billingAddress1, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterBillingAddress2(String data){
	    	String billingAddress2 = prop.getProperty("EditCompany.BillingAddress2.Name");   
	    	enterByName(billingAddress2, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterCityTown(String data){
	    	String cityTown = prop.getProperty("EditCompany.CityTown.Name");   
	    	enterByName(cityTown, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterState(String data){
	    	String state = prop.getProperty("EditCompany.State.Name");   
	    	enterByName(state, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterPostalCode(String data){
	    	String postalCode = prop.getProperty("EditCompany.PostalCode.Name");   
	    	enterByName(postalCode, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterCountry(String data){
	    	String country = prop.getProperty("EditCompany.Country.Name");   
	    	enterByName(country, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterThalesBillingId(String data){
	    	String thalesBillingId = prop.getProperty("EditCompany.ThalesBillingId.Name");   
	    	enterByName(thalesBillingId, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterBusinessType(String data){
	    	String businessType = prop.getProperty("EditCompany.BusinessType.Name");   
	    	enterByName(businessType, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterTaxpayerId(String data){
	    	String taxpayerId = prop.getProperty("EditCompany.TaxpayerId.Name");   
	    	enterByName(taxpayerId, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterBankName(String data){
	    	String bankName = prop.getProperty("EditCompany.BankName.Name");   
	    	enterByName(bankName, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterAccountNumber(String data){
	    	String accountNumber = prop.getProperty("EditCompany.AccountNumber.Name");   
	    	enterByName(accountNumber, data);
    		return this;		
    	}

	public EditCompanyDetailsPage enterRoutingNumber(String data){
	    	String routingNumber = prop.getProperty("EditCompany.RoutingNumber.Name");   
	    	enterByName(routingNumber, data);
    		return this;		
    	}

	public CompanyPage clickSubmitButton(){
	    	String submitButton = prop.getProperty("EditCompany.SubmitButton.Xpath");   
    		clickByXpath(submitButton);
    		return new CompanyPage(driver, test, companyName);		
    	}

	public EditCompanyDetailsPage enterSearch(String data){
	    	String search = prop.getProperty("EditCompany.Search.Xpath");
    		enterByXpath(search, data);
    		return this;		
    	}

	public EditCompanyDetailsPage clickClearSearch(){
	    	String clearSearch = prop.getProperty("EditCompany.ClearSearch.Xpath");
    		clickByXpath(clearSearch);
    		return this;		
    	}

	public EditCompanyDetailsPage clickActionsForUser(String row){
    		clickByLinkText("//table[@id='users']/tbody/tr["+row+"]/td[8]/a");
    		return this;		
    	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Companies.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
