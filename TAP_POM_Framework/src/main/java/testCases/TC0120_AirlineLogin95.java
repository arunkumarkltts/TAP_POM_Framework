package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0120_AirlineLogin95 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0120";
		testCaseName = "AirlineLogin95";
		testDescription = "To check whether able to add New Program and Aircraft";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AirlineLogin95(String uName, String pwd,
			String program, String progName, String Progid, String active, String system,
			String tailNum, String aircraftType, String airActive, String airlineProg){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAirlineUser()
                    	.clickMyShoppingCart()
                    	.selectProgram(program)
                    	.enterProgramName(progName)
                    	.enterProgramID(Progid)
                    	.selectProgramActive(active)
                    	.selectSystem(system)
                    	.clickSaveProgram()
                    	.clickOkButton()
                    	.clickAircraftNew()
                    	.enterAircraftTailNumber(tailNum)
                    	.enterAircraftType(aircraftType)
                    	.selectAircraftActive(airActive)
                    	.selectAirlineProgram(airlineProg)
                    	.clickSaveAircraft()
                    	.clickOkButton()
                        .clickLogOff();
                    	
	}

}