package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousAddNewDevicePage extends TapWrappers{

	public MiscellaneousAddNewDevicePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousAddNewDevice.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "New Device");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousAddNewDevice.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousAddNewDevice.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousAddNewDevice.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousAddNewDevice.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousAddNewDevice.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousAddNewDevice.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousAddNewDevice.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousAddNewDevice.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousAddNewDevice.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousAddNewDevicePage enterDeviceName(String data){
	    	String deviceName = prop.getProperty("MiscellaneousAddNewDevice.DeviceName.Name");
		enterByName(deviceName, data);
		return this;		
	}

	public MiscellaneousAddNewDevicePage enterIconName(String data){
	    	String iconName = prop.getProperty("MiscellaneousAddNewDevice.IconName.Name");
		enterByName(iconName, data);
		return this;		
	}

	public MiscellaneousAddNewDevicePage enterToolTip(String data){
	    	String toolTip = prop.getProperty("MiscellaneousAddNewDevice.ToolTip.Name");
		enterByName(toolTip, data);
		return this;		
	}

	public MiscellaneousPage clickCancel(){
	    	String cancelButton = prop.getProperty("MiscellaneousAddNewDevice.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return new MiscellaneousPage(driver, test);		
	}

	public MiscellaneousAddNewDevicePage clickAddNewDevice(){
	    	String submitButton = prop.getProperty("MiscellaneousAddNewDevice.SubmitButton.Xpath");
		clickByXpath(submitButton);
		return this;		
	}

	public MiscellaneousAddNewDevicePage verifyAddNewDeviceStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousAddNewDevice.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "has been added");
		return this;		
	}

	public MiscellaneousListDevicesPage clickClosePopup(){
	    	String closePopup = prop.getProperty("MiscellaneousAddNewDevice.VerificationPopupCloseButton.Xpath");
		clickByXpath(closePopup);
		return new MiscellaneousListDevicesPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousAddNewDevice.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
