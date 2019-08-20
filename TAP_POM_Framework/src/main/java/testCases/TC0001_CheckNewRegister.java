package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0001_CheckNewRegister extends TapWrappers {

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0001";
		testCaseName = "Check New Register";
		testDescription = "Check New Register menu with Developer and Airlines";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void CheckNewRegister(String airline, String developer){
		new OpeningPage(driver, test)
		.clickRegister()
		.verifyRegisterAirline(airline)
		.verifyRegisterDeveloper(developer);
	}

}
