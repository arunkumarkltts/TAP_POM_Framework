
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0079_EditOrderInfoProgramAircraft extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0079";
		testCaseName = "Edit Order Info New Program and Aircraft";
		testDescription = "Edit Order Info New Program and Aircraft";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void EditOrderInfo(String uName, String pwd, String row, 
			String OrderRow, String program){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMediaManager()
                    	.clickAirline(row)
                    	.clickOrderName(OrderRow)
                    	.clickEditOrderInfo()
                    	.selectProgram(program)
                    	.clickAircraftNew();
                        //.clickLogOff();
                    	
	}

}