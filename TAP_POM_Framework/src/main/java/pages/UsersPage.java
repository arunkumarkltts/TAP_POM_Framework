package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class UsersPage extends TapWrappers{

	public UsersPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Users.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, " Users");

	}

}
