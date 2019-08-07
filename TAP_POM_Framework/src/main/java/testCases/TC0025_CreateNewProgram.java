package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0025_CreateNewProgram extends TapWrappers {
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0025";
		testCaseName = "Update Order Status ";
		testDescription = "Update Order Status";
		category = "smoke";
		authors = "Abirami S";
	}
	@Test(dataProvider = "fetchData")
	public void AddNewApplication(String uName, String pwd, String row, String prog, String progName, String progID, String active, String system){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .selectProgram(prog)
                        .enterProgramName(progName)
                        .enterProgramID(progID)
                        .selectProgramActive(active)
                        .selectSystem(system)
                        .clickSaveProgram()
                        .clickOkButton()
                        .clickLogOff();
	}

}
