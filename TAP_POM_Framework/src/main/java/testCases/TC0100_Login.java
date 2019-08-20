package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0100_Login extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0100";
		testCaseName = "Login";
		testDescription = "Login to TAP and LogOut";
		category = "smoke";
		authors = "Arunkumar K";		
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" }/*, invocationCount = 1, threadPoolSize=1*/)
	public void loginLogOut(String uName, String pwd){
		new OpeningPage(driver, test)
		.clickLogin()
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickLoginSuperUser()
		.clickLogOff();		
	}

}
