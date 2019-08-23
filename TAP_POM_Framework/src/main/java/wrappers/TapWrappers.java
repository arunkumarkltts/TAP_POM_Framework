package wrappers;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class TapWrappers extends GenericWrappers implements Wrappers{
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest(){
		loadObjects();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		invokeApp(browserName);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result){
	    	quitBrowser();
	    	endTestcase();
	}
	
	@AfterClass
	public void afterClass(){
	}

	@AfterTest(alwaysRun = true)
	public void afterTest(){
		unloadObjects();
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite(){
		endResult();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
}






