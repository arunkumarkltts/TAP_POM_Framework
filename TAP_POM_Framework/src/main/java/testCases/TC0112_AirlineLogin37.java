package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0112_AirlineLogin37 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0112";
		testCaseName = "AirlineLogin37";
		testDescription = "My Shopping Cart Page";
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
                    	.clickAppAddButton(appName)
                    	.clickMyShoppingCart()
                    	.selectCopyFrom(copy)
                    	.enterRequestedPackageDate(pcDate)
                    	.clickSubmitOrder()
                        .clickLogOff();
                    	
	}

}