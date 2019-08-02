package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0040_BuyappAppAdmin extends TapWrappers {
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0040";
		testCaseName = "Buy App in Shopping Cart App Admin login";
		testDescription = "Buy App in Shopping Cart App Admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData")
	public void AddNewApplication(String uName, String pwd, String row, String appName, String oName, String copy, String pcDate, String startDate, String endDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                        .clickMediaManager()
                        .clickAirline("1")
                        .clickMyShoppingCart()
                        .clickLinkToAddAppsToThisOrder()
                        .clickAppAddButton(appName)
                        .clickMyShoppingCart()
                        .enterOrderName(oName)
                        .selectCopyFrom(copy)
                        .enterRequestedPackageDate(pcDate)
                        .enterOrderStartDate(startDate)
                        .enterOrderEndDate(endDate)
                        .clickSubmitOrder()
                        .clickLogOff();
	}

}
