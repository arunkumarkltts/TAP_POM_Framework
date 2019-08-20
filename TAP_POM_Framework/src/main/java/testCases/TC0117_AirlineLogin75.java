package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0117_AirlineLogin75 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC00117";
		testCaseName = "Edit Order Info";
		testDescription = "Edit Order Info in Order Summary Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin75(String uName, String pwd, String OrderRow, 
			String status, String orderName, String Description, String copy, String packageDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickOrderHistory()
                    	.clickOrderName(OrderRow)
                    	.selectStatus(status)
                    	.clickApply()
                    	.clickEditOrderInfo()
                    	.enterOrderName(orderName)
                    	.enterDescription(Description)
                    	.selectCopyFrom(copy)
                    	.enterRequestedPackageDate(packageDate)
                    	.clickUpdateOrder()
                        .clickLogOff();
                    	
	}

}