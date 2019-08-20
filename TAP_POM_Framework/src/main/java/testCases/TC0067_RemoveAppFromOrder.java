
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0067_RemoveAppFromOrder extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0067";
		testCaseName = "Remove App From Order";
		testDescription = "Remove App From Order in Order Summary Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void MiscStatisticsReport(String uName, String pwd, String row, 
			String OrderRow, String status, String appName){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickOrderName(OrderRow)
                    	.selectStatus(status)
                    	.clickApply()
                    	.clickRemoveAppFromOrder(appName)
                    	.clickOkButton()
                        .clickLogOff();
	}

}