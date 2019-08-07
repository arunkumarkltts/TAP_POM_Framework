package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MediaManagerDashboardMyShoppingCartPage extends TapWrappers{

	public MediaManagerDashboardMyShoppingCartPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Order Summary");
	}

	public MediaManagerAllApplicationsPage clickHome(){
	    	String home = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.Home.LinkText");
		clickByLinkText(home);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerDashboardOrderHistoryPage clickOrderHistory(){
	    	String orderHistory = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.OrderHistory.LinkText");
		clickByLinkText(orderHistory);
		return new MediaManagerDashboardOrderHistoryPage(driver, test);		
	}

	public MediaManagerDashboardMyShoppingCartPage clickMyShoppingCart(){
	    	String myShoppingCart = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.MyShoppingCart.LinkText");
		clickByLinkText(myShoppingCart);
		return this;		
	}

	public MediaManagerDashboardMyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MediaManagerDashboardMyAccountPage(driver, test);		
	}

	public MediaManagerAllApplicationsPage clickLinkToAddAppsToThisOrder(){
	    	String addApps = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AddApps.LinkText");
		clickByPartialLinkText(addApps);
		return new MediaManagerAllApplicationsPage(driver, test);		
	}

	public MediaManagerDashboardMyShoppingCartPage enterOrderName(String data){
	    	String orderName = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.OrderName.Xpath");
		enterByXpath(orderName, data);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterDescription(String data){
	    	String description = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.Description.Xpath");
		enterByXpath(description, data);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterRequestedPackageDate(String date){
	    	String requestedPackageDate = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.RequestedPackageDate.Xpath");
		enterByXpath(requestedPackageDate, date);
		sendKeys(Keys.TAB);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage selectProgram(String programData){
	    	String program = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramDropDown.Xpath");
		selectVisibileTextByXPath(program, programData);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterProgramName(String programNameData){
	    	String programName = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramName.Xpath");
		enterByXpath(programName, programNameData);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterProgramID(String programIDData){
	    	String programID = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramID.Xpath");
		enterByXpath(programID, programIDData);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage selectProgramActive(String activeData){
	    	String active = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramActive.Xpath");
		selectVisibileTextByXPath(active, activeData);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage selectSystem(String systemData){
	    	String system = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.ProgramSystem.Xpath");
		selectVisibileTextByXPath(system, systemData);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage clickSaveProgram(){
	    	String saveProgram = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SaveProgram.Xpath");
		clickByXpath(saveProgram);
		return this;		
	}

	/**Possible verification text's are as below
	*Program Saved
	*Aircraft Saved*/
	public MediaManagerDashboardMyShoppingCartPage verifyNewProgram(String data){
	    	String newProgramConfirmation = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.StatusVerification.Xpath");
		verifyTextContainsByXpath(newProgramConfirmation, data);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage clickOkButton(){
	    	String okButton = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.StatusOkButton.Xpath");
		clickByXpath(okButton);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage selectCopyFrom(String data){
	    	String copyFrom = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.CopyFromDropDown.Xpath");
	    	selectVisibileTextByXPath(copyFrom, data);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage clickAircraftNew(){
	    	String newAircraft = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.Aircraft.Xpath");
		clickByXpath(newAircraft);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterAircraftTailNumber(String tailNumber){
	    	String tailNum = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.TailNumber.Xpath");
		enterByXpath(tailNum, tailNumber);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterAircraftType(String type){
	    	String aircraftType = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AircraftType.Xpath");
		enterByXpath(aircraftType, type);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage selectAircraftActive(String activeData){
	    	String active = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AircraftActive.Xpath");
		selectVisibileTextByXPath(active, activeData);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage selectAirlineProgram(String airlineProgram){
	    	String airlineProg = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.AirlineProgram.Xpath");
		selectVisibileTextByXPath(airlineProg, airlineProgram);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage clickSaveAircraft(){
	    	String saveAircraft = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SaveAircraft.Xpath");
		clickByXpath(saveAircraft);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterOrderStartDate(String date){
	    	String startDate = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.StartDate.Xpath");
		enterByXpath(startDate, date);
		sendKeys(Keys.TAB);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage enterOrderEndDate(String date){
	    	String endDate = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.EndDate.Xpath");
		enterByXpath(endDate, date);
		sendKeys(Keys.TAB);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage clickSelectAll(){
	    	String selectAll = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SelectAllCheckbox.Xpath");
		clickByXpath(selectAll);
		return this;		
	}

	public MediaManagerDashboardMyShoppingCartPage clickDeleteButton(){
	    	String deleteButton = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.DeleteButton.Xpath");
		clickByXpath(deleteButton);
		return this;		
	}

	public MediaManagerDashboardOrderHistoryPage clickSubmitOrder(){
	    	String submit = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.SubmitOrder.Xpath");
		clickByXpath(submit);
		return new MediaManagerDashboardOrderHistoryPage(driver, test);		
	}

	public MediaManagerDashboardOrderSummaryPage clickUpdateOrder(){
	    	String update = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.UpdateOrder.Xpath");
		clickByXpath(update);
		return new MediaManagerDashboardOrderSummaryPage(driver, test);		
	}

	public MediaManagerDashboardOrderSummaryPage clickCancelOrder(){
	    	String cancel = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.CancelOrder.Xpath");
		clickByXpath(cancel);
		return new MediaManagerDashboardOrderSummaryPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MediaManagerAirlineOrdersShoppingCart.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
