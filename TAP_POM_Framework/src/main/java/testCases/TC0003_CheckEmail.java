package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
import org.openqa.selenium.Keys;

@Listeners({TestListener.class})
public class TC0003_CheckEmail extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0003";
		testCaseName = "Email Check";
		testDescription = "Check whether personal email address or company email address";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String cName, String cPhone, String cWeb, String firstName, String lastName, String email){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterAirline()
		.enterCompanyName(cName)
		.enterCompanyPhone(cPhone)
		.enterCompanyWebsite(cWeb)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.pressKey(Keys.TAB)
		.verifyInvalidEmailWarning();		
	}

}
