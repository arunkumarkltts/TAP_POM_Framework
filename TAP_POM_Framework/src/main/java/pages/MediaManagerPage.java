package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerPage extends TapWrappers{

	public MediaManagerPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManager.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "My Airlines:");

	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManager.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

	/*TODO: Need to check the requirements and update the page/class of this method*/
	public MediaManagerOrdersPage clickOrderNumber(String row, String column){
		clickByXpath("//table[@id='orders']/tbody/tr["+row+"]/td["+column+"]");
		return new MediaManagerOrdersPage(driver, test);		
	}

	public MediaManagerOrdersPage clickAirline(String row, String column){
		clickByXpath("//table[@id='orders']/tbody/tr["+row+"]/td["+column+"]/a[1]");
		return new MediaManagerOrdersPage(driver, test);		
	}

	public MediaManagerApplicationsPage clickAirlineDashboard(String row, String column){
		clickByXpath("//table[@id='orders']/tbody/tr["+row+"]/td["+column+"]/a[2]");
		return new MediaManagerApplicationsPage(driver, test);		
	}

}
