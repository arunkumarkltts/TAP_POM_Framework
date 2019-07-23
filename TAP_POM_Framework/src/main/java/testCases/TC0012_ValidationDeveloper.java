
package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0012_ValidationDeveloper extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0012";
		testCaseName = "Registration";
		testDescription = "Validation Check";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData", groups = {"Registration"})
	public void loginLogOut(String fName, String lName, String company, String cWeb, 
		String cPhone, String socialSite, String email, String password){
		new OpeningPage(driver, test)
		.clickRegister()
		.clickRegisterDeveloper()
		.clickSubmitRegistrationForm()
		.verifySubmit();
		
	}

}
