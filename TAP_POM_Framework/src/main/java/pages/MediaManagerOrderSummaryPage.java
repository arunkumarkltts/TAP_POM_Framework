package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerOrderSummaryPage extends TapWrappers{

	public MediaManagerOrderSummaryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerOrderSummary.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Order Summary");
	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerOrderSummary.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String home = prop.getProperty("MediaManagerOrderSummary.OrderHistory.LinkText");
		clickByLinkText(home);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerOrderSummary.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerOrderSummary.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerMyAccountPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage selectStatus(String data){
	    	String statusDropDown = prop.getProperty("MediaManagerOrderSummary.StatusDropDown.Xpath");
	    	selectVisibileTextByXPath(statusDropDown, data);
		return this;
	}
	
	public MediaManagerOrderSummaryPage clickApply(){
	    	String apply = prop.getProperty("MediaManagerOrderSummary.Apply.LinkText");
		clickByLinkText(apply);
		return this;		
	}
	
	public MediaManagerOrderSummaryPage clickRemoveAppFromOrder(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='edit-bar']/a[@id='remove']");
		return this;		
	}
	
	public MediaManagerOrderSummaryPage clickOrderName(String row){
		clickByXpath("//table/tbody/tr["+row+"]/td[4]/a");
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerOrderSummary.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
