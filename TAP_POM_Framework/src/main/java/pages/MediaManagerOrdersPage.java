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

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrders.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
