package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.OpeningPage;
import wrappers.TapWrappers;

public class TC0101_LoginNegative extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0101";
		testCaseName = "Login(Negative)";
		testDescription = "Validate Login Error Msg";
		category = "Sanity";
		authors = "Arunkumar K";		
	}

	@Test(dataProvider = "fetchData", groups = { "Registration" }/*, invocationCount = 1, threadPoolSize=1*/)
	public void loginLogOut(String testNumber, String uName, String pwd){
		//setTestNumber(Integer.parseInt(testNumber));
		new OpeningPage(driver, test)
		.clickLogin()
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickLoginSuperUser()
		.clickLogOff();		
	}

}
