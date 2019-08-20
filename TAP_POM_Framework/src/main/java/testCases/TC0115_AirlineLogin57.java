package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})
public class TC0115_AirlineLogin57 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0115";
		testCaseName = "AirlineLogin57";
		testDescription = "Add new program and aircraft";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin57(String uName, String pwd,
			String program, String progName, String progid, String active, String system,
			String tailNum, String aircraftType, String AirActive, String airlineProg){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickMyShoppingCart()
                    	.selectProgram(program)
                    	.clickAircraftNew()
                    	.enterProgramName(progName)
                    	.enterProgramID(progid)
                    	.selectProgramActive(active)
                    	.selectSystem(system)
                    	.clickSaveProgram()
                    	.clickOkButton()
                    	.enterAircraftTailNumber(tailNum)
                    	.enterAircraftType(aircraftType)
                    	.selectAircraftActive(AirActive)
                    	.selectAirlineProgram(airlineProg)
                    	.clickSaveAircraft()
                    	.clickOkButton()
                        .clickLogOff();
                    	
	}

}