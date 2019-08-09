package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerMyShoppingCartAirlineProgramsPage extends TapWrappers{

	public MediaManagerMyShoppingCartAirlineProgramsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Airline Programs");
	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String home = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.OrderHistory.LinkText");
		clickByLinkText(home);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerMyAccountPage(driver, test);		
	}

	public MediaManagerMyShoppingCartAirlineAircraftsPage clickViewAllAircraft(){
	    	String viewAllAircraft = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.ViewAllAircraftButton.Xpath");
		clickByXpath(viewAllAircraft);
		return new MediaManagerMyShoppingCartAirlineAircraftsPage(driver, test);		
	}

	public MediaManagerMyShoppingCartAirlineProgramsPage verifyAirlineProgramCount(int count){
	    	String nextButton = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.NextButton.Xpath");
		int rowCount = getRowCount("//table/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

//	public MediaManagerMyShoppingCartAirlineEditProgramPage clickAddNewProgram(){
//	    	String addNewProgram = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.AddNewProgramButton.Xpath");
//		clickByXpath(addNewProgram);
//		return new MediaManagerMyShoppingCartAirlineEditProgramPage(driver, test);		
//	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineShoppingCartAirlinePrograms.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
