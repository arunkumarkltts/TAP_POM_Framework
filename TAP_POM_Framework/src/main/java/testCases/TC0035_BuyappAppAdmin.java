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
	public void AddNewApplication(String uName, String pwd, String row, String appName, String copy, String pcDate, String startDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .clickLinkToAddAppsToThisOrder()
                        .clickAppAddButton(appName)
                        .clickMyShoppingCart()
                        //.enterOrderName(oName)
                        .selectCopyFrom(copy)
                        .enterRequestedPackageDate(pcDate)
                        .enterOrderStartDate(startDate)
                        .clickSubmitOrder()
                        .clickLogOff();
	}

}
