
package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0019_ValidationMandatory extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0019";
		testCaseName = "Validation check ";
		testDescription = "Validation Check";
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
                    	.clickLoginSuperUser()
                    	.clickAddNewApplication()
                    	.clickAddNewApplicationButton(cTitle);
		
		
	}

}
