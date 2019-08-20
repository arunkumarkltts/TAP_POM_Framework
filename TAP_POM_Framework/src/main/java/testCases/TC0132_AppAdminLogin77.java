package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0132_AppAdminLogin77 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0132";
		testCaseName = "Remove Apps";
		testDescription = "Remove Apps from My Shopping Cart";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AppAdminLogin77(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                        .clickMediaManager()
                        .clickAirlineDashboard(row)
                        .clickMyShoppingCart()
                        .clickSelectAll()
                        .clickDeleteButton()
                        .clickOkButton()
                        .clickLogOff();
	}

}
