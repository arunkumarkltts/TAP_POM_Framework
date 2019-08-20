package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0118_AirlineLogin88 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC00118";
		testCaseName = "Edit Order Info";
		testDescription = "To delete selected apps in Edit Order Info Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin88(String uName, String pwd, String OrderRow, 
			String status){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickOrderHistory()
                    	.clickOrderName(OrderRow)
                    	.selectStatus(status)
                    	.clickApply()
                    	.clickEditOrderInfo()
                    	.clickSelectAll()
                    	.clickDeleteButton()
                    	.clickOkButton()
                        .clickLogOff();
                    	
	}

}