
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0077_EditOrderInfo extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0077";
		testCaseName = "Edit Order Info";
		testDescription = "Edit Order Info in Order Summary Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void EditOrderInfo(String uName, String pwd, String row, 
			String OrderRow, String orderName, String Description, 
			String copy, String packageDate, String startDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickOrderName(OrderRow)
                    	.clickEditOrderInfo()
                    	.enterOrderName(orderName)
                    	.enterDescription(Description)
                    	.selectCopyFrom(copy)
                    	.enterRequestedPackageDate(packageDate)
                    	.enterOrderStartDate(startDate)
                    	.clickUpdateOrder()
                        .clickLogOff();
                    	
	}

}