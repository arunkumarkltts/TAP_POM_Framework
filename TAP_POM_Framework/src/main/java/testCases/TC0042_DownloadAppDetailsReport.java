
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0042_DownloadAppDetailsReport extends TapWrappers {
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0042";
		testCaseName = "Download all App Details Report";
		testDescription = "Download all App Details Report";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData")
	public void AddNewApplication(String uName, String pwd){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickDownloadActiveApplications()
                        .clickLogOff();
	}

}
