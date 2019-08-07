package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousPage extends TapWrappers{

	public MiscellaneousPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Miscellaneous.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Miscellaneous!");
	}

	public AddNewApplicationPage clickAddNewApplication(){
	    	String addNewApplication = prop.getProperty("Miscellaneous.AddNewApplication.LinkText");
		clickByPartialLinkText(addNewApplication);
		return new AddNewApplicationPage(driver, test);		
	}

	public MediaManagerPage clickMediaManager(){
	    	String mediaManager = prop.getProperty("Miscellaneous.MediaManager.LinkText");
		clickByLinkText(mediaManager);
		return new MediaManagerPage(driver, test);		
	}

	public StoreReportsPage clickStoreReports(){
	    	String storeReports = prop.getProperty("Miscellaneous.StoreReports.LinkText");
		clickByLinkText(storeReports);
		return new StoreReportsPage(driver, test);		
	}

	public CompaniesPage clickCompanies(){
	    	String companies = prop.getProperty("Miscellaneous.Companies.LinkText");
		clickByLinkText(companies);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickUsers(){
	    	String users = prop.getProperty("Miscellaneous.Users.LinkText");
		clickByLinkText(users);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousPage clickMisc(){
	    	String misc = prop.getProperty("Miscellaneous.Misc.LinkText");
		clickByLinkText(misc);
		return this;		
	}

	public HomePage clickMyApps(){
	    	String myApps = prop.getProperty("Miscellaneous.MyApps.LinkText");
		clickByLinkText(myApps);
		return new HomePage(driver, test);		
	}

	public SdkPage clickSdk(){
	    	String sdkPage = prop.getProperty("Miscellaneous.Sdk.LinkText");
		clickByLinkText(sdkPage);
		return new SdkPage(driver, test);		
	}

	public MyAccountPage clickMyAccount(){
	    	String myAccount = prop.getProperty("Miscellaneous.MyAccount.LinkText");
		clickByLinkText(myAccount);
		return new MyAccountPage(driver, test);		
	}

	public MiscellaneousListDevicesPage clickListEditDevices(){
	    	String listDevices = prop.getProperty("Miscellaneous.ListEditDevices.LinkText");
	    	clickByPartialLinkText(listDevices);
		return new MiscellaneousListDevicesPage(driver, test);		
	}

	public MiscellaneousAddNewDevicePage clickAddNewDevice(){
	    	String addNewDevice = prop.getProperty("Miscellaneous.AddNewDevice.LinkText");
	    	clickByPartialLinkText(addNewDevice);
		return new MiscellaneousAddNewDevicePage(driver, test);		
	}

	public MiscellaneousListInputsPage clickListEditInputs(){
	    	String listInputs = prop.getProperty("Miscellaneous.ListEditInputs.LinkText");
	    	clickByPartialLinkText(listInputs);
		return new MiscellaneousListInputsPage(driver, test);		
	}

	public MiscellaneousAddNewInputPage clickAddNewInput(){
	    	String addNewInput = prop.getProperty("Miscellaneous.AddNewInput.LinkText");
	    	clickByPartialLinkText(addNewInput);
		return new MiscellaneousAddNewInputPage(driver, test);		
	}

	public MiscellaneousStatisticsReportPage clickStatisticsReport(){
	    	String statisticsReport = prop.getProperty("Miscellaneous.StatisticsReport.LinkText");
	    	clickByPartialLinkText(statisticsReport);
		return new MiscellaneousStatisticsReportPage(driver, test);		
	}

	public MiscellaneousEmailEditorPage clickEmailEditor(){
	    	String emailEditor = prop.getProperty("Miscellaneous.EmailEditor.LinkText");
	    	clickByPartialLinkText(emailEditor);
		return new MiscellaneousEmailEditorPage(driver, test);		
	}

	public MiscellaneousMassUploadPage clickMassUpload(){
	    	String massUpload = prop.getProperty("Miscellaneous.MassUpload.LinkText");
	    	clickByPartialLinkText(massUpload);
		return new MiscellaneousMassUploadPage(driver, test);		
	}

	public MiscellaneousUpdateUserRolePage clickUpdateUserRole(){
	    	String updateUserRole = prop.getProperty("Miscellaneous.UpdateUserRole.LinkText");
	    	clickByPartialLinkText(updateUserRole);
		return new MiscellaneousUpdateUserRolePage(driver, test);		
	}

	public MiscellaneousAddUpdateBillboardsPage clickAddUpdateBillboards(){
	    	String addUpdateBillboards = prop.getProperty("Miscellaneous.AddUpdateBillboards.LinkText");
	    	clickByPartialLinkText(addUpdateBillboards);
		return new MiscellaneousAddUpdateBillboardsPage(driver, test);		
	}

	public MiscellaneousAppstoreImagesPage clickAppstoreImages(){
	    	String appstoreImages = prop.getProperty("Miscellaneous.AppstoreImages.LinkText");
	    	clickByPartialLinkText(appstoreImages);
		return new MiscellaneousAppstoreImagesPage(driver, test);		
	}

	public MiscellaneousListNotificationMailIdPage clickUpdateNotificationMailId(){
	    	String updateNotificationMailId = prop.getProperty("Miscellaneous.UpdateNotificationMailId.LinkText");
	    	clickByPartialLinkText(updateNotificationMailId);
		return new MiscellaneousListNotificationMailIdPage(driver, test);		
	}

	public MiscellaneousAssignMediaManagerPage clickAssignMediaManager(){
	    	String assignMediaManager = prop.getProperty("Miscellaneous.AssignMediaManager.LinkText");
	    	clickByPartialLinkText(assignMediaManager);
		return new MiscellaneousAssignMediaManagerPage(driver, test);		
	}

	public MiscellaneousAddingCompanyToAirlinesPage clickAddingCompanyToAirlines(){
	    	String addingCompanyToAirlines = prop.getProperty("Miscellaneous.AddingCompanyToAirlines.LinkText");
	    	clickByPartialLinkText(addingCompanyToAirlines);
		return new MiscellaneousAddingCompanyToAirlinesPage(driver, test);		
	}

	public CompaniesPage clickDeleteInactiveCompany(){
	    	String deleteInactiveCompany = prop.getProperty("Miscellaneous.DeleteInactiveCompany.LinkText");
	    	clickByPartialLinkText(deleteInactiveCompany);
		return new CompaniesPage(driver, test);		
	}

	public UsersPage clickDeleteInactiveUsers(){
	    	String deleteInactiveUsers = prop.getProperty("Miscellaneous.DeleteInactiveUsers.LinkText");
	    	clickByPartialLinkText(deleteInactiveUsers);
		return new UsersPage(driver, test);		
	}

	public MiscellaneousDeleteDevicePage clickDeleteDevice(){
	    	String deleteDevice = prop.getProperty("Miscellaneous.DeleteDevice.LinkText");
	    	clickByPartialLinkText(deleteDevice);
		return new MiscellaneousDeleteDevicePage(driver, test);		
	}

	public MiscellaneousDeleteInputsPage clickDeleteInputs(){
	    	String deleteInputs = prop.getProperty("Miscellaneous.DeleteInputs.LinkText");
	    	clickByPartialLinkText(deleteInputs);
		return new MiscellaneousDeleteInputsPage(driver, test);		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickAddEditDeleteCategory(){
	    	String addEditDeleteCategory = prop.getProperty("Miscellaneous.AddEditDeleteCategory.LinkText");
	    	clickByPartialLinkText(addEditDeleteCategory);
		return new MiscellaneousAddEditDeleteCategoryPage(driver, test);		
	}

	public MiscellaneousUpdateTAPAgreementPage clickUpdateTAPAgreement(){
	    	String updateTAPAgreement = prop.getProperty("Miscellaneous.UpdateTAPAgreement.LinkText");
	    	clickByPartialLinkText(updateTAPAgreement);
		return new MiscellaneousUpdateTAPAgreementPage(driver, test);		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickAddEditDeleteAndroidVersion(){
	    	String addEditDeleteAndroidVersion = prop.getProperty("Miscellaneous.AddEditDeleteAndroidVersion.LinkText");
	    	clickByPartialLinkText(addEditDeleteAndroidVersion);
		return new MiscellaneousAddEditDeleteAndroidVersionPage(driver, test);		
	}

	public MiscellaneousTypeFilterCustomizationPage clickTypeFilterCustomization(){
	    	String typeFilterCustomization = prop.getProperty("Miscellaneous.TypeFilterCustomization.LinkText");
	    	clickByPartialLinkText(typeFilterCustomization);
		return new MiscellaneousTypeFilterCustomizationPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Miscellaneous.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
