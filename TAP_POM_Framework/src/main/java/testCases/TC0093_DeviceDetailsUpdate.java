
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0093_DeviceDetailsUpdate extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0093";
		testCaseName = "Device Details Update";
		testDescription = "Device Details Update in Misc Page";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void DeviceDetailsUpdate(String uName, String pwd, String row,
			String deviceName, String iconName, String toolTip){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMisc()
                    	.clickListEditDevices()
                    	.clickDeviceId(row)
                    	.enterDeviceName(deviceName)
                    	.enterIconName(iconName)
                    	.enterToolTip(toolTip)
                    	.clickUpdateDevice()
                        .clickLogOff();
                    	
	}

}