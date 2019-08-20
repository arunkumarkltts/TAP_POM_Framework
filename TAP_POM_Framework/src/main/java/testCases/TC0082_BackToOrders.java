
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0082_BackToOrders extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0082";
		testCaseName = "Back To Orders";
		testDescription = "Back To Orders";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void BackToOrders(String uName, String pwd, String row, String orderName){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickOrderName(orderName)
                    	/*.clickEditOrderInfo()
                    	.clickLinkToAddAppsToThisOrder()
                    	.clickBack()*/
                        .clickLogOff();
                    	
	}

}