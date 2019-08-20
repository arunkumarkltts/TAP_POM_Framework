
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0073_DuplicateOrderName extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0073";
		testCaseName = "Duplicate Order Name";
		testDescription = "Duplicate Order Name Check";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void StoreReports(String uName, String pwd, String row,
			String copy, String date){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickMyShoppingCart()
                    	.selectCopyFrom(copy)
                    	.enterRequestedPackageDate(date)
                    	.clickSubmitOrder();
                        //.clickLogOff();
                    	
	}

}