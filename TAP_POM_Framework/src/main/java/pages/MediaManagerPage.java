package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerPage extends TapWrappers{

	public MediaManagerPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManager.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "My Airlines:");

	}

}
