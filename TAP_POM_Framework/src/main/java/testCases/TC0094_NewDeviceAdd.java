
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0094_NewDeviceAdd extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0094";
		testCaseName = "Add New Device";
		testDescription = "To Add New Device in Misc Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void NewDeviceAdd(String uName, String pwd, 
			String deviceName, String iconName, String toolTip){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMisc()
                    	.clickAddNewDevice()
                    	.enterDeviceName(deviceName)
                    	.enterIconName(iconName)
                    	.enterToolTip(toolTip)
                        .clickLogOff();
                    	
	}

}