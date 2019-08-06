package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0062_DeleteInactiveCompanies extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0062";
		testCaseName = "Delete Inactive Company";
		testDescription = "Delete Inactive Companies in Misc";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData")
	public void Miscc(String uName, String pwd){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()                    	
                    	.clickMisc()
                    	.clickDeleteInactiveCompany()
                        .clickLogOff();
	}

}