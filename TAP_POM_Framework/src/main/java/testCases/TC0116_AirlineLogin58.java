package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0116_AirlineLogin58 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0116";
		testCaseName = "AirlineLogin58";
		testDescription = "View All Programs and View All Aircraft Button";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin58(String uName, String pwd,
			String program){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickMyShoppingCart()
                    	.selectProgram(program)
                    	.clickAircraftNew()
                    	.clickViewAllProgramsButton()
                    	.clickViewAllAircraft()
                        .clickLogOff();
                    	
	}

}