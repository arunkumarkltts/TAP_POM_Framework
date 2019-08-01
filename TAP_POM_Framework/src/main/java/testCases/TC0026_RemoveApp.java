package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0026_RemoveApp extends TapWrappers {
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0026";
		testCaseName = "Remove App From Shopping Cart";
		testDescription = "Remove App From Shopping Cart";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData")
	public void AddNewApplication(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .clickSelectAll()
                        .clickDeleteButton()
                        .clickOkButton()
                        .clickLogOff();
	}

}
