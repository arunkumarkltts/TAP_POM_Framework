
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0049_DownloadStoreReports extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0049";
		testCaseName = "Download All Data";
		testDescription = "Download All Data in Store Reports Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void StoreReports(String uName, String pwd){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickStoreReports()
                    	.clickDownloadAllData()
                        //System.out.println("success");
                        .clickLogOff();
                        
                    	
                    	
	}

}