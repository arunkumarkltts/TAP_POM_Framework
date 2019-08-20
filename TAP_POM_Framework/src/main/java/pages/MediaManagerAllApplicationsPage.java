package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerAllApplicationsPage extends TapWrappers{

	public MediaManagerAllApplicationsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineAllApplications.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Applications");
	}

	public MediaManagerAllApplicationsPage clickCategory(){
	    	String category = prop.getProperty("MediaManagerAirlineAllApplications.Category.LinkText");
		clickByPartialLinkText(category);
		return this;		
	}

	public MediaManagerAllApplicationsPage clickCategoryItem(String categoryName){
		clickByXpath("//div[@class='collapse navbar-collapse']//a[contains(text(),'"+categoryName+"')]");
		return this;		
	}

	public MediaManagerAllApplicationsPage clickVendor(){
	    	String vendor = prop.getProperty("MediaManagerAirlineAllApplications.Vendor.LinkText");
		clickByPartialLinkText(vendor);
		return this;		
	}

	public MediaManagerAllApplicationsPage clickVendorItem(String vendorName){
		clickByXpath("//div[@class='collapse navbar-collapse']//a[contains(text(),'"+vendorName+"')]");
		return this;		
	}

	public MediaManagerAllApplicationsPage clickType(){
	    	String type = prop.getProperty("MediaManagerAirlineAllApplications.Type.LinkText");
		clickByPartialLinkText(type);
		return this;		
	}

	public MediaManagerAllApplicationsPage clickTypeItem(String typeName){
		clickByXpath("//div[@class='collapse navbar-collapse']//a[contains(text(),'"+typeName+"')]");
		return this;		
	}

	public MediaManagerAllApplicationsPage clickDevice(){
	    	String device = prop.getProperty("MediaManagerAirlineAllApplications.Device.LinkText");
		clickByPartialLinkText(device);
		return this;		
	}

	public MediaManagerAllApplicationsPage clickDeviceItem(String deviceName){
		clickByXpath("//div[@class='collapse navbar-collapse']//a[contains(text(),'"+deviceName+"')]");
		return this;		
	}

	public MediaManagerAllApplicationsPage clickClearFilters(){
	    	String clearFilters = prop.getProperty("MediaManagerAirlineAllApplications.ClearFilters.LinkText");
		clickByPartialLinkText(clearFilters);
		return this;		
	}

	public MediaManagerAllApplicationsPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineAllApplications.Home.LinkText");
		clickByLinkText(home);
		return this;		
	}

	public MediaManagerDashboardOrderHistoryPage clickOrderHistory(){
	    	String home = prop.getProperty("MediaManagerAirlineAllApplications.OrderHistory.LinkText");
		clickByLinkText(home);
		return new MediaManagerDashboardOrderHistoryPage(driver, test);		
	}

	public MediaManagerDashboardMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineAllApplications.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerDashboardMyShoppingCartPage(driver, test);		
	}

	public MediaManagerDashboardMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineAllApplications.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerDashboardMyAccountPage(driver, test);		
	}

	public MediaManagerAllApplicationsPage clickAppAddRemoveButton(String appName){
		clickByXpath("//span[contains(text(),'"+appName+"')]/parent::div/following-sibling::div/a/span");
		return this;
	}

	public MediaManagerAllApplicationsPage clickAppAddButton(String appName, int occurence){
		clickByXpath("(//span[contains(text(),'"+appName+"')]/parent::div/following-sibling::div/a/span)["+occurence+"]");
		return this;
	}

	public MediaManagerApplicationsPage clickApp(String appName){
		clickByXpath("//span[contains(text(),'"+appName+"')]/parent::div/preceding-sibling::a/img");
		return new MediaManagerApplicationsPage(driver, test);
	}

	public MediaManagerApplicationsPage clickApp(String appName, int occurence){
		clickByXpath("(//span[contains(text(),'"+appName+"')]/parent::div/preceding-sibling::a/img)["+occurence+"]");
		return new MediaManagerApplicationsPage(driver, test);
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineAllApplications.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
