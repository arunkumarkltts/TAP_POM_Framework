package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerOrderSummaryPage extends TapWrappers{

	public MediaManagerOrderSummaryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerOrderSummary.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Order Summary");
	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerOrderSummary.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
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

	public MediaManagerOrderSummaryPage selectStatus(String data){
	    	String statusDropDown = prop.getProperty("MediaManagerOrderSummary.StatusDropDown.Xpath");
	    	selectVisibileTextByXPath(statusDropDown, data);
		return this;
	}
	
	public MediaManagerOrderSummaryPage clickApply(){
	    	String apply = prop.getProperty("MediaManagerOrderSummary.Apply.LinkText");
		clickByLinkText(apply);
		return this;		
	}
	
	public MediaManagerOrderSummaryPage clickNextStepButton(){
	    	String nextStepButton = prop.getProperty("MediaManagerOrderSummary.NextButton.Xpath");
		clickByXpath(nextStepButton);
		return this;		
	}
	
	public MediaManagerOrderSummaryPage verifyStatus(String expectedStatus){
	    	String statusDropDown = prop.getProperty("MediaManagerOrderSummary.StatusDropDown.Xpath");
		String actualStatus = getSelectedDropDownText(statusDropDown);
		verifyIfEqual(actualStatus, expectedStatus);
		return this;		
	}

	public NewApplicationPage clickDownloadFiles(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='links']/a");
		return new NewApplicationPage(driver, test, appName);		
	}

	public MediaManagerOrderSummaryPage clickRemoveAppFromOrder(String appName){
		clickByXpathNoSnap("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='edit-bar']/a[@id='remove']");
		return this;		
	}

	public MediaManagerOrderSummaryPage clickOkButton(){
		acceptAlert();
		return this;		
	}
	
	public MediaManagerOrderSummaryPage clickCancelButton(){
		dismissAlert();
		return this;		
	}

	public MediaManagerOrderSummaryPage clickDiscount(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@id='edit-bar']/a[@id='discount']");
		return this;		
	}

	public MediaManagerOrderSummaryPage enterDiscountPrice(String appName, String discountPrice){
	    	enterByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/input[@name='discount_price']", discountPrice);
		return this;		
	}
	
	public MediaManagerOrderSummaryPage enterDiscountNote(String appName, String discountNote){
		enterByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/input[@name='discount_note']", discountNote);
		return this;		
	}

	public MediaManagerOrderSummaryPage clickApplyDiscount(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/a[@id='discount_apply']");
		return this;		
	}
	
	public MediaManagerOrderSummaryPage clickRemoveDiscount(String appName){
		clickByXpath("//a[contains(text(),'"+appName+"')]/parent::div/following-sibling::div[@class='discount']/a[@id='discount_remove']");
		return this;		
	}
	
	public MediaManagerOrderSummaryPage verifyDiscount(String appName, String discount){
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
