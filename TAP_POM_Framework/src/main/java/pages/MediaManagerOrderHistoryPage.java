package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerOrderHistoryPage extends TapWrappers{

	public MediaManagerOrderHistoryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineOrderHistory.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Orders");

	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrderHistory.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrderHistory.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrderHistory.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerMyAccountPage(driver, test);		
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

	public MediaManagerOrderSummaryPage clickOrderNumber(String row){
		clickByXpath("//table/tbody/tr["+row+"]/td[1]/a");
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage clickOrderName(String row){
		clickByXpath("//table/tbody/tr["+row+"]/td[4]/a");
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrderHistory.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
