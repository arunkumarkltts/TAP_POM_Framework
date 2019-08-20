package testCases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0128_AppAdminLogin17 extends TapWrappers {
	
	@BeforeClass(alwaysRun = true)
	public void setValues(){
		browserName = "chrome";
		dataSheetName = "TC0128";
		testCaseName = "Upload APK File";
		testDescription = "Upload APK File in App Admin Login";
		category = "smoke";
		authors = "Abirami S";
	}
	
	@Test(dataProvider = "fetchData", groups = { "Registration" })
	public void AppAdminLogin17(String uName, String pwd, String row, String version,
			String notes, String uploadtestReport, String file){
                        new OpeningPage(driver, test)
                        .clickLogin()
                        .enterEmail(uName)
                    	.enterPassword(pwd)
                    	.clickLoginAppAdminUser()
                    	.clickMyApps()
                    	.clickActiveTitle(row)
                    	.clickUploadFile()
                    	.enterVersion(version)
                    	//System.out.println(version);
                    	.enterNotes(notes)
                    	.clickChooseFile(uploadtestReport)
                    	.clickUploadAFile(file)
                        .clickLogOff();
                    	
	}

}