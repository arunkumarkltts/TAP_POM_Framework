package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0114_AirlineLogin54 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0114";
		testCaseName = "AirlineLogin54";
		testDescription = "To Click browse and add apps to this order";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin4(String uName, String pwd, String appName, String copy, String pcDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickMyShoppingCart()
                    	.clickLinkToAddAppsToThisOrder()
                    	.clickAppAddRemoveButton(appName)
                    	.clickMyShoppingCart()
                    	.selectCopyFrom(copy)
                    	.enterRequestedPackageDate(pcDate)
                    	.clickSubmitOrder()
                        .clickLogOff();
                    	
	}

}