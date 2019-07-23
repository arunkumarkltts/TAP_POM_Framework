package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.OpeningPage;
import wrappers.TapWrappers;
import org.openqa.selenium.Keys;
public class TC0010_CheckPasswordDeveloper extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0010";
		testCaseName = "Password Check";
		testDescription = "Check Password";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String fName, String lName, String company, String cWeb, 
		String cPhone, String socialSite, String email, String password,  String reEnterPasswordError){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterDeveloper()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterDeveloperCompanyName(company)
		.enterCompanyWebsite(cWeb)
		.enterPhone(cPhone)
		.enterSocialSite(socialSite)
		.enterEmail(email)
		.reEnterEmail(email)
		.enterPassword(password)
		.reEnterPassword(reEnterPasswordError);
		sendKeys(Keys.TAB);
		
	}

}
