package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MyAppsPage extends TapWrappers{

	public MyAppsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MyApps.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Dashboard");

	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MyApps.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
