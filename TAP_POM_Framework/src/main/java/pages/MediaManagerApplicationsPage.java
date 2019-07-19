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

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineApplications.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
