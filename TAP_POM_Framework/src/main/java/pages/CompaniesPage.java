package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class CompaniesPage extends TapWrappers{

	public CompaniesPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Companies.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Companies");

	}

}
