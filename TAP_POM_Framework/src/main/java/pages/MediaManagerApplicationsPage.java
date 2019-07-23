package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerApplicationsPage extends TapWrappers{

	public MediaManagerApplicationsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineApplications.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, " Applications");

	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineApplications.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String home = prop.getProperty("MediaManagerAirlineApplications.OrderHistory.LinkText");
		clickByLinkText(home);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineApplications.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerApplicationsPage clickAddButton(String appName){
		clickByXpath("span[contains(text(),'"+appName+"')]/parent::div/following-sibling::div/a/span");
		return this;
	}

	public MediaManagerApplicationsPage clickAddButton(String appName, int occurence){
		clickByXpath("(span[contains(text(),'"+appName+"')]/parent::div/following-sibling::div/a/span)["+occurence+"]");
		return this;
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineApplications.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}


//