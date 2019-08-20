package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0026_UpdateAutoNotification extends TapWrappers {
	
    @BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0026";
		testCaseName = "Update Auto Notification Email ON/OFF";
		testDescription = "Update Auto Notification Email ON/OFF";
		category = "smoke";
		authors = "Abirami S";		
	}
    	@Test(dataProvider = "fetchData", groups = { "Registration" })
    	public void AddNewApplication(String uName, String pwd){
                            new OpeningPage(driver, test)
                            .clickLogin()
                            .enterEmail(uName)
                        	.enterPassword(pwd)
                        	.clickLoginDeveloperUser()
                        	.clickMyAccount()
                        	.clickSubmittedCheckbox()
                        	.clickUpdateButton()
                        	.clickLogOff();
                        	
                        	
                        	
                        	
    	}
}