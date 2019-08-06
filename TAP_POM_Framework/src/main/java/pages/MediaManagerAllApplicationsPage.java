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

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineAllApplications.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String home = prop.getProperty("MediaManagerAirlineAllApplications.OrderHistory.LinkText");
		clickByLinkText(home);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineAllApplications.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerAllApplicationsPage clickAppAddButton(String appName){
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
