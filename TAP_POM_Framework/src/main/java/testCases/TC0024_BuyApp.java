package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0024_BuyApp extends TapWrappers {
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0024";
		testCaseName = "Buy App in Shopping Cart";
		testDescription = "Buy App in Shopping Cart ";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData")
	public void AddNewApplication(String uName, String pwd, String row, String copy, String appName, String pcDate, String startDate, String endDate){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .clickLinkToAddAppsToThisOrder()
                        .clickAppAddButton(appName)
                        .clickMyShoppingCart()
                        .selectCopyFrom(copy)
                        .enterRequestedPackageDate(pcDate)
                        .enterOrderStartDate(startDate)
                        .enterOrderEndDate(endDate)
                        .clickSubmitOrder()
                        .clickLogOff();

                        
            }

}
