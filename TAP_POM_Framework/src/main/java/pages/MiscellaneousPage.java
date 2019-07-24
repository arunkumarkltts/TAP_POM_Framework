package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class MiscellaneousPage extends TapWrappers{

	public MiscellaneousPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Miscellaneous.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Users");

	}

	public MiscellaneousListDevicesPage clickListEditDevices(){
	    	String listDevices = prop.getProperty("Miscellaneous.ListEditDevices.LinkText");
		clickByLinkText(listDevices);
		return new MiscellaneousListDevicesPage(driver, test);		
	}

	public MiscellaneousAddNewDevicePage clickAddNewDevice(){
	    	String addNewDevice = prop.getProperty("Miscellaneous.AddNewDevice.LinkText");
		clickByLinkText(addNewDevice);
		return new MiscellaneousAddNewDevicePage(driver, test);		
	}

	public MiscellaneousListInputsPage clickListEditInputs(){
	    	String listInputs = prop.getProperty("Miscellaneous.ListEditInputs.LinkText");
		clickByLinkText(listInputs);
		return new MiscellaneousListInputsPage(driver, test);		
	}

	public MiscellaneousAddNewInputPage clickAddNewInput(){
	    	String addNewInput = prop.getProperty("Miscellaneous.AddNewInput.LinkText");
		clickByLinkText(addNewInput);
		return new MiscellaneousAddNewInputPage(driver, test);		
	}

	public MiscellaneousUpdateUserRolePage clickUpdateUserRole(){
	    	String updateUserRole = prop.getProperty("Miscellaneous.UpdateUserRole.LinkText");
		clickByLinkText(updateUserRole);
		return new MiscellaneousUpdateUserRolePage(driver, test);		
	}

	public MiscellaneousListNotificationMailIdPage clickUpdateNotificationMailId(){
	    	String updateNotificationMailId = prop.getProperty("Miscellaneous.UpdateNotificationMailId.LinkText");
		clickByLinkText(updateNotificationMailId);
		return new MiscellaneousListNotificationMailIdPage(driver, test);		
	}

	public MiscellaneousAssignMediaManagerPage clickAssignMediaManager(){
	    	String assignMediaManager = prop.getProperty("Miscellaneous.AssignMediaManager.LinkText");
		clickByLinkText(assignMediaManager);
		return new MiscellaneousAssignMediaManagerPage(driver, test);		
	}

	public MiscellaneousAddingCompanyToAirlinesPage clickAddingCompanyToAirlines(){
	    	String addingCompanyToAirlines = prop.getProperty("Miscellaneous.AddingCompanyToAirlines.LinkText");
		clickByLinkText(addingCompanyToAirlines);
		return new MiscellaneousAddingCompanyToAirlinesPage(driver, test);		
	}

	public MiscellaneousDeleteInactiveCompanyPage clickDeleteInactiveCompany(){
	    	String deleteInactiveCompany = prop.getProperty("Miscellaneous.DeleteInactiveCompany.LinkText");
		clickByLinkText(deleteInactiveCompany);
		return new MiscellaneousDeleteInactiveCompanyPage(driver, test);		
	}

	public MiscellaneousDeleteInactiveUsersPage clickDeleteInactiveUsers(){
	    	String deleteInactiveUsers = prop.getProperty("Miscellaneous.DeleteInactiveUsers.LinkText");
		clickByLinkText(deleteInactiveUsers);
		return new MiscellaneousDeleteInactiveUsersPage(driver, test);		
	}

	public MiscellaneousDeleteDevicePage clickDeleteDevice(){
	    	String deleteDevice = prop.getProperty("Miscellaneous.DeleteDevice.LinkText");
		clickByLinkText(deleteDevice);
		return new MiscellaneousDeleteDevicePage(driver, test);		
	}

	public MiscellaneousDeleteInputsPage clickDeleteInputs(){
	    	String deleteInputs = prop.getProperty("Miscellaneous.DeleteInputs.LinkText");
		clickByLinkText(deleteInputs);
		return new MiscellaneousAddingCompanyToAirlinesPage(driver, test);		
	}

	public MiscellaneousAddEditDeleteCategoryPage clickAddEditDeleteCategory(){
	    	String addEditDeleteCategory = prop.getProperty("Miscellaneous.AddEditDeleteCategory.LinkText");
		clickByLinkText(addEditDeleteCategory);
		return new MiscellaneousAddEditDeleteCategoryPage(driver, test);		
	}

	public MiscellaneousUpdateTAPAgreementPage clickUpdateTAPAgreement(){
	    	String updateTAPAgreement = prop.getProperty("Miscellaneous.UpdateTAPAgreement.LinkText");
		clickByLinkText(updateTAPAgreement);
		return new MiscellaneousUpdateTAPAgreementPage(driver, test);		
	}

	public MiscellaneousAddEditDeleteAndroidVersionPage clickAddEditDeleteAndroidVersion(){
	    	String addEditDeleteAndroidVersion = prop.getProperty("Miscellaneous.AddEditDeleteAndroidVersion.LinkText");
		clickByLinkText(addEditDeleteAndroidVersion);
		return new MiscellaneousAddEditDeleteAndroidVersionPage(driver, test);		
	}

	public OpeningPage clickLogOff(){
	    	String logOff = prop.getProperty("Miscellaneous.LogOff.LinkText");
		clickByLinkText(logOff);
		return new OpeningPage(driver, test);		
	}

}
