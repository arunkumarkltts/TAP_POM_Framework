package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class StoreReportsPage extends TapWrappers{

	public StoreReportsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("StoreReports.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Reports");

	}

	public StoreReportsPage verifyAirlineCount(int count){
	    	String nextButton = prop.getProperty("StoreReports.AirlinesNextButton.Xpath");
		int rowCount = getRowCount("//div[@id='main']//h3[contains(text(),'Airlines')]/following-sibling::div/table/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public StoreReportsPage verifyVendorsCount(int count){
	    	String nextButton = prop.getProperty("StoreReports.VendorsNextButton.Xpath");
		int rowCount = getRowCount("//div[@id='main']//h3[contains(text(),'Vendors')]/following-sibling::div/table/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public MediaManagerOrdersPage clickAirlineName(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'Airlines')]/following-sibling::div/table/tbody/tr["+row+"]/td[1]/a[1]");
		return new MediaManagerOrdersPage(driver, test);		
	}

	public MediaManagerOrdersPage clickVendorName(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'Vendors')]/following-sibling::div/table/tbody/tr["+row+"]/td[1]/a[1]");
		return new MediaManagerOrdersPage(driver, test);		
	}

	public StoreReportsPage clickDownloadAllData(){
	    	String downloadAllData = prop.getProperty("StoreReports.DownloadAllData.LinkText");
		clickByLinkText(downloadAllData);
		return this;		
	}

	public StoreReportsPage verifyDownloadAllData(){
	    	String downloadAllData = prop.getProperty("StoreReports.DownloadAllData.LinkText");
		clickByLinkText(downloadAllData);
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("StoreReports.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
