
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0076_ViewAllAircraft extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0076";
		testCaseName = "View All Aircraft";
		testDescription = "View All Aircraft in Order Summary Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void ViewAllAircraft(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickMyShoppingCart()
                    	.clickAircraftNew()
                    	.clickViewAllAircraftButton()
                        .clickLogOff();
                    	
	}

}