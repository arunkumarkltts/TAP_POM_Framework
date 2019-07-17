package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC004_NewDeveloperRegistration extends TapWrappers {
	
    	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC004";
		testCaseName = "Registration Developer";
		testDescription = "Register as Developer";
		category = "smoke";
		authors = "Arunkumar K";		
	}
	
	@Test(dataProvider = "fetchData")
	public void developerRegistration(String firstName, String lastName, String companyDeveloper, 
		String companyWebsite, String phone, String socialSite, String email, String password,
		String address1, String address2, String city, String state, String postalCode,
		String country, String thalesBillingId, String businessType, String taxpayerId,
		String bankName, String accountNumber, String routingNumber){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterUser("Developer")
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterDeveloperCompanyName(companyDeveloper)
		.enterCompanyWebsite(companyWebsite)
		.enterPhone(phone)
		.enterSocialSite(socialSite)
		.enterEmail(email)
		.reEnterDeveloperEmail(email)
		.enterPassword(password)
		.reEnterPassword(password)
		.clickSubmitRegistrationForm()
		.clickContinue()
		.enterAddress1(address1)
		.enterAddress2(address2)
		.enterCity(city)
		.enterState(state)
		.enterPostalCode(postalCode)
		.enterCountry(country)
		.clickSameAsAbove()
		.enterThalesBillingId(thalesBillingId)
		.enterBusinessType(businessType)
		.enterTaxpayerId(taxpayerId)
		.enterBankName(bankName)
		.enterAccountNumber(accountNumber)
		.enterRoutingNumber(routingNumber)
		.clickBusiness3to5()
		.clickPlayStoreYearsLessThan1()
		.clickPlayStoreApps1_5()
		.clickMarketPlaceApple()
		.clickEmployeeCount25to100()
		.clickEmployeeSameBusinessAddressYes()
		.scrollDownAgreement()
		.clickAgreementConfirmation()
		.clickSubmitRegistrationForm()
		.verifySubmit()
		.clickBackToHomePage();
	}

}



