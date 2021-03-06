package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerApplicationsPage extends TapWrappers{

	public MediaManagerApplicationsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineApplications.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Applications");
	}

	public MediaManagerAllApplicationsPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineApplications.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String orderHistory = prop.getProperty("MediaManagerAirlineApplications.OrderHistory.LinkText");
		clickByLinkText(orderHistory);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineApplications.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerDashboardMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineApplications.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerDashboardMyAccountPage(driver, test);		
	}

	public MediaManagerApplicationsPage clickAddToShoppingCart(){
	    	String addToShoppingCart = prop.getProperty("MediaManagerAirlineApplications.AddToShoppingCart.LinkText");
		clickByLinkText(addToShoppingCart);
		return this;
	}

	/*Possible Error Messages are:
	"App has been added to Shopping cart"
	"App already in shopping cart"*/
	public MediaManagerApplicationsPage verifyAddToShoppingCartPopup(String msg){
	    	String verifyAddToShoppingCart = prop.getProperty("MediaManagerAirlineApplications.StatusVerification.Xpath");
		verifyTextContainsByXpath(verifyAddToShoppingCart, msg);
		return this;
	}

	public MediaManagerApplicationsPage clickOkButton(){
	    	String okButton = prop.getProperty("MediaManagerAirlineApplications.StatusOkButton.Xpath");
		clickByXpath(okButton);
		return this;
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineApplications.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
