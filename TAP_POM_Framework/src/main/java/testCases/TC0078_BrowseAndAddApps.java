
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0078_BrowseAndAddApps extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0078";
		testCaseName = "Browse and Add Apps";
		testDescription = "Click here to Browse and Add Apps to this Order";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void BrowseAndAddApps(String uName, String pwd, String row, String OrderRow){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickOrderName(OrderRow)
                    	.clickEditOrderInfo()
                    	.clickLinkToAddAppsToThisOrder()
                    	//.clickMyShoppingCartIcon()
                        .clickLogOff();
                    	
	}

}