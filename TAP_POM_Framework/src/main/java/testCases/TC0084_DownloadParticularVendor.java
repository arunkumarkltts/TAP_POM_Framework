
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0084_DownloadParticularVendor extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0084";
		testCaseName = "Download Particular Vendor";
		testDescription = "Download Particular Vendor";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void DownloadParticularVendor(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickStoreReports()
                    	.clickVendorName(row)
                    	.clickDownloadVendorReport()
                        .clickLogOff();
                    	
	}

}