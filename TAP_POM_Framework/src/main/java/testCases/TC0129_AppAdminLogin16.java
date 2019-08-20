package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0129_AppAdminLogin16 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0129";
		testCaseName = "Add Notes";
		testDescription = "Add Notes in App Admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AppAdminLogin17(String uName, String pwd, String row, String notes, String publish){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickMyApps()
                    	.clickActiveTitle(row)
                    	.clickAddNotes()
                    	.enterNotes(notes)
                    	.clickPublishForAirline(publish)
                    	.clickUpdateButton()
                        .clickLogOff();
                    	
	}

}