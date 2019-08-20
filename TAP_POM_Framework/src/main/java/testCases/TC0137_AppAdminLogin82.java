package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0137_AppAdminLogin82 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0137";
		testCaseName = "View All Programs Button";
		testDescription = "To Check View All Programs Button in App Admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AppAdminLogin82(String uName, String pwd, String row){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                        .clickMediaManager()
                        .clickAirline(row)
                        .clickMyShoppingCart()
                        //.selectProgram(prog)
                        .clickAircraftNew()
                        .clickViewAllAircraftButton()
                        .clickViewAllPrograms()
                        .clickLogOff();
                        
	}

}
