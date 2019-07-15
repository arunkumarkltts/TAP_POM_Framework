package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC001_Login extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC001";
		testCaseName = "Login";
		testDescription = "Login to TAP and LogOut";
		category = "smoke";
		authors = "Arunkumar K";		
	}
	
	@Test(dataProvider = "fetchData"/*, invocationCount = 1, threadPoolSize=1*/)
	public void loginLogOut(String testNumber, String uName, String pwd){
		//setTestNumber(Integer.parseInt(testNumber));
		new OpeningPage(driver, test)
		.clickLogin()
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickLogOff();		
	}

}
