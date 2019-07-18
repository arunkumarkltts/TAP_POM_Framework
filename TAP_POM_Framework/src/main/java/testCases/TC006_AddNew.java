package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC006_AddNew extends TapWrappers {
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC006";
		testCaseName = "Add";
		testDescription = "Add new Application";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData")
	public void AddNew(String uName, String pwd, String cTitle, String cSystem, String cInput, String packageName, 
			String activityName, String launchCode, String monthlyPrice,String annualPrice, String airLine, 
			String category, String tyPe, String cKeywords, String cDescription,
			String langApp, String releaseDate, String comingSoon, String webSite, String contentRating, 
			String appResol, String apkSize, String obbSize, String addVideo, String uploadPromo, String addScreenshots){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLogin()
                    	.clickAddNewApplication()
                    	.enterTitle(cTitle)
                    	.selectSystem(cSystem)
                    	.selectInput(cInput)
                    	.enterPackageName(packageName)
                    	.enterActivityName(activityName)
                    	.enterLaunchCode(launchCode)
                    	.enterMonthlyPrice(monthlyPrice)
                    	.enterAnnualPrice(annualPrice)
                    	.selectAirline(airLine)
                    	.selectCategory(category)
                    	.selectType(tyPe)
                    	.selectHTML5SupportedAppYes()
                    	.enterKeywords(cKeywords)
                    	.enterDescription(cDescription)
                    	.selectLanguageAppRunsIn(langApp)
                    	.enterReleaseDate(releaseDate)
                    	.selectComingSoonCategory(comingSoon)
                    	.enterWebsite(webSite)
                    	.selectContentRating(contentRating)
                    	.enterApplicationResolution(appResol)
                    	.enterApkSize(apkSize)
                    	.enterObbSize(obbSize)
                    	.enterAddVideoLinks(addVideo)
                    	.clickUploadPromoImages(uploadPromo)
                    	.clickUploadScreenShots(addScreenshots)
                    	.clickAndroidVersion1_6()
                    	.clickAccelerometer()
                    	.clickInternetUsageYes()
                    	.clickAddNewApplicationButton(cTitle);
	}

}