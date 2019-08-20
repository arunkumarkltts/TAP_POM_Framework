package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0045_CreateNewAircraft extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0045";
		testCaseName = "Create New Aircraft";
		testDescription = "Create New Aircraft sys_admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AddNewApplication(String uName, String pwd, String row, String tailNumber, 
			String acftType, String active, String airlineProg){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .clickAircraftNew()
                        /*.enterTailNumber(tailNumber)
                        .enterAircraftType(acftType)
                        .selectActive(active)
                        .selectAirlineProgram(airlineProg)
                        .clickSaveAircraft()*/
                        .clickOkButton()
                        .clickLogOff();
	}

}
