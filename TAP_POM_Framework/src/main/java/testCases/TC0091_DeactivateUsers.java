
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0091_DeactivateUsers extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0091";
		testCaseName = "Deactivate Users";
		testDescription = "Activate and Deactivate in Users Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void DeactivateUsers(String uName, String pwd, String row, String Inactiverow){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickUsers()
                    	.clickActiveUsersActions(row)
                    	.clickInactiveUsersCompanyName(Inactiverow)
                        .clickLogOff();
                    	
	}

}