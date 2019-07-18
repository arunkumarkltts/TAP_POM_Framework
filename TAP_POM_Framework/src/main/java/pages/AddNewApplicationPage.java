package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.TapWrappers;

public class AddNewApplicationPage extends TapWrappers{

	public AddNewApplicationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("AddNewApplication.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "New Application");		
	}

	public AddNewApplicationPage enterTitle(String data){
	    	String title = prop.getProperty("AddNewApplication.Title.Xpath");
		enterByXpath(title, data);
		return this;
	}
	
	public AddNewApplicationPage selectSystem(String data){
	    	String systemDropDown = prop.getProperty("AddNewApplication.SystemDropDown.Xpath");
	    	selectVisibileTextByXPath(systemDropDown, data);
		return this;
	}
	
	public AddNewApplicationPage selectInput(String data){
	    	String inputDropDown = prop.getProperty("AddNewApplication.InputDropDown.Xpath");
	    	selectVisibileTextByXPath(inputDropDown, data);
		return this;
	}
	
	public AddNewApplicationPage enterPackageName(String data){
	    	String packageName = prop.getProperty("AddNewApplication.PackageName.Xpath");
	    	enterByXpath(packageName, data);
		return this;
	}
	
	public AddNewApplicationPage enterActivityName(String data){
	    	String activityName = prop.getProperty("AddNewApplication.ActivityName.Xpath");
	    	enterByXpath(activityName, data);
		return this;
	}
	
	public AddNewApplicationPage enterLaunchCode(String data){
	    	String launchCode = prop.getProperty("AddNewApplication.LaunchCode.Xpath");
	    	enterByXpath(launchCode, data);
		return this;
	}
	
	public AddNewApplicationPage enterMonthlyPrice(String data){
	    	String monthlyPrice = prop.getProperty("AddNewApplication.ListMonthlyPrice.Xpath");
	    	enterByXpath(monthlyPrice, data);
		return this;
	}
	
	public AddNewApplicationPage enterAnnualPrice(String data){
	    	String annualPrice = prop.getProperty("AddNewApplication.ListAnnualPrice.Xpath");
	    	enterByXpath(annualPrice, data);
		return this;
	}

	public AddNewApplicationPage selectAirline(String data){
	    	String activityName = prop.getProperty("AddNewApplication.AirlineDropDown.Xpath");
	    	selectVisibileTextByXPath(activityName, data);
		return this;
	}
	
	public AddNewApplicationPage selectCategory(String data){
	    	String category = prop.getProperty("AddNewApplication.CategoryDropDown.Xpath");
	    	selectVisibileTextByXPath(category, data);
		return this;
	}
	
	public AddNewApplicationPage selectType(String data){
	    	String type = prop.getProperty("AddNewApplication.TypeDropDown.Xpath");
	    	selectVisibileTextByXPath(type, data);
		return this;
	}
	
	public AddNewApplicationPage selectPlayers(String data){
	    	String players = prop.getProperty("AddNewApplication.PlayerDropDown.Xpath");
	    	selectVisibileTextByXPath(players, data);
		return this;
	}

	public AddNewApplicationPage selectHTML5SupportedAppYes(){
	    	String html5Yes = prop.getProperty("AddNewApplication.Html5YesRadioButton.Xpath");
	    	clickByXpath(html5Yes);
		return this;
	}
	
	public AddNewApplicationPage selectHTML5SupportedAppNo(){
	    	String html5No = prop.getProperty("AddNewApplication.Html5NoRadioButton.Xpath");
	    	clickByXpath(html5No);
		return this;
	}
	
	public AddNewApplicationPage enterKeywords(String data){
	    	String keywords = prop.getProperty("AddNewApplication.Keywords.Xpath");
	    	enterByXpath(keywords, data);
		return this;
	}
	
	public AddNewApplicationPage enterDescription(String data){
	    	String description = prop.getProperty("AddNewApplication.Description.Xpath");
	    	enterByXpath(description, data);
		return this;
	}
	
	public AddNewApplicationPage selectLanguageCustomization(String data){
	    	String language = prop.getProperty("AddNewApplication.LanguageCustomization.Xpath");
	    	selectVisibileTextByXPath(language, data);
		return this;
	}
	
	public AddNewApplicationPage selectLanguageAppRunsIn(String data){
	    	String appLanguage = prop.getProperty("AddNewApplication.LanguageAppRuns.Xpath");
	    	selectVisibileTextByXPath(appLanguage, data);
		return this;
	}
	
	public AddNewApplicationPage enterReleaseDate(String data){
	    	String releaseDate = prop.getProperty("AddNewApplication.ReleaseDate.Xpath");
	    	enterByXpath(releaseDate, data);
		return this;
	}
	
