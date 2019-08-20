
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0080_RemoveDiscount extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0080";
		testCaseName = "Remove Discount";
		testDescription = "To Check remove Discount functionality";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void RemoveDiscount(String uName, String pwd, String row, 
			String OrderRow, String discount){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickOrderName(OrderRow)
                    	/*.clickDiscount()
                    	.enterDiscountPrice(discount)
                    	.clickApply()
                    	.clickDiscount()
                    	.clickRemove()*/
                        .clickLogOff();
                    	
	}

}