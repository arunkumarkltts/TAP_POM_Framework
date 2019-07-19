package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousPage extends TapWrappers{

	public MiscellaneousPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Miscellaneous.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, " Users");

	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Miscellaneous.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
