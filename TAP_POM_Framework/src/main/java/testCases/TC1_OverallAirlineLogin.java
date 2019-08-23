package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC1_OverallAirlineLogin extends TapWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC1";
		testCaseName = "Overall Airline Login";
		testDescription = "To Check Overall Airline Login";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData")
	public void Login(String uName, String pwd, String appName, String prog, 
			String progName, String progid, String progActive, String system, String tail,
			String acftType, String airActive, String airlineProg, String copy, String orderName,
			String date, String row){
		new OpeningPage(driver, test)
		.clickLogin()
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickLoginAirlineUser()
		.clickMyShoppingCart()
		.clickSelectAll()
		.clickDeleteButton()
		.clickOkButton()
		.clickLinkToAddAppsToThisOrder()
		.clickAppAddRemoveButton(appName)
		.clickMyShoppingCart()
		.selectProgram(prog)
		.clickAircraftNew()
		.enterProgramName(progName)
		.enterProgramID(progid)
		.selectProgramActive(progActive)
		.selectSystem(system)
		.clickSaveProgram()
		.clickOkButton()
		.enterAircraftTailNumber(tail)
		.enterAircraftType(acftType)
		.selectAircraftActive(airActive)
		.selectAirlineProgram(airlineProg)
		.clickSaveAircraft()
		.clickOkButton()
		.selectCopyFrom(copy)
		.enterOrderName(orderName)
		.enterRequestedPackageDate(date)
		.clickSubmitOrder()
		.clickExportOrderHistory()
		.clickOrderName(row)
		.clickMyAccount()
		.clickCancelledCheckbox()
		.clickUpdateButton()
		.clickOk()
		.clickLogOff();
		
	}

}
