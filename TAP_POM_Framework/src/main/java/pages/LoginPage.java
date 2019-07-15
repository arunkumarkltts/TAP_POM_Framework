package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class LoginPage extends TapWrappers{

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Login.PageVerification.Id");
		verifyTextById(pageVerification, "InFlyt Experience Application Portal Sign on");		
	}

	public LoginPage enterEmail(String data){
	    	String email = prop.getProperty("Login.Email.Xpath");
		enterByXpath(email, data);
		return this;
	}
	
	public LoginPage enterPassword(String data){
	    	String password = prop.getProperty("Login.Password.Xpath");
	    	enterByXpath(password, data);
		return this;
	}
	
	public HomePage clickLogin(){
	    	String loginButton = prop.getProperty("Login.LoginButton.Xpath");
		clickByXpath(loginButton);
		return new HomePage(driver, test);
	}
	
	public ForgotPasswordPage clickForgotPassword(){
	    	String forgotPassword = prop.getProperty("Login.ForgotPassword.LinkText");
		clickByLinkText(forgotPassword);
		return new ForgotPasswordPage(driver, test);
	}

}
