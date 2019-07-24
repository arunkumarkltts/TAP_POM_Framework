package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0029_BrowseAppDeveloper extends TapWrappers {
	
    	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0029";
		testCaseName = "Browse App Developer ";
		testDescription = "Browse App Developer";
		category = "smoke";
		authors = "Abirami S";		
	}
    	@Test(dataProvider = "fetchData")
    	public void AddNewApplication(String uName, String pwd){
                            new OpeningPage(driver, test)
                            .clickLogin()
                            .enterEmail(uName)
                        	.enterPassword(pwd)
                        	.clickLoginDeveloperUser()
                        	.clickBrowseApps()
                        	.clickLogOff();
    	}
}