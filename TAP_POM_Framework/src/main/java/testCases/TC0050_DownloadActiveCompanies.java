
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0050_DownloadActiveCompanies extends TapWrappers {
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0050";
		testCaseName = "Download Active Companies";
		testDescription = "Download Active Companies List";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickCompanies()
                    	.clickDownloadActiveCompaniesList()
                        .clickLogOff();
	}

}
