package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0048_ShoppingcartPop extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0048";
		testCaseName = "Add to Shopping Cart";
		testDescription = "Add to Shopping Cart pop up text";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd, String row, String appName){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                        .clickMediaManager()
                        .clickAirlineDashboard(row)
                        .clickHome()
                        .clickApp(appName)
                        .clickAddToShoppingCart();
            }

}
