package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0127_AirlineLogin135 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0127";
		testCaseName = "Add New Program";
		testDescription = "Add New Program and Aircraft in Airline Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin123(String uName, String pwd, String prog){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickMyShoppingCart()
                    	.selectProgram(prog)
                    	.clickAircraftNew()
                    	.clickViewAllProgramsButton()
                    	.clickViewAllAircraft()
                        .clickLogOff();
                    	
	}

}