package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerDashboardOrderHistoryPage extends TapWrappers{

	public MediaManagerDashboardOrderHistoryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineOrderHistory.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Orders");

	}

	public MediaManagerAllApplicationsPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrderHistory.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerDashboardMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrderHistory.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerDashboardMyShoppingCartPage(driver, test);		
	}

	public MediaManagerDashboardMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrderHistory.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerDashboardMyAccountPage(driver, test);		
	}
/*	TODO: Need to Add separate Page/class for the below methods
	public MediaManagerOrderHistoryPage clickViewAllPrograms(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrderHistory.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return this;		
	}

	public MediaManagerOrderHistoryPage clickViewAllAircraft(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrderHistory.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return this;		
	}*/

	public MediaManagerDashboardOrderSummaryPage clickOrderNumber(String row){
		clickByXpath("//table/tbody/tr["+row+"]/td[1]/a");
		return new MediaManagerDashboardOrderSummaryPage(driver, test);		
	}

	public MediaManagerDashboardOrderSummaryPage clickOrderName(String row){
		clickByXpath("//table/tbody/tr["+row+"]/td[4]/a");
		return new MediaManagerDashboardOrderSummaryPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrderHistory.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
