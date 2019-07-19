package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.TapWrappers;

public class NewApplicationAddIconsPage extends TapWrappers{

	public NewApplicationAddIconsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("NewApplicationAddIcons.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Application Icons");		
	}

	public NewApplicationAddIconsPage clickUploadAFile(String data){
	    	String uploadFile = prop.getProperty("NewApplicationAddIcons.UploadAFile.Xpath");
	    	clickByXpath(uploadFile);
	    	sendKeysToWindows(data);
		return this;
	}

	public NewApplicationPage clickDoneButton(){
	    	String doneButton = prop.getProperty("NewApplicationAddIcons.DoneButton.Xpath");
	    	clickByXpath(doneButton);
		return new NewApplicationPage(driver, test);
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("NewApplicationAddIcons.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
