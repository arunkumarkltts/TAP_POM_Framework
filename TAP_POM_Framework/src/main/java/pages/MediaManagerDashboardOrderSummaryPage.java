package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerDashboardOrderSummaryPage extends TapWrappers{

	public MediaManagerDashboardOrderSummaryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerOrderSummary.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Order Summary");
	}

	public MediaManagerAllApplicationsPage clickHome(){
	    	String home = prop.getProperty("MediaManagerOrderSummary.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String home = prop.getProperty("MediaManagerOrderSummary.OrderHistory.LinkText");
		clickByLinkText(home);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerOrderSummary.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerOrderSummary.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerMyAccountPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickEditOrderInfo(){
	    	String editOrderInfo = prop.getProperty("MediaManagerOrderSummary.EditOrderInfo.LinkText");
		clickByLinkText(editOrderInfo);	
		return new MediaManagerMyShoppingCartPage(driver, test);
	}

	public MediaManagerDashboardOrderSummaryPage selectStatus(String data){
	    	String statusDropDown = prop.getProperty("MediaManagerOrderSummary.StatusDropDown.Xpath");
	    	selectVisibileTextByXPath(statusDropDown, data);
		return this;
	}
	
	public MediaManagerDashboardOrderSummaryPage clickApply(){
	    	String apply = prop.getProperty("MediaManagerOrderSummary.Apply.LinkText");
		clickByLinkText(apply);
		return this;		
	}
	
	public MediaManagerDashboardOrderSummaryPage clickRemoveAppFromOrder(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='edit-bar']/a[@id='remove']");
		return this;		
	}
	
	public MediaManagerDashboardOrderSummaryPage clickDiscount(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='edit-bar']/a[@id='discount']");
		return this;		
	}

	public MediaManagerDashboardOrderSummaryPage enterDiscountPrice(String appName, String discountPrice){
	    	enterByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/input[@name='discount_price']", discountPrice);
		return this;		
	}
	
	public MediaManagerDashboardOrderSummaryPage enterDiscountNote(String appName, String discountNote){
		enterByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/input[@name='discount_note']", discountNote);
		return this;		
	}

	public MediaManagerDashboardOrderSummaryPage clickApplyDiscount(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/a[@id='discount_apply']");
		return this;		
	}
	
	public MediaManagerDashboardOrderSummaryPage clickRemoveDiscount(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/a[@id='discount_remove']");
		return this;		
	}
	
	public MediaManagerDashboardOrderSummaryPage verifyDiscount(String appName, String discount){
	    	String dprice = getTextByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='price']/div[@id='discountprice']");
	    	Float discountPrice = Float.parseFloat(dprice.substring(1, dprice.length()));
	    	String lprice = getTextByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='price']/div[@id='listprice']");
	    	Float listPrice = Float.parseFloat(lprice.substring(1, lprice.length()));
	    	verifyIfEqual((listPrice-discountPrice), Float.parseFloat(discount));
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerOrderSummary.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
