
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0081_DisplayAllApps extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0081";
		testCaseName = "Display All Apps";
		testDescription = "Display All Apps for Particular Company";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void DisplayAllApps(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirlineDashboard(row)
                    	//.clickAppCompanyName()
                        .clickLogOff();
                    	
	}

}