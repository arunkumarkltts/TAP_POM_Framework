package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.TapWrappers;

public class NewApplicationPage extends TapWrappers{

	public NewApplicationPage(RemoteWebDriver driver, ExtentTest test, String title){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("NewApplication.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, title);		
	}

	public NewApplicationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}

	public NewApplicationPage clickMarkAsInternalApp(){
	    	String markAsInternalApp = prop.getProperty("NewApplication.MarkAsInternalApp.LinkText");
	    	clickByLinkText(markAsInternalApp);
		return this;
	}

	public NewApplicationPage clickNotInternalApp(){
	    	String markAsInternalApp = prop.getProperty("NewApplication.NotInternalApp.LinkText");
	    	clickByLinkText(markAsInternalApp);
		return this;
	}

	public NewApplicationUpdatePage clickEdit(){
	    	String markAsInternalApp = prop.getProperty("NewApplication.Edit.LinkText");
	    	clickByLinkText(markAsInternalApp);
		return new NewApplicationUpdatePage(driver, test);
	}

	public NewApplicationPage selectAppstoreStatus(String data){
	    	String appstoreStatus = prop.getProperty("NewApplication.AppstoreStatus.Xpath");
	    	selectVisibileTextByXPath(appstoreStatus, data);
		return this;
	}

	public NewApplicationPage clickApply(){
	    	String apply = prop.getProperty("NewApplication.Apply.LinkText");
	    	clickByLinkText(apply);
		return this;
	}

	public NewApplicationAddIconsPage clickAddIcons(){
	    	String addIcons = prop.getProperty("NewApplication.AddIcons.LinkText");
	    	clickByLinkText(addIcons);
		return new NewApplicationAddIconsPage(driver, test);
	}

	public NewApplicationUploadApkPage clickUploadApk(){
	    	String uploadApk = prop.getProperty("NewApplication.UploadApk.LinkText");
	    	clickByLinkText(uploadApk);
		return new NewApplicationUploadApkPage(driver, test);
	}

	public NewApplicationAddNotesPage clickAddNotes(){
	    	String addNotes = prop.getProperty("NewApplication.AddNotes.LinkText");
	    	clickByLinkText(addNotes);
		return new NewApplicationAddNotesPage(driver, test);
	}

}
