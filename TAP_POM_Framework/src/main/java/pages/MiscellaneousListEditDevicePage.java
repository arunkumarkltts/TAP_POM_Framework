package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousListEditDevicePage extends TapWrappers{

	public MiscellaneousListEditDevicePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousListEditDevices.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Companies");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousListEditDevices.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousListEditDevices.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousListEditDevices.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousListEditDevices.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousListEditDevices.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousListEditDevices.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousListEditDevices.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousListEditDevices.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousListEditDevices.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousListEditDevicePage enterDeviceName(String data){
	    	String deviceName = prop.getProperty("MiscellaneousListEditDevices.DeviceName.Name");
		enterByName(deviceName, data);
		return this;		
	}

	public MiscellaneousListEditDevicePage enterIconName(String data){
	    	String iconName = prop.getProperty("MiscellaneousListEditDevices.IconName.Name");
		enterByName(iconName, data);
		return this;		
	}

	public MiscellaneousListEditDevicePage enterToolTip(String data){
	    	String toolTip = prop.getProperty("MiscellaneousListEditDevices.ToolTip.Name");
		enterByName(toolTip, data);
		return this;		
	}

	public MiscellaneousListDevicesPage clickCancel(){
	    	String cancelButton = prop.getProperty("MiscellaneousListEditDevices.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return new MiscellaneousListDevicesPage(driver, test);		
	}

	public MiscellaneousListEditDevicePage clickUpdateDevice(){
	    	String submitButton = prop.getProperty("MiscellaneousListEditDevices.SubmitButton.Xpath");
		clickByXpath(submitButton);
		return this;		
	}

	public MiscellaneousListEditDevicePage verifyUpdateDeviceStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousListEditDevices.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "has been added");
		return this;		
	}

	public MiscellaneousListDevicesPage clickClosePopup(){
	    	String closePopup = prop.getProperty("MiscellaneousListEditDevices.MiscellaneousListEditDevices.VerificationPopupCloseButton.Xpath.Xpath");
		clickByXpath(closePopup);
		return new MiscellaneousListDevicesPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousListEditDevices.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
