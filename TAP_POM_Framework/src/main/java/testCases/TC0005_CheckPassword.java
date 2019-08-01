package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
import org.openqa.selenium.Keys;

@Listeners({TestListener.class})
public class TC0005_CheckPassword extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0005";
		testCaseName = "Password Check";
		testDescription = "Check Re-Enter Password are Same";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData", groups = {"Registration"})
	public void loginLogOut(String cName, String cPhone, String cWeb, String fName, 
		String lName, String email,  String password,  String reEnterPasswordError){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterAirline()
		.enterCompanyName(cName)
		.enterCompanyPhone(cPhone)
		.enterCompanyWebsite(cWeb)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterEmail(email)
		.reEnterEmail(email)
		.enterPassword(password)
		.reEnterPassword(reEnterPasswordError)
		.pressKey(Keys.TAB)
		.verifyInvalidReEnterPasswordError(reEnterPasswordError);
	}

}
