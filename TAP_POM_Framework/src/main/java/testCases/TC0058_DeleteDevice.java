package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0058_DeleteDevice extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0058";
		testCaseName = "Delete Device";
		testDescription = "Delete Device Misc";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void Miscc(String uName, String pwd){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()                    	
                    	.clickMisc()
                    	.clickDeleteDevice()
                        .clickLogOff();
	}

}