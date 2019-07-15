package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class NewApplicationPage extends TapWrappers{

	public NewApplicationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("NewApplication.PageVerification.Xpath");
		verifyTextById(pageVerification, "New Application");		
	}
	
	public NewApplicationPage enterTitle(String data){
	    	String title = prop.getProperty("NewApplication.Title.Xpath");
		enterByXpath(title, data);
		return this;
	}
	
	public NewApplicationPage selectSystem(String data){
	    	String systemDropDown = prop.getProperty("NewApplication.SystemDropDown.Xpath");
	    	selectVisibileTextByXPath(systemDropDown, data);
		return this;
	}
	
	public NewApplicationPage selectInput(String data){
	    	String inputDropDown = prop.getProperty("NewApplication.InputDropDown.Xpath");
	    	selectVisibileTextByXPath(inputDropDown, data);
		return this;
	}
	
	public NewApplicationPage enterPackageName(String data){
	    	String packageName = prop.getProperty("NewApplication.PackageName.Xpath");
	    	selectVisibileTextByXPath(packageName, data);
		return this;
	}
	
	public NewApplicationPage enterPassword(String data){
	    	String systemDropDown = prop.getProperty("NewApplication.SystemDropDown.Xpath");
	    	selectVisibileTextByXPath(systemDropDown, data);
		return this;
	}
	
	public HomePage clickLogin(){
	    	String loginButton = prop.getProperty("Login.LoginButton.Xpath");
		clickByXpath(loginButton);
		return new HomePage(driver, test);
	}
	
}
