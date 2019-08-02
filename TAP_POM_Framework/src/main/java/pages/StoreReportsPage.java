package pages;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

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

	public StoreReportsAirlinesPage clickAirlineName(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'Airlines')]/following-sibling::div/table/tbody/tr["+row+"]/td[1]/a[1]");
		return new StoreReportsAirlinesPage(driver, test);		
	}

	public StoreReportsVendorsPage clickVendorName(String row){
		clickByXpath("//div[@id='main']//h3[contains(text(),'Vendors')]/following-sibling::div/table/tbody/tr["+row+"]/td[1]/a[1]");
		return new StoreReportsVendorsPage(driver, test);		
	}

	public StoreReportsPage clickDownloadAllData(){
	    	String downloadAllData = prop.getProperty("StoreReports.DownloadAllData.LinkText");
		clickByLinkText(downloadAllData);
		return this;		
	}

	public StoreReportsPage verifyDownloadAllData(){
	    	String home = System.getProperty("user.home");
	    	ZoneId zoneId = ZoneId.of("US/Pacific");
		LocalTime localTime=LocalTime.now(zoneId);
		LocalDate localDate=LocalDate.now(zoneId);
		DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HHmm");
		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formattedTime=localTime.format(timeformatter);
		String formattedDate=localDate.format(dateformatter);
		verifyFileExists(home+"\\Downloads\\tap_export_all_"+formattedDate+"_"+formattedTime+".csv");
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("StoreReports.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
