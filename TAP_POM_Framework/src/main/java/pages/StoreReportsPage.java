package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class StoreReportsPage extends TapWrappers{

	public StoreReportsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("StoreReports.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, " Reports");

	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("StoreReports.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
