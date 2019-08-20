
package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;
@Listeners({TestListener.class})

public class TC0095_EditInputPage extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0095";
		testCaseName = "Edit Input Page";
		testDescription = "To Edit Input Details in Misc";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void EditInputPage(String uName, String pwd, String row, 
			String inputName, String iconName, String toolTip){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginSuperUser()
                    	.clickMisc()
                    	.clickListEditInputs()
                    	.clickInputId(row)
                    	.enterInputName(inputName)
                    	.enterIconName(iconName)
                    	.enterToolTip(toolTip)
                        .clickLogOff();
                    	
	}

}