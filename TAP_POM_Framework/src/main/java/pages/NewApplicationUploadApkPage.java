package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.TapWrappers;

public class NewApplicationUploadApkPage extends TapWrappers{

	public NewApplicationUploadApkPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("NewApplicationUploadApk.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Upload APK - logical game");		
	}

	/*Please enter a valid Version like X.Y.Z (Ex: 1.0.032)*/
	public NewApplicationUploadApkPage enterVersion(String data){
	    	String version = prop.getProperty("NewApplicationUploadApk.Version.Xpath");
	    	enterByXpath(version, data);
		return this;
	}

	public NewApplicationUploadApkPage enterNotes(String data){
	    	String notes = prop.getProperty("NewApplicationUploadApk.Notes.Xpath");
	    	enterByXpath(notes, data);
		return this;
	}

	/*Accepted File formats: .xlsx,.xls,.csv,.xml,.doc,.txt,.log*/
	public NewApplicationUploadApkPage clickChooseFile(String data){
	    	String chooseFileButton = prop.getProperty("NewApplicationUploadApk.ChooseFileButton.Xpath");
	    	clickByXpath(chooseFileButton);
	    	sendKeysToWindows(data);
		return this;
	}

	public NewApplicationUploadApkPage clickUploadAFile(String data){
	    	String uploadAFile = prop.getProperty("NewApplicationUploadApk.UploadAFile.Xpath");
	    	clickByXpath(uploadAFile);
	    	sendKeysToWindows(data);
		return this;
	}

	public NewApplicationPage clickCancelButton(){
	    	String cancelButton = prop.getProperty("NewApplicationUploadApk.CancelButton.Xpath");
	    	clickByXpath(cancelButton);
		return new NewApplicationPage(driver, test);
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("NewApplicationUploadApk.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
