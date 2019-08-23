package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerMyShoppingCartPage extends TapWrappers{

	public MediaManagerMyShoppingCartPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Order Summary");
	}

	public MediaManagerPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerPage(driver, test);		
	}

	public MediaManagerOrderHistoryPage clickOrderHistory(){
	    	String orderHistory = prop.getProperty("MediaManagerAirlineOrders.OrderHistory.LinkText");
		clickByLinkText(orderHistory);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return this;		
	}

	public MediaManagerMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerMyAccountPage(driver, test);		
	}

	public MediaManagerAllApplicationsPage clickLinkToAddAppsToThisOrder(){
	    	String addApps = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AddApps.LinkText");
		clickByPartialLinkText(addApps);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage enterOrderName(String data){
	    	String orderName = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.OrderName.Xpath");
		enterByXpath(orderName, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage enterDescription(String data){
	    	String description = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.Description.Xpath");
		enterByXpath(description, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage enterRequestedPackageDate(String date){
	    	String requestedPackageDate = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.RequestedPackageDate.Xpath");
		enterByXpath(requestedPackageDate, date);
		sendKeys(Keys.TAB);
		return this;		
	}

	public MediaManagerMyShoppingCartPage selectProgram(String data){
	    	String program = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramDropDown.Xpath");
		selectVisibileTextByXPath(program, data);
		return this;		
	}

	public MediaManagerMyShoppingCartAirlineProgramsPage clickViewAllProgramsButton(){
	    	String viewAllPrograms = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ViewAllProgramsButton.Xpath");
		clickByXpath(viewAllPrograms);
		return new MediaManagerMyShoppingCartAirlineProgramsPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage enterProgramName(String data){
	    	String programName = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramName.Xpath");
		enterByXpath(programName, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage enterProgramID(String data){
	    	String programID = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramID.Xpath");
		enterByXpath(programID, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage selectProgramActive(String data){
	    	String active = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramActive.Xpath");
		selectVisibileTextByXPath(active, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage selectSystem(String data){
	    	String system = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramSystem.Xpath");
		selectVisibileTextByXPath(system, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage clickSaveProgram(){
	    	String saveProgram = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SaveProgram.Xpath");
		clickByXpath(saveProgram);
		return this;		
	}

	/**Possible verification text's are as below
	*Program Saved
	*Aircraft Saved*/
	public MediaManagerMyShoppingCartPage verifyNewProgram(String data){
	    	String newProgramConfirmation = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.StatusVerification.Xpath");
		verifyTextContainsByXpath(newProgramConfirmation, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage clickOkButton(){
	    	acceptAlert();
		return this;		
	}

	public MediaManagerMyShoppingCartPage selectCopyFrom(String data){
	    	String copyFrom = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.CopyFromDropDown.Xpath");
	    	selectVisibileTextByXPath(copyFrom, data);
		return this;		
	}

	public MediaManagerMyShoppingCartPage clickAircraftNew(){
	    	String newAircraft = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.Aircraft.Xpath");
		clickByXpath(newAircraft);
		return this;		
	}

	public MediaManagerMyShoppingCartAirlineAircraftsPage clickViewAllAircraftButton(){
	    	String viewAllAircraft = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ViewAllAircraftButton.Xpath");
		clickByXpath(viewAllAircraft);
		return new MediaManagerMyShoppingCartAirlineAircraftsPage(driver, test);		
	}

	public MediaManagerMyShoppingCartPage enterAircraftTailNumber(String tailNumber){
	    	String tailNum = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.TailNumber.Xpath");
		enterByXpath(tailNum, tailNumber);
		return this;		
	}

	public MediaManagerMyShoppingCartPage enterAircraftType(String type){
	    	String aircraftType = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AircraftType.Xpath");
		enterByXpath(aircraftType, type);
		return this;		
	}

	public MediaManagerMyShoppingCartPage selectAircraftActive(String activeData){
	    	String active = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AircraftActive.Xpath");
		selectVisibileTextByXPath(active, activeData);
		return this;		
	}

	public MediaManagerMyShoppingCartPage selectAirlineProgram(String airlineProgram){
	    	String airlineProg = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AirlineProgram.Xpath");
		selectVisibileTextByXPath(airlineProg, airlineProgram);
		return this;		
	}

	public MediaManagerMyShoppingCartPage clickSaveAircraft(){
	    	String saveAircraft = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SaveAircraft.Xpath");
		clickByXpath(saveAircraft);
		return this;		
	}

	public MediaManagerMyShoppingCartPage enterOrderStartDate(String date){
	    	String startDate = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.StartDate.Xpath");
		enterByXpath(startDate, date);
		sendKeys(Keys.TAB);
		return this;		
	}

	public MediaManagerMyShoppingCartPage enterOrderEndDate(String date){
	    	String endDate = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.EndDate.Xpath");
		enterByXpath(endDate, date);
		sendKeys(Keys.TAB);
		return this;		
	}

	public MediaManagerMyShoppingCartPage clickSelectAll(){
	    	String selectAll = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SelectAllCheckbox.Xpath");
		clickByXpath(selectAll);
		return this;		
	}

	public MediaManagerMyShoppingCartPage clickDeleteButton(){
	    	String deleteButton = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.DeleteButton.Xpath");
		clickByXpath(deleteButton);
		return this;		
	}

	public MediaManagerOrderHistoryPage clickSubmitOrder(){
	    	String submit = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SubmitOrder.Xpath");
		clickByXpath(submit);
		return new MediaManagerOrderHistoryPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage clickUpdateOrder(){
	    	String update = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.UpdateOrder.Xpath");
		clickByXpath(update);
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public MediaManagerOrderSummaryPage clickCancelOrder(){
	    	String cancel = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.CancelOrder.Xpath");
		clickByXpath(cancel);
		return new MediaManagerOrderSummaryPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
