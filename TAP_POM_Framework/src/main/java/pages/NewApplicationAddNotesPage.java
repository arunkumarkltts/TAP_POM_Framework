package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.TapWrappers;

public class NewApplicationAddNotesPage extends TapWrappers{

	public NewApplicationAddNotesPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}

	public NewApplicationAddNotesPage selectStatus(String data){
	    	String statusDropDown = prop.getProperty("NewApplicationAddNotes.StatusDropDown.Xpath");
	    	selectVisibileTextByXPath(statusDropDown, data);
		return this;
	}

	public NewApplicationAddNotesPage enterNotes(String data){
	    	String notes = prop.getProperty("NewApplicationAddNotes.Notes.Xpath");
	    	enterByXpath(notes, data);
		return this;
	}

	public NewApplicationAddNotesPage clickPublishForDeveloper(String data){
	    	String publishForDeveloper = prop.getProperty("NewApplicationAddNotes.PublishForDeveloper.Xpath");
	    	clickByXpath(publishForDeveloper);
		return this;
	}

	public NewApplicationAddNotesPage clickPublishForSales(String data){
	    	String publishForSales = prop.getProperty("NewApplicationAddNotes.PublishForSales.Xpath");
	    	clickByXpath(publishForSales);
		return this;
	}

	public NewApplicationAddNotesPage clickPublishForAirline(String data){
	    	String publishForAirline = prop.getProperty("NewApplicationAddNotes.PublishForAirline.Xpath");
	    	clickByXpath(publishForAirline);
		return this;
	}

	public NewApplicationPage clickCancelButton(){
	    	String cancelButton = prop.getProperty("NewApplicationAddNotes.CancelButton.Xpath");
	    	clickByXpath(cancelButton);
		return new NewApplicationPage(driver, test);
	}

	public NewApplicationPage clickUpdateButton(){
	    	String updateButton = prop.getProperty("NewApplicationAddNotes.UpdateButton.Xpath");
	    	clickByXpath(updateButton);
		return new NewApplicationPage(driver, test);
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("NewApplicationAddNotes.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
