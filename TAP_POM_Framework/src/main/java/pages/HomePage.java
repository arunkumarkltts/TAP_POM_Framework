package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class HomePage extends TapWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Home.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Dashboard");

	}

	public OpeningPage clickLogOff(){
		clickByLinkText("Log Off");
		return new OpeningPage(driver, test);		
	
	}

}



























