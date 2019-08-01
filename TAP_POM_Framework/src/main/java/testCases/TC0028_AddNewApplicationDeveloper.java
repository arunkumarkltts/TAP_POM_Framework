package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0028_AddNewApplicationDeveloper extends TapWrappers {
	
    	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0028";
		testCaseName = "Add New Application Developer ";
		testDescription = "Add New Application Developer Login  ";
		category = "smoke";
		authors = "Abirami S";		
	}
    	@Test(dataProvider = "fetchData")
    	public void AddNewApplication(String uName, String pwd, String cTitle, String cSystem, String cInput, String packageName, 
    			String activityName, String launchCode, String monthlyPrice,String annualPrice, String airLine, 
    			String category, String tyPe, String cKeywords, String cDescription,
    			String langApp, String releaseDate, String comingSoon, String webSite, String contentRating, 
    			String appResol, String apkSize, String obbSize, String addVideo, String uploadPromo, String addScreenshots){
                            new OpeningPage(driver, test)
                            .clickLogin()
                            .enterEmail(uName)
                        	.enterPassword(pwd)
                        	.clickLoginDeveloperUser()
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

	





