package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class OpeningPage extends TapWrappers{

	public OpeningPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Thales InFlyt Experience Application Portal")){
			reportStep("This in not Login Page", "FAIL");
		}
	    	String pageVerification = prop.getProperty("Opening.PageVerification.Xpath");
		verifyTextByXpath(pageVerification, "A Dedicated IFEC marketplace of Applications at your fingertips");
	}
	
	public LoginPage clickLogin(){
	    	String loginButton = prop.getProperty("Opening.LoginButton.LinkText");
		clickByLinkText(loginButton);
		return new LoginPage(driver, test);
	}

	public OpeningPage clickRegister(){
	    	String registerButton = prop.getProperty("Opening.RegisterButton.LinkText");
		clickByLinkText(registerButton);
		return this;
	}
	
	public RegistrationPage clickRegisterUser(String user){
		clickByLinkText(user);
		return new RegistrationPage(driver, test, user);
	}
	
	public OpeningPage clickRegisterForFailure(){
		clickByClassName("decorativeSubmit");
		return this;
	}
	
}

















