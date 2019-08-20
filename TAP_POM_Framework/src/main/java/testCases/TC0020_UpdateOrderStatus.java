package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0020_UpdateOrderStatus extends TapWrappers {
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0020";
		testCaseName = "Update Order Status ";
		testDescription = "Update Order Status";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd, String row, String crow, String status){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickOrderName(crow)
                        .selectStatus(status)
                        .clickApply()
                        .clickLogOff();
	}

}
