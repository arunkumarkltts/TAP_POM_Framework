package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.OpeningPage;
import wrappers.TapWrappers;
import org.openqa.selenium.Keys;
public class TC0011_CheckValidSite extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0011";
		testCaseName = "Site Check";
		testDescription = "Check Site";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void loginLogOut(String fName, String lName, String company, String cWeb, String cPhone, String socialSite){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterDeveloper()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterDeveloperCompanyName(company)
		.enterCompanyWebsite(cWeb)
		.enterPhone(cPhone)
		.enterSocialSite(socialSite);
		 sendKeys(Keys.TAB);

	}

}
