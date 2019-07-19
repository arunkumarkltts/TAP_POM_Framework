package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.OpeningPage;
import wrappers.TapWrappers;

public class TC002_LoginNegative extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC001";
		testCaseName = "Login(Negative)";
		testDescription = "Validate Login Error Msg";
		category = "Sanity";
		authors = "Arunkumar K";		
	}

	@Test(dataProvider = "fetchData"/*, invocationCount = 1, threadPoolSize=1*/)
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
