package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerDashboardMyShoppingCartAirlineAircraftsPage extends TapWrappers{

	public MediaManagerDashboardMyShoppingCartAirlineAircraftsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineShoppingCartAirlineAircrafts.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "All Aircraft");
	}

	public MediaManagerAllApplicationsPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrdersMyAccount.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String orderHistory = prop.getProperty("MediaManagerAirlineOrdersMyAccount.OrderHistory.LinkText");
		clickByLinkText(orderHistory);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrdersMyAccount.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return new MediaManagerMyShoppingCartPage(driver, test);		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrdersMyAccount.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerMyAccountPage(driver, test);		
	}

	public MediaManagerMyShoppingCartAirlineProgramsPage clickViewAllPrograms(){
	    	String viewAllPrograms = prop.getProperty("MediaManagerAirlineOrdersMyAccount.ViewAllProgramsButton.Xpath");
		clickByXpath(viewAllPrograms);
		return new MediaManagerMyShoppingCartAirlineProgramsPage(driver, test);		
	}

	public MediaManagerDashboardMyShoppingCartAirlineAircraftsPage verifyAirlineAircraftsCount(int count){
	    	String nextButton = prop.getProperty("MediaManagerAirlineOrdersMyAccount.NextButton.Xpath");
		int rowCount = getRowCount("//table/tbody/tr",nextButton);
		verifyIfEqual(rowCount, count);
		return this;		
	}

//	public MediaManagerMyShoppingCartAirlineEditProgramPage clickAddNewAircraft(){
//	    	String addNewProgram = prop.getProperty("MediaManagerAirlineOrdersMyAccount.AddNewAircraftButton.Xpath");
//		clickByXpath(addNewProgram);
//		return new MediaManagerMyShoppingCartAirlineEditProgramPage(driver, test);		
//	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrdersMyAccount.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
