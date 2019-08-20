package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0015_UpdateApplication extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0015";
		testCaseName = "Update Application";
		testDescription = "Update Application";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd, String row, String title, 
			String packageName, String activity, String launch, String monthlyPrice, 
			String annualPrice, String system, String input, String airline, String category, 
			String type,  String keywords, String description, String langapp, String date, String website, 
			String content, String appResol, String apk, String obb, String video){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMyApps()
                    	.clickActiveTitle(row)
                    	.clickEdit()
                    	.enterTitle(title)
                    	.enterPackageName(packageName)
                    	.enterActivityName(activity)
                    	.enterLaunchCode(launch)
                    	.enterMonthlyPrice(monthlyPrice)
                    	.enterAnnualPrice(annualPrice)
                    	.selectSystem(system)
                    	.selectInput(input)
                    	.selectAirline(airline)
                    	.selectCategory(category)
                    	.selectType(type)
                    	.enterKeywords(keywords)
                    	.enterDescription(description)
                    	.selectLanguageAppRunsIn(langapp)
                    	.enterReleaseDate(date)
                    	.enterWebsite(website)
                    	.selectContentRating(content)
                        .enterApplicationResolution(appResol)
                    	.enterApkSize(apk)
                    	.enterObbSize(obb)
                    	.enterAddVideoLinks(video)
                    	.clickUpdateApplicationButton();
                    	
    }
}