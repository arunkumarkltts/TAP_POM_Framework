package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
import org.openqa.selenium.Keys;
@Listeners({TestListener.class})
public class TC0013_Logincheck extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0013";
		testCaseName = "Login check";
		testDescription = "Login check";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void Logincheck(String uName, String pwd){
		new OpeningPage(driver, test)
		.clickLogin()
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickLoginSuperUser();
		sendKeys(Keys.F5);
		
	}

}
