package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0124_AirlineAddNewOrder extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0124";
		testCaseName = "Add New Order";
		testDescription = "Add New Order in Airline Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin123(String uName, String pwd, String appName, String copy, String pcDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickAppAddButton(appName)
                    	.clickMyShoppingCart()
                    	.selectCopyFrom(copy)
                    	.enterRequestedPackageDate(pcDate)
                    	.clickSubmitOrder()
                        .clickLogOff();
                    	
	}

}