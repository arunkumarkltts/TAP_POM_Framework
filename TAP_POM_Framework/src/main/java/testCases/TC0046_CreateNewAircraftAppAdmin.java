package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0046_CreateNewAircraftAppAdmin extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0046";
		testCaseName = "Create New Aircraft";
		testDescription = "Create New Aircraft app_admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void CreateNewAircraftAppAdmin(String uName, String pwd, String row, String tailNumber, 
			String acftType, String active, String airlineProg){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        .clickAircraftNew()
                        .enterAircraftTailNumber(tailNumber)
                        .enterAircraftType(acftType)
                        .selectAircraftActive(active)
                        .selectAirlineProgram(airlineProg)
                        .clickSaveAircraft()
                        .clickOkButton()
                        .clickLogOff();
                        
	}

}
