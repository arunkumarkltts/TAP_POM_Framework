package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0035_BuyappAppAdmin extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0035";
		testCaseName = "Buy App in Shopping Cart App Admin login";
		testDescription = "Buy App in Shopping Cart App Admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd, String row, String appName, String copy,
			String orderName, String pcDate, String startDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .clickLinkToAddAppsToThisOrder()
                        .clickAppAddRemoveButton(appName)
                        .clickMyShoppingCart()
                        .selectCopyFrom(copy)
                        .enterOrderName(orderName)
                        .enterRequestedPackageDate(pcDate)
                        .enterOrderStartDate(startDate)
                        .clickSubmitOrder()
                        .clickLogOff();
	}

}
