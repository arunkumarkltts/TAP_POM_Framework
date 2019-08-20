package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0006_CompanyCheck extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0006";
		testCaseName = "Registration";
		testDescription = "Already Registered Company";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void loginLogOut(String cName, String cPhone, String cWeb, String firstName, String lastName, String email, String password){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterAirline()
		.enterCompanyName(cName)
		.enterCompanyPhone(cPhone)
		.enterCompanyWebsite(cWeb)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(email)
		.reEnterEmail(email)
		.enterPassword(password)
		.reEnterPassword(password)
		.clickSubmitRegistrationForm()
		.verifySubmit()
		.clickOk()
		.clickBackToHomePage();
		
	}

}