	public AddNewApplicationPage selectComingSoonCategory(String data){
	    	String comingSoonCategory = prop.getProperty("AddNewApplication.ComingSoonCategory.Xpath");
	    	selectVisibileTextByXPath(comingSoonCategory, data);
		return this;
	}
	
	public AddNewApplicationPage enterWebsite(String data){
	    	String website = prop.getProperty("AddNewApplication.Website.Xpath");
	    	enterByXpath(website, data);
		return this;
	}
	
	public AddNewApplicationPage selectContentRating(String data){
	    	String contentRating = prop.getProperty("AddNewApplication.ContentRating.Xpath");
	    	selectVisibileTextByXPath(contentRating, data);
		return this;
	}
	
	public AddNewApplicationPage enterApplicationResolution(String data){
	    	String applicationResolution = prop.getProperty("AddNewApplication.ApplicationResolution.Xpath");
	    	enterByXpath(applicationResolution, data);
		return this;
	}
	
	public AddNewApplicationPage enterApkSize(String data){
	    	String apkSize = prop.getProperty("AddNewApplication.ApkSize.Xpath");
	    	enterByXpath(apkSize, data);
		return this;
	}
	
	public AddNewApplicationPage enterObbSize(String data){
	    	String obbSize = prop.getProperty("AddNewApplication.ObbSize.Xpath");
	    	enterByXpath(obbSize, data);
		return this;
	}
	
	public AddNewApplicationPage enterAddVideoLinks(String data){
	    	String addVideoLinks = prop.getProperty("AddNewApplication.AddVideoLinks.Xpath");
	    	enterByXpath(addVideoLinks, data);
		return this;
	}

	public AddNewApplicationPage clickUploadPromoImages(String data){
	    	String promoImages = prop.getProperty("AddNewApplication.UploadPromoImages.Xpath");
	    	clickByXpath(promoImages);
	    	sendKeysToWindows(data);
		return this;
	}

	public AddNewApplicationPage clickUploadScreenShots(String data){
	    	String screenShots = prop.getProperty("AddNewApplication.UploadScreenShots.Xpath");
	    	clickByXpath(screenShots);
	    	sendKeysToWindows(data);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion4_4(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion4_4.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion1_6(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion1_6.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion2_0(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion2_0.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion2_1(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion2_1.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion2_2(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion2_2.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion2_3(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion2_3.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion3_0(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion3_0.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion3_1(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion3_1.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion3_2(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion3_2.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion4_0(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion4_0.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAndroidVersion4_1(){
	    	String androidVersion = prop.getProperty("AddNewApplication.AndroidVersion4_1.Xpath");
	    	clickByXpath(androidVersion);
		return this;
	}
	
	public AddNewApplicationPage clickAccelerometer(){
	    	String hardware = prop.getProperty("AddNewApplication.HardwareAccelerometerCheckbox.Xpath");
	    	clickByXpath(hardware);
		return this;
	}
	
	public AddNewApplicationPage clickGyroscope(){
	    	String hardware = prop.getProperty("AddNewApplication.HardwareGyroscopeCheckbox.Xpath");
	    	clickByXpath(hardware);
		return this;
	}
	
	public AddNewApplicationPage clickCompass(){
	    	String hardware = prop.getProperty("AddNewApplication.HardwareCompassCheckbox.Xpath");
	    	clickByXpath(hardware);
		return this;
	}
	
	public AddNewApplicationPage clickOrientation(){
	    	String hardware = prop.getProperty("AddNewApplication.HardwareOrientationCheckbox.Xpath");
	    	clickByXpath(hardware);
		return this;
	}
	
	public AddNewApplicationPage clickInternetUsageYes(){
	    	String internetUsage = prop.getProperty("AddNewApplication.InternetUsageYesRadioButton.Xpath");
	    	clickByXpath(internetUsage);
		return this;
	}
	
	public AddNewApplicationPage clickInternetUsageNo(){
	    	String internetUsage = prop.getProperty("AddNewApplication.InternetUsageNoRadioButton.Xpath");
	    	clickByXpath(internetUsage);
		return this;
	}
	
	public AddNewApplicationPage clickCancelButton(){
	    	String cancelButton = prop.getProperty("AddNewApplication.CancelButton.Xpath");
	    	clickByXpath(cancelButton);
		return this;
	}
	
	public NewApplicationPage clickAddNewApplicationButton(String title){
	    	String addNewApplicationButton = prop.getProperty("AddNewApplication.AddNewApplicationButton.Xpath");
	    	clickByXpath(addNewApplicationButton);
		return new NewApplicationPage(driver, test, title);
	}

}
