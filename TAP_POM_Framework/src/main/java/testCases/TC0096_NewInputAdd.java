
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0096_NewInputAdd extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0096";
		testCaseName = "New Input Add";
		testDescription = "To Add New Input in Misc";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void NewInputAdd(String uName, String pwd, 
			String inputName, String iconName, String toolTip){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMisc()
                    	.clickAddNewInput()
                    	.enterInputName(inputName)
                    	.enterIconName(iconName)
                    	.enterToolTip(toolTip)
                    	.clickAddNewInput()
                        .clickLogOff();
                    	
	}

}