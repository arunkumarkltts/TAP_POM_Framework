package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
import org.openqa.selenium.Keys;

@Listeners({TestListener.class})
public class TC0004_ReenterEmailCheck extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0004";
		testCaseName = "Reenter Email Check";
		testDescription = "Check Re-Enter Email address are Same";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String cName, String cPhone, String cWeb, String firstName, 
		String lastName, String email, String reenteremail, String reEnterEmailError){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterAirline()
		.enterCompanyName(cName)
		.enterCompanyPhone(cPhone)
		.enterCompanyWebsite(cWeb)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.reEnterEmail(reenteremail)
		.pressKey(Keys.TAB)
		.verifyInvalidReEnterEmailError(reEnterEmailError);		
	}

}
