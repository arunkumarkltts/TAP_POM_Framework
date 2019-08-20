package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0018_ViewOrderHistory extends TapWrappers {
   
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0018";
		testCaseName = "View Order History ";
		testDescription = "View order History ";
		category = "smoke";
		authors = "Abirami S";
	}

	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickOrderHistory()
                        .clickLogOff();
	}

}
