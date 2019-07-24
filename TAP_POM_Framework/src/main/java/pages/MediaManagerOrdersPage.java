package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerOrdersPage extends TapWrappers{

	public MediaManagerOrdersPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineOrders.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Orders");
	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrders.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String home = prop.getProperty("MediaManagerAirlineOrders.OrderHistory.LinkText");
		clickByLinkText(home);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrders.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrders.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerMyAccountPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage clickOrderNumber(String row){
		clickByXpath("//table/tbody/tr["+row+"]/td[1]/a");
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage clickOrderName(String row){
		clickByXpath("//table/tbody/tr["+row+"]/td[2]/a");
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrders.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
