package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0002_AddNewAirline extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0002";
		testCaseName = "Registration";
		testDescription = "Check whether able to Reigster New Airline";
		category = "smoke";
		authors = "Abirami S";		
	} 

	@Test(dataProvider = "fetchData", groups = {"Registration"})
	public void loginLogOut(String cName, String cPhone, String cWeb, String firstName, String lastName, 
		String email, String password){
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
		.clickBackToHomePage();
	}

}
