
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0043_DownloadActiveUserDetails extends TapWrappers {
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0043";
		testCaseName = "Download all Active Users Detail Report";
		testDescription = "Download all Active Users Detail Report";
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
                    	.clickUsers()
                    	.clickDownloadActiveUserList()
                    	.clickLogOff();
	}

}
