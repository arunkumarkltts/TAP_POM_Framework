package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class ForgotPasswordPage extends TapWrappers{

	public ForgotPasswordPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("ForgotPassword.PageVerification.Xpath");
		verifyTextByXpath(pageVerification, "Password Request");		
	}

	public ForgotPasswordPage enterEmail(String data){
	    	String email = prop.getProperty("ForgotPassword.Email.Xpath");
		enterByXpath(email, data);
		return this;
	}

	public ForgotPasswordPage clickRequestPassword(){
	    	String requestPassword = prop.getProperty("ForgotPassword.RequestPasswordButton.Xpath");
	    	String requestPasswordVerification = prop.getProperty("ForgotPassword.RequestPasswordVerification.Xpath");
		clickByXpath(requestPassword);
		verifyTextContainsByXpath(requestPasswordVerification, "An email has been sent to ");
		return this;
	}

}

















