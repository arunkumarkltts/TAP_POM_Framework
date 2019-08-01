package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0030_UpdateAutoNotification extends TapWrappers {
	
    	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0030";
		testCaseName = "Update Auto Notification Email ON/OFF";
		testDescription = "Update Auto Notification Email ON/OFF";
		category = "smoke";
		authors = "Abirami S";		
	}
    	@Test(dataProvider = "fetchData")
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