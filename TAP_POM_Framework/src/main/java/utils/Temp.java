package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Temp {

    public static void main(String[] args) throws IOException {
	String home = System.getProperty("user.home");	
	ZoneId zoneId = ZoneId.of("US/Pacific");
	    LocalTime localTime=LocalTime.now(zoneId);
	    LocalDate localDate=LocalDate.now(zoneId);
	    DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HHmm");
	    DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	    String formattedTime=localTime.format(timeformatter);
	    String formattedDate=localDate.format(dateformatter);
	    System.out.println("Date: "+formattedDate+" Time: "+formattedTime);
	    File file = new File(home+"\\Downloads\\tap_export_all_"+formattedDate+"_"+formattedTime+".csv");
	    System.out.println(file.exists());
    }

}
