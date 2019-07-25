package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousUpdateUserRolePage extends TapWrappers{

	public MiscellaneousUpdateUserRolePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousUpdateUserRole.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "User Role Re-Assignment");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousUpdateUserRole.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousUpdateUserRole.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousUpdateUserRole.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousUpdateUserRole.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousUpdateUserRole.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousUpdateUserRole.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousUpdateUserRole.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousUpdateUserRole.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousUpdateUserRole.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousUpdateUserRolePage enterFilter(String data){
	    	String filter = prop.getProperty("MiscellaneousUpdateUserRole.Filter.Xpath");
		enterByXpath(filter, data);
		return this;		
	}

	public MiscellaneousUpdateUserRolePage selectUser(String data){
	    	String user = prop.getProperty("MiscellaneousUpdateUserRole.UserDropDown.Xpath");
		selectVisibileTextByXPath(user, data);
		return this;		
	}

	public MiscellaneousUpdateUserRolePage selectAccessLevel(String data){
	    	String accessLevel = prop.getProperty("MiscellaneousUpdateUserRole.AccessLevelDropDown.Xpath");
		selectVisibileTextByXPath(accessLevel, data);
		return this;			
	}

	public MiscellaneousUpdateUserRolePage clickUpdateAccess(){
	    	String updateAccess = prop.getProperty("MiscellaneousUpdateUserRole.UpdateAccessButton.Xpath");
		clickByXpath(updateAccess);
		return this;			
	}

	public MiscellaneousUpdateUserRolePage verifyRoleAssignmentStatus(){
	    	String roleAssignmentStatus = prop.getProperty("MiscellaneousUpdateUserRole.VerifyRoleAssignmentStatus.Xpath");
		verifyTextContainsByXpath(roleAssignmentStatus, "Role Successfully Changed.");
		return this;		
	}

	public MiscellaneousUpdateUserRolePage clickOkButton(){
	    	String okButton = prop.getProperty("MiscellaneousUpdateUserRole.VerificationPopupOkButton.Xpath");
		clickByXpath(okButton);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousUpdateUserRole.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
