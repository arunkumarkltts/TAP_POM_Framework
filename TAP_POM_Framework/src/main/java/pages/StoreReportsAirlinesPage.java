package pages;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class StoreReportsAirlinesPage extends TapWrappers{

	public StoreReportsAirlinesPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("StoreReportsAirlines.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Airline Report");
	}

	public StoreReportsAirlinesPage verifyAirlineReportCount(int count){
		int rowCount = getRowCount("//table[@id='orders']/tbody/tr");
		verifyIfEqual(rowCount, count);
		return this;		
	}

	public StoreReportsAirlinesPage clickDownload(){
	    	String download = prop.getProperty("StoreReportsAirlines.Download.LinkText");
		clickByLinkText(download);
		return this;		
	}

//	public StoreReportsAirlinesPageee verifyDownloadAllData(){
//	    	String home = System.getProperty("user.home");
//	    	ZoneId zoneId = ZoneId.of("US/Pacific");
//		LocalTime localTime=LocalTime.now(zoneId);
//		LocalDate localDate=LocalDate.now(zoneId);
//		DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HHmm");
//		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//		String formattedTime=localTime.format(timeformatter);
//		String formattedDate=localDate.format(dateformatter);
//		verifyFileExists(home+"\\Downloads\\tap_export_all_"+formattedDate+"_"+formattedTime+".csv");
//		return this;		
//	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("StoreReports.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
