package pages;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class StoreReportsVendorsPage extends TapWrappers{

	public StoreReportsVendorsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("StoreReportsVendors.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Airline Report");
	}

	public StoreReportsVendorsPage verifyAirlineReportCount(int count){
		int rowCount = getRowCount("//table[@id='orders']/tbody/tr");
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public StoreReportsVendorsPage clickDownloadVendorReport(){
	    	String download = prop.getProperty("StoreReportsVendors.Download.LinkText");
		clickByLinkText(download);
		return this;		
	}

	public StoreReportsVendorsPage verifyDownloadVendorReport(){
	    	String home = System.getProperty("user.home");
	    	ZoneId zoneId = ZoneId.of("US/Pacific");
		LocalTime localTime=LocalTime.now(zoneId);
		LocalDate localDate=LocalDate.now(zoneId);
		DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HHmm");
		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formattedTime=localTime.format(timeformatter);
		String formattedDate=localDate.format(dateformatter);
		verifyFileExists(home+"\\Downloads\\","tap_export_vendor_*"+formattedDate+"_"+formattedTime+".csv");
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("StoreReports.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
