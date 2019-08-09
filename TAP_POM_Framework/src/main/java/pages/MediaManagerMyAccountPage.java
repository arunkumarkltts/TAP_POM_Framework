package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerMyAccountPage extends TapWrappers{

	public MediaManagerMyAccountPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineOrdersMyAccount.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "My Account");
	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrders.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String orderHistory = prop.getProperty("MediaManagerAirlineOrders.OrderHistory.LinkText");
		clickByLinkText(orderHistory);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrdersMyAccount.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrdersMyAccount.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return this;		
	}

	public MediaManagerMyAccountPage clickSubmittedCheckbox(){
	    	String submitted = prop.getProperty("MediaManagerAirlineOrdersMyAccount.SubmittedCheckbox.Xpath");
		clickByXpath(submitted);
		return this;		
	}
	
	public MediaManagerMyAccountPage clickApprovedCheckbox(){
	    	String approved = prop.getProperty("MediaManagerAirlineOrdersMyAccount.ApprovedCheckbox.Xpath");
		clickByXpath(approved);
		return this;		
	}
	
	public MediaManagerMyAccountPage clickCompletedCheckbox(){
	    	String completed = prop.getProperty("MediaManagerAirlineOrdersMyAccount.CompletedCheckbox.Xpath");
		clickByXpath(completed);
		return this;		
	}
	
	public MediaManagerMyAccountPage clickCancelledCheckbox(){
	    	String cancelled = prop.getProperty("MediaManagerAirlineOrdersMyAccount.CancelledCheckbox.Xpath");
		clickByXpath(cancelled);
		return this;		
	}
	
	public MediaManagerMyAccountPage clickUpdateButton(){
	    	String submitted = prop.getProperty("MediaManagerAirlineOrdersMyAccount.UpdateButton.Xpath");
		clickByXpath(submitted);
		return this;		
	}

	public MediaManagerMyAccountPage clickOk(){
	    	acceptAlert();
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrdersMyAccount.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
