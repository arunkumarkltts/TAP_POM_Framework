package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0032_AutoNotificationEmail extends TapWrappers {
	
    @BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0032";
		testCaseName = "Update Auto Notification Email ON/OFF in App Admin Login";
		testDescription = "Update Auto Notification Email ON/OFF in App Admin Login";
		category = "smoke";
		authors = "Abirami S";		
	}

    	@Test(dataProvider = "fetchData", groups = { "Registration" })
    	public void AddNewApplication(String uName, String pwd){
                            new OpeningPage(driver, test)
                            .clickLogin()
                            .enterEmail(uName)
                            .enterPassword(pwd)
                            .clickLoginAppAdminUser()
                            .clickMyAccount()
                            .clickSubmittedCheckbox()
                            .clickApprovedCheckbox()
                            .clickUpdateButton()
                            .clickOk()
                            .clickLogOff();
    	}

}
