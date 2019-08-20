
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0069_Discount extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0069";
		testCaseName = "Dicount";
		testDescription = "Dicouont Functionality";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData")
	public void Discount(String uName, String pwd, String row, String Orderrow, 
			String appName, String discountPrice, String discountNote){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickOrderName(Orderrow)
                    	.clickDiscount(appName)
                    	.enterDiscountPrice(appName, discountPrice)                   	
                    	.enterDiscountNote(appName, discountNote)
                    	.clickApply()
                        .clickLogOff();
                    	
	}

}