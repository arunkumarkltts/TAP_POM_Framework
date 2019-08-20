
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0092_EditCompanyDetails extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0092";
		testCaseName = "Edit Company Details";
		testDescription = "Edit Company Details in Users Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void EditCompanyDetails(String uName, String pwd, String row, String address1, 
			String address2, String city, String state, String postalCode, String country,
			String billing, String businessType, String TaxPayer, String BankName, String accountNum,
			String routingNum){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickUsers()
                    	.clickActiveUsersCompanyName(row)
                    	.clickEditCompanyDetails()
                    	.enterBillingAddress1(address1)
                    	.enterBillingAddress2(address2)
                    	.enterCityTown(city)
                    	.enterState(state)
                    	.enterPostalCode(postalCode)
                    	.enterCountry(country)
                    	.enterThalesBillingId(billing)
                    	.enterBusinessType(businessType)
                    	.enterTaxpayerId(TaxPayer)
                    	.enterBankName(BankName)
                    	.enterAccountNumber(accountNum)
                    	.enterRoutingNumber(routingNum)
                    	.clickSubmitButton()
                        .clickLogOff();
                    	
	}

}