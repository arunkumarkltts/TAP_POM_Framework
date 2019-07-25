package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0008_AddNewDeveloper extends TapWrappers {
	
    	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0008";
		testCaseName = "Registration Developer";
		testDescription = "Register as Developer";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData")
	public void developerRegistration(String firstName, String lastName, String companyDeveloper, 
		String companyWebsite, String phone, String socialSite, String email, String password){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterDeveloper()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterDeveloperCompanyName(companyDeveloper)
		.enterCompanyWebsite(companyWebsite)
		.enterPhone(phone)
		.enterSocialSite(socialSite)
		.enterEmail(email)
		.reEnterEmail(email)
		.enterPassword(password)
		.reEnterPassword(password)
		.clickSubmitRegistrationForm()
		.clickOk()
		.scrollDownAgreement()
		.clickAgreementConfirmation()
		.clickSubmitRegistrationForm()
		.verifySubmit()
		.clickBackToHomePage();
	}

}
