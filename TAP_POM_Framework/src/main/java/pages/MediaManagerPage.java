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

	public MediaManagerOrdersPage clickMyAirlinesOrderNumber(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'My Airlines')]/following-sibling::div/table/tbody/tr["+row+"]/td[1]");
		return new MediaManagerOrdersPage(driver, test);		
	}

	public MediaManagerOrdersPage clickAirline(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'My Airlines')]/following-sibling::div/table/tbody/tr["+row+"]/td[2]/a[1]");
		return new MediaManagerOrdersPage(driver, test);		
	}

	public MediaManagerApplicationsPage clickAirlineDashboard(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'My Airlines')]/following-sibling::div/table/tbody/tr["+row+"]/td[2]/a[2]");
		return new MediaManagerApplicationsPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage clickMyOrdersOrderNumber(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'My Orders')]/following-sibling::div/table/tbody/tr["+row+"]/td[1]/a");
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage clickMyOrdersOrderName(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'My Orders')]/following-sibling::div/table/tbody/tr["+row+"]/td[2]/a");
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public MediaManagerPage verifyAirlineCount(int count){
	    	String nextButton = prop.getProperty("MediaManager.AirlineNextButton.Xpath");
		int rowCount = getRowCount("//div[@id='main']//h3[contains(text(),'My Airlines')]/following-sibling::div/table/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public MediaManagerPage verifyOrdersCount(int count){
	    	String nextButton = prop.getProperty("MediaManager.OrdersNextButton.Xpath");
		int rowCount = getRowCount("//div[@id='main']//h3[contains(text(),'My Orders')]/following-sibling::div/table/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManager.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
