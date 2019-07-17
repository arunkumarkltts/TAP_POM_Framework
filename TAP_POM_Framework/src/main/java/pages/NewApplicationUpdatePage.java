package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.TapWrappers;

public class NewApplicationUpdatePage extends TapWrappers{

	public NewApplicationUpdatePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("NewApplicationUpdate.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Update Application");		
	}

	public NewApplicationUpdatePage enterTitle(String data){
	    	String title = prop.getProperty("NewApplicationUpdate.Title.Xpath");
		enterByXpath(title, data);
		return this;
	}

	public NewApplicationUpdatePage enterPackageName(String data){
	    	String packageName = prop.getProperty("NewApplicationUpdate.PackageName.Xpath");
	    	enterByXpath(packageName, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterActivityName(String data){
	    	String activityName = prop.getProperty("NewApplicationUpdate.ActivityName.Xpath");
	    	enterByXpath(activityName, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterLaunchCode(String data){
	    	String launchCode = prop.getProperty("NewApplicationUpdate.LaunchCode.Xpath");
	    	enterByXpath(launchCode, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterMonthlyPrice(String data){
	    	String monthlyPrice = prop.getProperty("NewApplicationUpdate.ListMonthlyPrice.Xpath");
	    	enterByXpath(monthlyPrice, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterAnnualPrice(String data){
	    	String annualPrice = prop.getProperty("NewApplicationUpdate.ListAnnualPrice.Xpath");
	    	enterByXpath(annualPrice, data);
		return this;
	}

	public NewApplicationUpdatePage selectSystem(String data){
	    	String systemDropDown = prop.getProperty("NewApplicationUpdate.SystemDropDown.Xpath");
	    	selectVisibileTextByXPath(systemDropDown, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectInput(String data){
	    	String inputDropDown = prop.getProperty("NewApplicationUpdate.InputDropDown.Xpath");
	    	selectVisibileTextByXPath(inputDropDown, data);
		return this;
	}

	public NewApplicationUpdatePage selectAirline(String data){
	    	String activityName = prop.getProperty("NewApplicationUpdate.AirlineDropDown.Xpath");
	    	selectVisibileTextByXPath(activityName, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectCatergory(String data){
	    	String category = prop.getProperty("NewApplicationUpdate.CategoryDropDown.Xpath");
	    	selectVisibileTextByXPath(category, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectType(String data){
	    	String type = prop.getProperty("NewApplicationUpdate.TypeDropDown.Xpath");
	    	selectVisibileTextByXPath(type, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectHTML5SupportedAppYes(){
	    	String html5Yes = prop.getProperty("NewApplicationUpdate.Html5YesRadioButton.Xpath");
	    	clickByXpath(html5Yes);
		return this;
	}
	
	public NewApplicationUpdatePage selectHTML5SupportedAppNo(){
	    	String html5No = prop.getProperty("NewApplicationUpdate.Html5NoRadioButton.Xpath");
	    	clickByXpath(html5No);
		return this;
	}
	
	public NewApplicationUpdatePage enterKeywords(String data){
	    	String keywords = prop.getProperty("NewApplicationUpdate.Keywords.Xpath");
	    	enterByXpath(keywords, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterDescription(String data){
	    	String description = prop.getProperty("NewApplicationUpdate.Description.Xpath");
	    	enterByXpath(description, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectLanguageCustomization(String data){
	    	String language = prop.getProperty("NewApplicationUpdate.LanguageCustomization.Xpath");
	    	selectVisibileTextByXPath(language, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectLanguageAppRunsIn(String data){
	    	String appLanguage = prop.getProperty("NewApplicationUpdate.LanguageAppRuns.Xpath");
	    	selectVisibileTextByXPath(appLanguage, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterReleaseDate(String data){
	    	String releaseDate = prop.getProperty("NewApplicationUpdate.ReleaseDate.Xpath");
	    	enterByXpath(releaseDate, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectComingSoonCategory(String data){
	    	String comingSoonCategory = prop.getProperty("NewApplicationUpdate.ComingSoonCategory.Xpath");
	    	selectVisibileTextByXPath(comingSoonCategory, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterWebsite(String data){
	    	String website = prop.getProperty("NewApplicationUpdate.Website.Xpath");
	    	enterByXpath(website, data);
		return this;
	}
	
	public NewApplicationUpdatePage selectContentRating(String data){
	    	String contentRating = prop.getProperty("NewApplicationUpdate.ContentRating.Xpath");
	    	selectVisibileTextByXPath(contentRating, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterApplicationResolution(String data){
	    	String applicationResolution = prop.getProperty("NewApplicationUpdate.ApplicationResolution.Xpath");
	    	enterByXpath(applicationResolution, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterApkSize(String data){
	    	String apkSize = prop.getProperty("NewApplicationUpdate.ApkSize.Xpath");
	    	enterByXpath(apkSize, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterObbSize(String data){
	    	String obbSize = prop.getProperty("NewApplicationUpdate.ObbSize.Xpath");
	    	enterByXpath(obbSize, data);
		return this;
	}
	
	public NewApplicationUpdatePage enterAddVideoLinks(String data){
	    	String addVideoLinks = prop.getProperty("NewApplicationUpdate.AddVideoLinks.Xpath");
	    	enterByXpath(addVideoLinks, data);
		return this;
	}

	public NewApplicationUpdatePage clickUploadPromoImages(String data){
	    	String promoImages = prop.getProperty("NewApplicationUpdate.UploadPromoImages.Xpath");
	    	clickByXpath(promoImages);
	    	sendKeysToWindows(data);
		return this;
	}
	
	public NewApplicationUpdatePage clickUploadScreenShots(String data){
	    	String screenShots = prop.getProperty("NewApplicationUpdate.UploadScreenShots.Xpath");
	    	clickByXpath(screenShots);
	    	sendKeysToWindows(data);
		return this;
	}
	
	public NewApplicationUpdatePage clickCancelButton(){
	    	String cancelButton = prop.getProperty("NewApplicationUpdate.CancelButton.Xpath");
	    	clickByXpath(cancelButton);
		return this;
	}
	
	public NewApplicationUpdatePage clickUpdateApplicationButton(){
	    	String updateApplicationButton = prop.getProperty("NewApplicationUpdate.UpdateApplicationButton.Xpath");
	    	clickByXpath(updateApplicationButton);
		return this;
	}
	
	public NewApplicationPage confirmAction(){
	    	acceptAlert();
		return new NewApplicationPage(driver, test);
	}
	
	public NewApplicationPage cancelAction(){
	    	dismissAlert();
		return new NewApplicationPage(driver, test);
	}

}
