package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0119_AirlineLogin91 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0119";
		testCaseName = "Edit Order Info";
		testDescription = "To Click Browse and Add Apps in Edit Order Info Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin91(String uName, String pwd, String OrderRow, 
			String status, String appName){
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
                    	.clickLinkToAddAppsToThisOrder()
                    	.clickAppAddRemoveButton(appName)
                    	.clickMyShoppingCart()
                        .clickLogOff();
                    	
	}

}