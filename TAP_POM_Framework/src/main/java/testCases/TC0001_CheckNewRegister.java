package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.OpeningPage;
import utils.TestListener;
import wrappers.TapWrappers;

@Listeners({TestListener.class})
public class TC0001_CheckNewRegister extends TapWrappers {


	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Check New Register";
		testDescription = "checking Register Button";
		category = "smoke";
		authors = "Abirami S";		
	}
	
	@Test(dataProvider = "fetchData", groups = {"Registration"})
	public void CheckNewRegister(){
		new OpeningPage(driver, test)
		.clickRegister();
	}

}
