/*package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Temp {

    public static void main(String[] args) throws IOException {
//	String home = System.getProperty("user.home");	
//	ZoneId zoneId = ZoneId.of("US/Pacific");
//	    LocalTime localTime=LocalTime.now(zoneId);
//	    LocalDate localDate=LocalDate.now(zoneId);
//	    DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HHmm");
//	    DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//	    String formattedTime=localTime.format(timeformatter);
//	    String formattedDate=localDate.format(dateformatter);
//	    System.out.println("Date: "+formattedDate+" Time: "+formattedTime);
//	    File file = new File(home+"\\Downloads\\tap_export_all_"+formattedDate+"_"+formattedTime+".csv");
//	    System.out.println(file.exists());
		String s = "$20.55";
		float i = Float.parseFloat(s.substring(1, s.length()));
		System.out.println(i);
    }

}
*/
package utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class Temp extends TapWrappers {


	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Check New Register";
		testDescription = "Check New Register menu with Developer and Airlines";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test()
	public void FileChecker(){
	    	String home = System.getProperty("user.home");
	    	ZoneId zoneId = ZoneId.of("US/Pacific");
		LocalTime localTime=LocalTime.now(zoneId);
		LocalDate localDate=LocalDate.now(zoneId);
		DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HHmm");
		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formattedTime=localTime.format(timeformatter);
		String formattedDate=localDate.format(dateformatter);
		verifyFileExists(home+"\\Downloads\\","tap_export_airline_*"+formattedDate+"_"+formattedTime+".csv");;
	}

}
