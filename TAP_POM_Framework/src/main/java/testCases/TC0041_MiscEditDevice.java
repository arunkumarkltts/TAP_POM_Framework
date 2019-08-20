package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0041_MiscEditDevice extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0041";
		testCaseName = "List Edit Device";
		testDescription = "check List Edit Device Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void Miscc(String uName, String pwd){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickMisc()
                    	.clickListEditDevices()
                        .clickLogOff();
                    	
                    	
	}

}