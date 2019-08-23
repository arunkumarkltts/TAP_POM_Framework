
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0139_AppAdminLogin116 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0139";
		testCaseName = "Jump To Inactive and Active";
		testDescription = "Jump To Inactive and Active in App Admi Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AppAdminLogin116(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickCompanies()
                    	.clickJumpToInactive()
                    	.clickJumpToActive()
                    	.clickDownloadActiveCompaniesList()
                    	.clickActiveCompanyName(row)
                    	.clickClearSearch()
                        .clickLogOff();
                    	
	}

}