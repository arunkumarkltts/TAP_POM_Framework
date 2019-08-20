
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0088_DeactiveCompanies extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0088";
		testCaseName = "Deactive Companies";
		testDescription = "Deactivate Companies";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void DeactiveCompanies(String uName, String pwd, String row, String Inactiverow){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickCompanies()
                    	.clickActiveCompanyActions(row)
                    	.clickInactiveCompanyActions(Inactiverow)
                        .clickLogOff();
                    	
	}

}