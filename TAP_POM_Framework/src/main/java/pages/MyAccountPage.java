package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MyAccountPage extends TapWrappers{

	public MyAccountPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MyAccount.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "My Account");
	}
	
	public MyAccountPage clickSubmittedCheckbox(){
	    	String submitted = prop.getProperty("MyAccount.SubmittedCheckbox.Xpath");
		clickByXpath(submitted);
		return this;		
	}
	
	public MyAccountPage clickApprovedCheckbox(){
	    	String approved = prop.getProperty("MyAccount.ApprovedCheckbox.Xpath");
		clickByXpath(approved);
		return this;		
	}
	
	public MyAccountPage clickCompletedCheckbox(){
	    	String completed = prop.getProperty("MyAccount.CompletedCheckbox.Xpath");
		clickByXpath(completed);
		return this;		
	}
	
	public MyAccountPage clickCancelledCheckbox(){
	    	String cancelled = prop.getProperty("MyAccount.CancelledCheckbox.Xpath");
		clickByXpath(cancelled);
		return this;		
	}
	
	public MyAccountPage clickUpdateButton(){
	    	String submitted = prop.getProperty("MyAccount.UpdateButton.Xpath");
		clickByXpath(submitted);
		return this;		
	}
	
	public MyAccountPage clickOk(){
	    	acceptAlert();
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MyAccount.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
