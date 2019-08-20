package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0136_AppAdminLogin81 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0136";
		testCaseName = "Create New Aircraft";
		testDescription = "Create New Aircraft app_admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AppAdminLogin81(String uName, String pwd, String row, String prog, String progName, 
			String progid, String active, String system){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .selectProgram(prog)
                        .enterProgramName(progName)
                        .enterProgramID(progid)
                        .selectProgramActive(active)
                        .selectSystem(system)
                        .clickSaveProgram()
                        .clickOkButton()
                        .clickLogOff();
                        
	}

}
