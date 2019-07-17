package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

/*NOTE: Sweet Alerts observed in this page can he handled using wrapper methods while writing a testcase*/

public class RegistrationPage extends TapWrappers{

	public RegistrationPage(RemoteWebDriver driver, ExtentTest test, String user){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("Registration.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, user);
	}
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public RegistrationPage enterCompanyName(String data){
	    	String companyName = prop.getProperty("Registration.CompanyName.Id");	    
	    	enterById(companyName, data);
		return this;
	}
	
	public RegistrationPage enterDeveloperCompanyName(String data){
	    	String devCompanyName = prop.getProperty("Registration.DeveloperCompany.Id");	    
	    	enterById(devCompanyName, data);
		return this;
	}

	public RegistrationPage enterCompanyPhone(String data){
	    	String companyPhone = prop.getProperty("Registration.CompanyPhone.Id");	    
	    	enterById(companyPhone, data);
		return this;
	}

	public RegistrationPage enterPhone(String data){
	    	String phone = prop.getProperty("Registration.Phone.Name");	    
	    	enterByName(phone, data);
		return this;
	}

	public RegistrationPage enterCompanyWebsite(String data){
	    	String companyWebsite = prop.getProperty("Registration.CompanyWebsite.Id");	    
	    	enterById(companyWebsite, data);
		return this;
	}

	public RegistrationPage enterSocialSite(String data){
	    	String socialSite = prop.getProperty("Registration.SocialSite.Id");	    
	    	enterById(socialSite, data);
		return this;
	}

	public RegistrationPage enterFirstName(String data){
	    	String firstName = prop.getProperty("Registration.FirstName.Name");	    
	    	enterByName(firstName, data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data){
	    	String lastName = prop.getProperty("Registration.LastName.Name");	    
	    	enterByName(lastName, data);
		return this;
	}
	
	public RegistrationPage enterEmail(String data){
	    	String email = prop.getProperty("Registration.Email.Id");	    
	    	enterById(email, data);
		return this;
	}
	
	public RegistrationPage reEnterEmail(String data){
	    	String email = prop.getProperty("Registration.ReEnterEmail.Id");	    
	    	enterById(email, data);
		return this;
	}
	
	public RegistrationPage reEnterDeveloperEmail(String data){
	    	String email = prop.getProperty("Registration.DeveloperReEnterEmail.Name");	    
	    	enterByName(email, data);
		return this;
	}

	public RegistrationPage enterPassword(String data){
	    	String password = prop.getProperty("Registration.Password.Id");	    
	    	enterById(password, data);
		return this;
	}
	
	public RegistrationPage reEnterPassword(String data){
	    	String password = prop.getProperty("Registration.ReEnterPassword.Name");	    
	    	enterByName(password, data);
		return this;
	}

	public RegistrationPage clickSubmitRegistrationForm(){
	    	String submit = prop.getProperty("Registration.SubmitButton.Xpath");
		clickByXpath(submit);
		return this;
	}

	public RegistrationPage clickContinue(){
	    	String continueButton = prop.getProperty("Registration.ContinueButton.Xpath");
		clickByXpath(continueButton);
		return this;
	}

	public RegistrationPage clickCancel(){
	    	String cancelButton = prop.getProperty("Registration.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return this;
	}

	public RegistrationPage verifySubmit(){
	    	String submitConfirmation = prop.getProperty("Registration.SubmitConfirmation.Xpath");
		verifyTextContainsByXpath(submitConfirmation, "Congratulations! Your registration form is complete.");
		return this;
	}

	public RegistrationPage enterAddress1(String data){
	    	String address1 = prop.getProperty("Registration.Address1.Name");	    
	    	enterByName(address1, data);
		return this;
	}

	public RegistrationPage enterAddress2(String data){
	    	String address2 = prop.getProperty("Registration.Address2.Name");	    
	    	enterByName(address2, data);
		return this;
	}

	public RegistrationPage enterCity(String data){
	    	String city = prop.getProperty("Registration.City.Name");	    
	    	enterByName(city, data);
		return this;
	}

	public RegistrationPage enterState(String data){
	    	String state = prop.getProperty("Registration.State.Name");	    
	    	enterByName(state, data);
		return this;
	}

	public RegistrationPage enterPostalCode(String data){
	    	String zipCode = prop.getProperty("Registration.PostalCode.Name");	    
	    	enterByName(zipCode, data);
		return this;
	}

	public RegistrationPage enterCountry(String data){
	    	String country = prop.getProperty("Registration.Country.Name");	    
	    	enterByName(country, data);
		return this;
	}

	public RegistrationPage clickSameAsAbove(){
	    	String sameAsAbove = prop.getProperty("Registration.SameAsAboveCheckBox.Xpath");	    
	    	clickByXpath(sameAsAbove);
		return this;
	}

	public RegistrationPage enterThalesBillingId(String data){
	    	String thalesBillingId = prop.getProperty("Registration.ThalesBillingId.Name");	    
	    	enterByName(thalesBillingId, data);
		return this;
	}

	public RegistrationPage enterBusinessType(String data){
	    	String businessType = prop.getProperty("Registration.BusinessType.Name");	    
	    	enterByName(businessType, data);
		return this;
	}

	public RegistrationPage enterTaxpayerId(String data){
	    	String taxpayerId = prop.getProperty("Registration.TaxpayerId.Name");	    
	    	enterByName(taxpayerId, data);
		return this;
	}

	public RegistrationPage enterBankName(String data){
	    	String bankName = prop.getProperty("Registration.BankName.Name");	    
	    	enterByName(bankName, data);
		return this;
	}

	public RegistrationPage enterAccountNumber(String data){
	    	String accountNumber = prop.getProperty("Registration.AccountNumber.Name");	    
	    	enterByName(accountNumber, data);
		return this;
	}

	public RegistrationPage enterRoutingNumber(String data){
	    	String routingNumber = prop.getProperty("Registration.RoutingNumber.Name");	    
	    	enterByName(routingNumber, data);
		return this;
	}

	public RegistrationPage clickBusinessLessThan1(){
	    	String business = prop.getProperty("Registration.BusinessLessThan1RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public RegistrationPage clickBusiness1_5(){
	    	String business = prop.getProperty("Registration.Business1_5RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public RegistrationPage clickBusiness3to5(){
	    	String business = prop.getProperty("Registration.Business3to5RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public RegistrationPage clickBusinessMoreThan10(){
	    	String business = prop.getProperty("Registration.BusinessMoreThan10RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public RegistrationPage clickPlayStoreYearsLessThan1(){
	    	String playStore = prop.getProperty("Registration.PlayStoreYearsLessThan1RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreYears1_5(){
	    	String playStore = prop.getProperty("Registration.PlayStoreYears1_5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreYears3to5(){
	    	String playStore = prop.getProperty("Registration.PlayStoreYears3to5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreYearsMoreThan5(){
	    	String playStore = prop.getProperty("Registration.PlayStoreYearsMoreThan5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreYearsNA(){
	    	String playStore = prop.getProperty("Registration.PlayStoreYearsNARadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreApps0(){
	    	String playStore = prop.getProperty("Registration.PlayStoreApps0RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreApps1_5(){
	    	String playStore = prop.getProperty("Registration.PlayStoreApps1_5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreApps3to10(){
	    	String playStore = prop.getProperty("Registration.PlayStoreApp3to10RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickPlayStoreAppsMoreThan10(){
	    	String playStore = prop.getProperty("Registration.PlayStoreAppsMoreThan10RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public RegistrationPage clickMarketPlaceApple(){
	    	String marketPlace = prop.getProperty("Registration.MarketplaceAppleCheckbox.Xpath");	    
	    	clickByXpath(marketPlace);
		return this;
	}

	public RegistrationPage clickMarketPlaceAmazon(){
	    	String marketPlace = prop.getProperty("Registration.MarketplaceAmazonCheckbox.Xpath");	    
	    	clickByXpath(marketPlace);
		return this;
	}

	public RegistrationPage clickMarketPlaceOther(){
	    	String marketPlace = prop.getProperty("Registration.MarketplaceOtherCheckbox.Xpath");	    
	    	clickByXpath(marketPlace);
		return this;
	}

	public RegistrationPage clickEmployeeCount0to10(){
	    	String employeeCount = prop.getProperty("Registration.EmployeeCount0to10RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public RegistrationPage clickEmployeeCount10to25(){
	    	String employeeCount = prop.getProperty("Registration.EmployeeCount10to25RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public RegistrationPage clickEmployeeCount25to100(){
	    	String employeeCount = prop.getProperty("Registration.EmployeeCount25to100RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public RegistrationPage clickEmployeeCountMoreThan100(){
	    	String employeeCount = prop.getProperty("Registration.EmployeeCountMoreThan100RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public RegistrationPage clickEmployeeSameBusinessAddressYes(){
	    	String yes = prop.getProperty("Registration.EmployeeSameBusinessAddressYesRadioButton.Xpath");	    
	    	clickByXpath(yes);
		return this;
	}

	public RegistrationPage clickEmployeeSameBusinessAddressNo(){
	    	String no = prop.getProperty("Registration.EmployeeSameBusinessAddressNoRadioButton.Xpath");	    
	    	clickByXpath(no);
		return this;
	}

	public RegistrationPage scrollDownAgreement(){
	    	String agreementScrollDown = prop.getProperty("Registration.AgreementScroll.Xpath");	    
	    	clickByXpath(agreementScrollDown);
	    	sendKeys(Keys.END);
		return this;
	}

	public RegistrationPage clickAgreementConfirmation(){
	    	String checkbox = prop.getProperty("Registration.AgreementConfirmationCheckbox.Xpath");	    
	    	clickByXpath(checkbox);
		return this;
	}

	public OpeningPage clickBackToHomePage(){
	    	String backToHome = prop.getProperty("Registration.BackToHome.LinkText");
		clickByLinkText(backToHome);
		return new OpeningPage(driver, test);
	}


}

















