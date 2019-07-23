package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.OpeningPage;
import wrappers.TapWrappers;
import org.openqa.selenium.Keys;
public class TC0005CheckPassword extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0005";
		testCaseName = "Password Check";
		testDescription = "Check Password";
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
		.reEnterPassword(reEnterPasswordError);
		sendKeys(Keys.TAB);
		
	}

}
