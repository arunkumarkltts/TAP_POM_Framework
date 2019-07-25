package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousUpdateTAPAgreementPage extends TapWrappers{

	public MiscellaneousUpdateTAPAgreementPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousUpdateTAPAgreement.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Agreement");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousUpdateTAPAgreement.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousUpdateTAPAgreement.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousUpdateTAPAgreement.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousUpdateTAPAgreement.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousUpdateTAPAgreement.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousUpdateTAPAgreement.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousUpdateTAPAgreement.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousUpdateTAPAgreement.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousUpdateTAPAgreement.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousUpdateTAPAgreementPage enterAgreement(String data){
	    	goToFrame(0);
	    	String agreement = prop.getProperty("MiscellaneousUpdateTAPAgreement.Agreement.Xpath");
		enterByXpath(agreement, data);
		getOutOfFrame();
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage enterVersion(String data){
	    	String version = prop.getProperty("MiscellaneousUpdateTAPAgreement.Versions.Xpath");
		enterByXpath(version, data);
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage clickCancel(){
	    	String cancelButton = prop.getProperty("MiscellaneousUpdateTAPAgreement.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage clickSubmit(){
	    	String submitButton = prop.getProperty("MiscellaneousUpdateTAPAgreement.SubmitButton.Xpath");
		clickByXpath(submitButton);
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage enterSearch(String data){
	    	String search = prop.getProperty("MiscellaneousUpdateTAPAgreement.Search.Xpath");
		enterByXpath(search, data);
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage clickClearSearch(){
	    	String clearSearch = prop.getProperty("MiscellaneousUpdateTAPAgreement.ClearSearch.Xpath");
		clickByXpath(clearSearch);
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage clickUpdate(String row){
		clickByXpath("//table[@id='users-active']/tbody/tr["+row+"]/td[4]/a");
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage verifyAgreementStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousUpdateTAPAgreement.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "Success Full Update Agreement");
		return this;		
	}

	public MiscellaneousUpdateTAPAgreementPage clickPopupOkButton(){
	    	String closePopup = prop.getProperty("MiscellaneousUpdateTAPAgreement.VerificationPopupCloseButton.Xpath");
		clickByXpath(closePopup);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousUpdateTAPAgreement.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
