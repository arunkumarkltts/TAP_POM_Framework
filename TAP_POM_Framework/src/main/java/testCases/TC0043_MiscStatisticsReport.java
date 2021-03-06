
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0043_MiscStatisticsReport extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0043";
		testCaseName = "Statistics Report";
		testDescription = "Check Statistics Report";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void MiscStatisticsReport(String uName, String pwd){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickMisc()
                    	//.clickStatisticsReport()
                        .clickLogOff();
                    	
                    	
	}

}