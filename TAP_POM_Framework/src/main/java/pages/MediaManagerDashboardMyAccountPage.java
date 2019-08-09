package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerDashboardMyAccountPage extends TapWrappers{

	public MediaManagerDashboardMyAccountPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineOrdersMyAccount.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "My Account");
	}

	public MediaManagerAllApplicationsPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrders.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerDashboardOrderHistoryPage clickOrderHistory(){
	    	String orderHistory = prop.getProperty("MediaManagerAirlineOrders.Home.LinkText");
		clickByLinkText(orderHistory);
		return new MediaManagerDashboardOrderHistoryPage(driver, test);		
	}

	public MediaManagerDashboardMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrdersMyAccount.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerDashboardMyShoppingCartPage(driver, test);		
	}

	public MediaManagerDashboardMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrdersMyAccount.MyShoppingCart.LinkText");
		clickByLinkText(myAccount);
		return this;		
	}

	public MediaManagerDashboardMyAccountPage clickSubmittedCheckbox(){
	    	String submitted = prop.getProperty("MediaManagerAirlineOrdersMyAccount.SubmittedCheckbox.Xpath");
		clickByXpath(submitted);
		return this;		
	}
	
	public MediaManagerDashboardMyAccountPage clickApprovedCheckbox(){
	    	String approved = prop.getProperty("MediaManagerAirlineOrdersMyAccount.ApprovedCheckbox.Xpath");
		clickByXpath(approved);
		return this;		
	}
	
	public MediaManagerDashboardMyAccountPage clickCompletedCheckbox(){
	    	String completed = prop.getProperty("MediaManagerAirlineOrdersMyAccount.CompletedCheckbox.Xpath");
		clickByXpath(completed);
		return this;		
	}
	
	public MediaManagerDashboardMyAccountPage clickCancelledCheckbox(){
	    	String cancelled = prop.getProperty("MediaManagerAirlineOrdersMyAccount.CancelledCheckbox.Xpath");
		clickByXpath(cancelled);
		return this;		
	}
	
	public MediaManagerDashboardMyAccountPage clickUpdateButton(){
	    	String submitted = prop.getProperty("MediaManagerAirlineOrdersMyAccount.UpdateButton.Xpath");
		clickByXpath(submitted);
		return this;		
	}

	public MediaManagerDashboardMyAccountPage clickOk(){
	    	acceptAlert();
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrdersMyAccount.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
