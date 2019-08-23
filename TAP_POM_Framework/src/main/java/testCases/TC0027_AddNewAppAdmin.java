package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0027_AddNewAppAdmin extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0027";
		testCaseName = "Add New Application App Admin Login";
		testDescription = "Add new Application App admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd, String cTitle, String cSystem, String cInput, String packageName, 
			String activityName, String launchCode, String monthlyPrice,String annualPrice, String airLine, 
			String category, String tyPe, String cKeywords, String cDescription,
			String langApp, String releaseDate, String comingSoon, String webSite, String contentRating, 
			String appResol, String apkSize, String obbSize, String addVideo){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
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
                        .clickAndroidVersion4_4()
                    	.clickAccelerometer()
                    	.clickInternetUsageYes()
                    	.clickAddNewApplicationButton(cTitle);
	}

}