package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class NewApplicationPage extends TapWrappers{

	public NewApplicationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("NewApplication.PageVerification.Xpath");
		verifyTextById(pageVerification, "New Application");		
	}
	
	public NewApplicationPage enterTitle(String data){
	    	String title = prop.getProperty("NewApplication.Title.Xpath");
		enterByXpath(title, data);
		return this;
	}
	
	public NewApplicationPage selectSystem(String data){
	    	String systemDropDown = prop.getProperty("NewApplication.SystemDropDown.Xpath");
	    	selectVisibileTextByXPath(systemDropDown, data);
		return this;
	}
	
	public NewApplicationPage selectInput(String data){
	    	String inputDropDown = prop.getProperty("NewApplication.InputDropDown.Xpath");
	    	selectVisibileTextByXPath(inputDropDown, data);
		return this;
	}
	
	public NewApplicationPage enterPackageName(String data){
	    	String packageName = prop.getProperty("NewApplication.PackageName.Xpath");
	    	enterByXpath(packageName, data);
		return this;
	}
	
	public NewApplicationPage enterActivityName(String data){
	    	String activityName = prop.getProperty("NewApplication.ActivityName.Xpath");
	    	enterByXpath(activityName, data);
		return this;
	}
	
	public NewApplicationPage enterLaunchCode(String data){
	    	String launchCode = prop.getProperty("NewApplication.LaunchCode.Xpath");
	    	enterByXpath(launchCode, data);
		return this;
	}
	
	public NewApplicationPage enterMonthlyPrice(String data){
	    	String monthlyPrice = prop.getProperty("NewApplication.ListMonthlyPrice.Xpath");
	    	enterByXpath(monthlyPrice, data);
		return this;
	}
	
	public NewApplicationPage enterAnnualPrice(String data){
	    	String annualPrice = prop.getProperty("NewApplication.ListAnnualPrice.Xpath");
	    	enterByXpath(annualPrice, data);
		return this;
	}
	
	public NewApplicationPage selectAirline(String data){
	    	String activityName = prop.getProperty("NewApplication.AirlineDropDown.Xpath");
	    	selectVisibileTextByXPath(activityName, data);
		return this;
	}
	
	public NewApplicationPage selectCatergory(String data){
	    	String category = prop.getProperty("NewApplication.CategoryDropDown.Xpath");
	    	selectVisibileTextByXPath(category, data);
		return this;
	}
	
	public NewApplicationPage selectType(String data){
	    	String type = prop.getProperty("NewApplication.TypeDropDown.Xpath");
	    	selectVisibileTextByXPath(type, data);
		return this;
	}
	
	public NewApplicationPage selectHTML5SupportedAppYes(){
	    	String html5Yes = prop.getProperty("NewApplication.Html5YesRadioButton.Xpath");
	    	clickByXpath(html5Yes);
		return this;
	}
	
	public NewApplicationPage selectHTML5SupportedAppNo(){
	    	String html5No = prop.getProperty("NewApplication.Html5NoRadioButton.Xpath");
	    	clickByXpath(html5No);
		return this;
	}
	
	public NewApplicationPage enterKeywords(String data){
	    	String keywords = prop.getProperty("NewApplication.Keywords.Xpath");
	    	enterByXpath(keywords, data);
		return this;
	}
	
	public NewApplicationPage enterDescription(String data){
	    	String description = prop.getProperty("NewApplication.Description.Xpath");
	    	enterByXpath(description, data);
		return this;
	}
	
	public NewApplicationPage selectLanguageCustomization(String data){
	    	String language = prop.getProperty("NewApplication.LanguageCustomization.Xpath");
	    	selectVisibileTextByXPath(language, data);
		return this;
	}
	
	public NewApplicationPage selectLanguageAppRunsIn(String data){
	    	String appLanguage = prop.getProperty("NewApplication.LanguageAppRuns.Xpath");
	    	selectVisibileTextByXPath(appLanguage, data);
		return this;
	}
	
	public NewApplicationPage enterReleaseDate(String data){
	    	String releaseDate = prop.getProperty("NewApplication.ReleaseDate.Xpath");
	    	selectVisibileTextByXPath(releaseDate, data);
		return this;
	}
	
	public NewApplicationPage selectComingSoonCategory(String data){
	    	String comingSoonCategory = prop.getProperty("NewApplication.ComingSoonCategory.Xpath");
	    	selectVisibileTextByXPath(comingSoonCategory, data);
		return this;
	}
	
	public NewApplicationPage enterWebsite(String data){
	    	String website = prop.getProperty("NewApplication.Website.Xpath");
	    	enterByXpath(website, data);
		return this;
	}
	
	public NewApplicationPage selectContentRating(String data){
	    	String contentRating = prop.getProperty("NewApplication.ContentRating.Xpath");
	    	selectVisibileTextByXPath(contentRating, data);
		return this;
	}
	
	public NewApplicationPage enterApplicationResolution(String data){
	    	String applicationResolution = prop.getProperty("NewApplication.ApplicationResolution.Xpath");
	    	enterByXpath(applicationResolution, data);
		return this;
	}
	
	public NewApplicationPage enterApkSize(String data){
	    	String apkSize = prop.getProperty("NewApplication.ApkSize.Xpath");
	    	enterByXpath(apkSize, data);
		return this;
	}
	
	public NewApplicationPage enterObbSize(String data){
	    	String obbSize = prop.getProperty("NewApplication.ObbSize.Xpath");
	    	enterByXpath(obbSize, data);
		return this;
	}
	
	public NewApplicationPage enterAddVideoLinks(String data){
	    	String addVideoLinks = prop.getProperty("NewApplication.AddVideoLinks.Xpath");
	    	enterByXpath(addVideoLinks, data);
		return this;
	}

	public HomePage clickLogin(){
	    	String loginButton = prop.getProperty("Login.LoginButton.Xpath");
		clickByXpath(loginButton);
		return new HomePage(driver, test);
	}
	
}
