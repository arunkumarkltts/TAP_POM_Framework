package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MyAccountPage extends TapWrappers{

	public MyAccountPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MyAccount.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, " My Account");
	}

}
