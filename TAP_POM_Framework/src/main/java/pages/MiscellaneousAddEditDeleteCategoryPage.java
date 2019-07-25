package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousAddEditDeleteCategoryPage extends TapWrappers{

	public MiscellaneousAddEditDeleteCategoryPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("MiscellaneousAddEditDeleteCategory.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Add New Category");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("MiscellaneousAddEditDeleteCategory.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("MiscellaneousAddEditDeleteCategory.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("MiscellaneousAddEditDeleteCategory.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("MiscellaneousAddEditDeleteCategory.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("MiscellaneousAddEditDeleteCategory.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("MiscellaneousAddEditDeleteCategory.Misc.LinkText");
		clickByLinkText(misc);
		return new MiscellaneousPage(driver, test);		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("MiscellaneousAddEditDeleteCategory.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("MiscellaneousAddEditDeleteCategory.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("MiscellaneousAddEditDeleteCategory.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousAddEditDeleteCategoryPage enterCategoryName(String data){
	    	String categoryName = prop.getProperty("MiscellaneousAddEditDeleteCategory.CategoryName.Xpath");
		enterByXpath(categoryName, data);
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickCancelButton(){
	    	String cancel = prop.getProperty("MiscellaneousAddEditDeleteCategory.CancelButton.Xpath");
		clickByXpath(cancel);
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickAddNewCategory(){
	    	String addNewCategory = prop.getProperty("MiscellaneousAddEditDeleteCategory.SubmitButton.Xpath");
		clickByXpath(addNewCategory);
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickUpdateCategory(){
	    	String updateCategory = prop.getProperty("MiscellaneousAddEditDeleteCategory.SubmitButton.Xpath");
		clickByXpath(updateCategory);
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage enterSearch(String data){
	    	String search = prop.getProperty("MiscellaneousAddEditDeleteCategory.Search.Xpath");
		enterByXpath(search, data);
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickClearSearch(){
	    	String clearSearch = prop.getProperty("MiscellaneousAddEditDeleteCategory.ClearSearch.Xpath");
		clickByXpath(clearSearch);
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickUpdate(String row){
		clickByXpath("//table[@id='category-active']/tbody/tr["+row+"]/td[3]/a[1]");
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickDelete(String row){
		clickByXpath("//table[@id='category-active']/tbody/tr["+row+"]/td[3]/a[2]");
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage verifyAddNewCategoryStatus(){
	    	String verifySubmit = prop.getProperty("MiscellaneousAddEditDeleteCategory.VerifySubmit.Xpath");
		verifyTextContainsByXpath(verifySubmit, "Successfully Add New Category");
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickPopupOkButton(){
	    	String closePopup = prop.getProperty("MiscellaneousAddEditDeleteCategory.VerificationPopupCloseButton.Xpath");
		clickByXpath(closePopup);
		return this;		
	}

	public MiscellaneousAddEditDeleteCategoryPage clicOk(){
	    	acceptAlert();
		return this;
	}

	public MiscellaneousAddEditDeleteCategoryPage clickCancel(){
	    	dismissAlert();
		return this;
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("MiscellaneousAddEditDeleteCategory.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
