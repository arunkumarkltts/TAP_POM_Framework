package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class HomePage extends TapWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Home.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Dashboard");

	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("Home.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("Home.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("Home.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("Home.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("Home.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("Home.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("Home.MyApps.LinkText");
		clickByLinkText(myApps);
		return this;		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("Home.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("Home.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public HomePage clickFilterColumns(){
	    	String filterColumns = prop.getProperty("Home.FilterColumns.LinkText");
		clickByLinkText(filterColumns);
		return this;		
	}

	public HomePage selectAvailableColumns(String data){
	    	String availableColumns = prop.getProperty("Home.AvailableColumnsDropDown.Xpath");
	    	selectVisibileTextByXPath(availableColumns, data);
		return this;
	}

	public HomePage selectFilterColumns(String data){
	    	String filterColumns = prop.getProperty("Home.FilterColumnsDropDown.Xpath");
	    	selectVisibileTextByXPath(filterColumns, data);
		return this;
	}

	public HomePage clickMoveAllRightButton(){
	    	String moveRightAll = prop.getProperty("Home.MoveAllRightButton.Xpath");
		clickByXpath(moveRightAll);
		return this;		
	}

	public HomePage clickMoveRightButton(){
	    	String moveRight = prop.getProperty("Home.MoveRightButton.Xpath");
		clickByXpath(moveRight);
		return this;		
	}

	public HomePage clickMoveLeftButton(){
	    	String moveLeft = prop.getProperty("Home.MoveLeftButton.Xpath");
		clickByXpath(moveLeft);
		return this;		
	}

	public HomePage clickMoveAllLeftButton(){
	    	String moveLeftAll = prop.getProperty("Home.MoveAllLeftButton.Xpath");
		clickByXpath(moveLeftAll);
		return this;		
	}

	public HomePage clickUpButton(){
	    	String moveUp = prop.getProperty("Home.MoveUpButton.Xpath");
		clickByXpath(moveUp);
		return this;		
	}

	public HomePage clickDownButton(){
	    	String moveDown = prop.getProperty("Home.MoveDownButton.Xpath");
		clickByXpath(moveDown);
		return this;		
	}

	public HomePage clickUpdateButton(){
	    	String update = prop.getProperty("Home.UpdateFilterButton.Xpath");
		clickByXpath(update);
		return this;		
	}

	public HomePage clickCancelButton(){
	    	String cancel = prop.getProperty("Home.CancelFilterButton.Xpath");
		clickByXpath(cancel);
		return this;		
	}

	public HomePage clickClearButton(){
	    	String clear = prop.getProperty("Home.ClearFilterButton.Xpath");
		clickByXpath(clear);
		return this;		
	}

	public HomePage clickDownloadActiveApplications(){
	    	String downloadActiveApps = prop.getProperty("Home.DownloadActiveApplications.LinkText");
		clickByLinkText(downloadActiveApps);
		return this;		
	}

	public HomePage clickJumpToInactive(){
	    	String jumpToInactive = prop.getProperty("Home.JumpToInactive.LinkText");
		clickByLinkText(jumpToInactive);
		return this;		
	}

	public HomePage enterActiveSearch(String data){
	    	String activeSearch = prop.getProperty("Home.ActiveSearch.Xpath");
		enterByXpath(activeSearch, data);
		return this;		
	}

	public HomePage clickClearActiveSearch(){
	    	String clearActiveSearch = prop.getProperty("Home.ActiveSearchClear.Xpath");
		clickByXpath(clearActiveSearch);
		return this;		
	}

	public HomePage clickJumpToActive(){
	    	String jumpToActive = prop.getProperty("Home.JumpToActive.LinkText");
		clickByLinkText(jumpToActive);
		return this;		
	}

	public HomePage enterInactiveSearch(String data){
	    	String inactiveSearch = prop.getProperty("Home.InactiveSearch.Xpath");
		enterByXpath(inactiveSearch, data);
		return this;		
	}

	public HomePage clickClearInactiveSearch(){
	    	String clearInactiveSearch = prop.getProperty("Home.InactiveSearchClear.Xpath");
		clickByXpath(clearInactiveSearch);
		return this;		
	}

	public NewApplicationPage clickActiveTitle(String row){
		clickByXpath("//table[@class='activeWrapper display dataTable']/tbody/tr["+row+"]/td[2]");
		return new NewApplicationPage(driver, test);		
	}

	public HomePage clickActiveCompany(String row){
		clickByXpath("//table[@class='activeWrapper display dataTable']/tbody/tr["+row+"]/td[4]");
		return this;		
	}

	public HomePage clickActiveActions(String row){
		clickByXpath("//table[@class='activeWrapper display dataTable']/tbody/tr["+row+"]/td[6]");
		return this;		
	}

	public NewApplicationPage clickInactiveTitle(String row){
		clickByXpath("//table[@class='inactiveWrapper display dataTable']/tbody/tr["+row+"]/td[2]");
		return new NewApplicationPage(driver, test);		
	}

	public HomePage clickInactiveCompany(String row){
		clickByXpath("//table[@class='inactiveWrapper display dataTable']/tbody/tr["+row+"]/td[4]");
		return this;		
	}

	public HomePage clickInactiveActions(String row){
		clickByXpath("//table[@class='inactiveWrapper display dataTable']/tbody/tr["+row+"]/td[6]");
		return this;		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Home.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}



























