package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousAddingCompanyToAirlinesPage extends TapWrappers{

	public MiscellaneousAddingCompanyToAirlinesPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousAddingCompanyToAirlines.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Adding company to Airlines");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousAddingCompanyToAirlines.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousAddingCompanyToAirlines.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousAddingCompanyToAirlines.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousAddingCompanyToAirlines.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousAddingCompanyToAirlines.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousAddingCompanyToAirlines.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousAddingCompanyToAirlines.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousAddingCompanyToAirlines.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousAddingCompanyToAirlines.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousAddingCompanyToAirlinesPage selectCompany(String data){
	    	String company = prop.getProperty("MiscellaneousAddingCompanyToAirlines.CompanyDropDown.Xpath");
		selectVisibileTextByXPath(company, data);
		return this;		
	}

	public MiscellaneousAddingCompanyToAirlinesPage clickCancelButton(){
	    	String cancel = prop.getProperty("MiscellaneousAddingCompanyToAirlines.CancelButton.Xpath");
		clickByXpath(cancel);
		return this;		
	}

	public MiscellaneousAddingCompanyToAirlinesPage clickAddAirlinesButton(){
	    	String submit = prop.getProperty("MiscellaneousAddingCompanyToAirlines.SubmitButton.Xpath");
		clickByXpath(submit);
		return this;		
	}

	public MiscellaneousAddingCompanyToAirlinesPage verifyAddAirlineStatus(){
	    	String addAirlineStatus = prop.getProperty("MiscellaneousAddingCompanyToAirlines.VerifySubmit.Xpath");
		verifyTextContainsByXpath(addAirlineStatus, "Successfully Adding company to airlines");
		return this;		
	}

	public MiscellaneousAddingCompanyToAirlinesPage clickOkButton(){
	    	String okButton = prop.getProperty("MiscellaneousAddingCompanyToAirlines.VerificationPopupOkButton.Xpath");
		clickByXpath(okButton);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousAddingCompanyToAirlines.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
