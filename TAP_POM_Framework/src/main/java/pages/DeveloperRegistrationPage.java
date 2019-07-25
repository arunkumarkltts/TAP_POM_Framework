package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

/*NOTE: Sweet Alerts observed in this page can he handled using wrapper methods while writing a testcase*/

public class DeveloperRegistrationPage extends TapWrappers{

	public DeveloperRegistrationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("DeveloperRegistration.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, "Developer Registration");
	}

	public DeveloperRegistrationPage enterFirstName(String data){
	    	String firstName = prop.getProperty("DeveloperRegistration.FirstName.Name");	    
	    	enterByName(firstName, data);
		return this;
	}
	
	public DeveloperRegistrationPage enterLastName(String data){
	    	String lastName = prop.getProperty("DeveloperRegistration.LastName.Name");	    
	    	enterByName(lastName, data);
		return this;
	}

	public DeveloperRegistrationPage enterDeveloperCompanyName(String data){
	    	String devCompanyName = prop.getProperty("DeveloperRegistration.DeveloperCompany.Id");	    
	    	enterById(devCompanyName, data);
		return this;
	}

	public DeveloperRegistrationPage enterCompanyWebsite(String data){
	    	String companyWebsite = prop.getProperty("DeveloperRegistration.CompanyWebsite.Id");	    
	    	enterById(companyWebsite, data);
		return this;
	}

	/*Use only numeric characters as input*/
	public DeveloperRegistrationPage enterPhone(String data){
	    	String phone = prop.getProperty("DeveloperRegistration.Phone.Name");	    
	    	enterByName(phone, data);
		return this;
	}
	
	public DeveloperRegistrationPage verifyInvalidPhoneNumberError(){
	    	String phoneError = prop.getProperty("DeveloperRegistration.PhoneError.Xpath");	    
	    	verifyTextContainsByXpath(phoneError, "Contains invalid characters");
		return this;
	}

	/*Use the format http://www.linkedin.com/<user id>*/	
	public DeveloperRegistrationPage enterSocialSite(String data){
	    	String socialSite = prop.getProperty("DeveloperRegistration.SocialSite.Id");	    
	    	enterById(socialSite, data);
		return this;
	}
	
	public DeveloperRegistrationPage verifyInvalidSocialSiteError(){
	    	String socialSiteError = prop.getProperty("DeveloperRegistration.SocialSiteError.Xpath");	    
	    	verifyTextContainsByXpath(socialSiteError, "Please provide valid LinkedIn URL");
		return this;
	}

	public DeveloperRegistrationPage enterEmail(String data){
	    	String email = prop.getProperty("DeveloperRegistration.Email.Name");	    
	    	enterByName(email, data);
		return this;
	}

	/*Possible Error Messages are:
	" is already in use"
	"Please enter a valid email address."*/
	public DeveloperRegistrationPage verifyInvalidEmailError(String data){
	    	String emailError = prop.getProperty("DeveloperRegistration.EmailError.Xpath");	    
	    	verifyTextContainsByXpath(emailError, data);
		return this;
	}

	public DeveloperRegistrationPage reEnterEmail(String data){
	    	String email = prop.getProperty("DeveloperRegistration.ReEnterEmail.Name");	    
	    	enterByName(email, data);
		return this;
	}
	
	public DeveloperRegistrationPage verifyInvalidReEnterEmailError(){
	    	String reEnterEmailError = prop.getProperty("DeveloperRegistration.ReEnterEmailError.Xpath");	    
	    	verifyTextContainsByXpath(reEnterEmailError, "Email doesn't match");
		return this;
	}

	public DeveloperRegistrationPage enterPassword(String data){
	    	String password = prop.getProperty("DeveloperRegistration.Password.Name");	    
	    	enterByName(password, data);
		return this;
	}
	
	public DeveloperRegistrationPage verifyInvalidPasswordError(){
	    	String passwordError = prop.getProperty("DeveloperRegistration.PasswordError.Xpath");	    
	    	verifyTextContainsByXpath(passwordError, "Password requirements: ");
		return this;
	}

	public DeveloperRegistrationPage reEnterPassword(String data){
	    	String password = prop.getProperty("DeveloperRegistration.ReEnterPassword.Name");	    
	    	enterByName(password, data);
		return this;
	}
	
	public DeveloperRegistrationPage verifyInvalidReEnterPasswordError(){
	    	String reEnterPasswordError = prop.getProperty("DeveloperRegistration.ReEnterPasswordError.Xpath");	    
	    	verifyTextContainsByXpath(reEnterPasswordError, "Password doesn't match");
		return this;
	}

	public DeveloperRegistrationPage clickSubmitRegistrationForm(){
	    	String submit = prop.getProperty("DeveloperRegistration.SubmitButton.Xpath");
		clickByXpath(submit);
		return this;
	}

	public DeveloperRegistrationPage clickOk(){
	    	acceptAlert();
		return this;
	}

	public DeveloperRegistrationPage clickCancel(){
	    	dismissAlert();
		return this;
	}

	public DeveloperRegistrationPage enterAddress1(String data){
	    	String address1 = prop.getProperty("DeveloperRegistration.Address1.Name");	    
	    	enterByName(address1, data);
		return this;
	}

	public DeveloperRegistrationPage enterAddress2(String data){
	    	String address2 = prop.getProperty("DeveloperRegistration.Address2.Name");	    
	    	enterByName(address2, data);
		return this;
	}

	public DeveloperRegistrationPage enterCity(String data){
	    	String city = prop.getProperty("DeveloperRegistration.City.Name");	    
	    	enterByName(city, data);
		return this;
	}

	public DeveloperRegistrationPage enterState(String data){
	    	String state = prop.getProperty("DeveloperRegistration.State.Name");	    
	    	enterByName(state, data);
		return this;
	}

	public DeveloperRegistrationPage enterPostalCode(String data){
	    	String zipCode = prop.getProperty("DeveloperRegistration.PostalCode.Name");	    
	    	enterByName(zipCode, data);
		return this;
	}

	public DeveloperRegistrationPage enterCountry(String data){
	    	String country = prop.getProperty("DeveloperRegistration.Country.Name");	    
	    	enterByName(country, data);
		return this;
	}

	public DeveloperRegistrationPage clickSameAsAbove(){
	    	String sameAsAbove = prop.getProperty("DeveloperRegistration.SameAsAboveCheckBox.Xpath");	    
	    	clickByXpath(sameAsAbove);
		return this;
	}

	public DeveloperRegistrationPage enterThalesBillingId(String data){
	    	String thalesBillingId = prop.getProperty("DeveloperRegistration.ThalesBillingId.Name");	    
	    	enterByName(thalesBillingId, data);
		return this;
	}

	public DeveloperRegistrationPage enterBusinessType(String data){
	    	String businessType = prop.getProperty("DeveloperRegistration.BusinessType.Name");	    
	    	enterByName(businessType, data);
		return this;
	}

	public DeveloperRegistrationPage enterTaxpayerId(String data){
	    	String taxpayerId = prop.getProperty("DeveloperRegistration.TaxpayerId.Name");	    
	    	enterByName(taxpayerId, data);
		return this;
	}

	public DeveloperRegistrationPage enterBankName(String data){
	    	String bankName = prop.getProperty("DeveloperRegistration.BankName.Name");	    
	    	enterByName(bankName, data);
		return this;
	}

	public DeveloperRegistrationPage enterAccountNumber(String data){
	    	String accountNumber = prop.getProperty("DeveloperRegistration.AccountNumber.Name");	    
	    	enterByName(accountNumber, data);
		return this;
	}

	public DeveloperRegistrationPage enterRoutingNumber(String data){
	    	String routingNumber = prop.getProperty("DeveloperRegistration.RoutingNumber.Name");	    
	    	enterByName(routingNumber, data);
		return this;
	}

	public DeveloperRegistrationPage clickBusinessLessThan1(){
	    	String business = prop.getProperty("DeveloperRegistration.BusinessLessThan1RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public DeveloperRegistrationPage clickBusiness1_5(){
	    	String business = prop.getProperty("DeveloperRegistration.Business1_5RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public DeveloperRegistrationPage clickBusiness3to5(){
	    	String business = prop.getProperty("DeveloperRegistration.Business3to5RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public DeveloperRegistrationPage clickBusinessMoreThan10(){
	    	String business = prop.getProperty("DeveloperRegistration.BusinessMoreThan10RadioButton.Xpath");	    
	    	clickByXpath(business);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreYearsLessThan1(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreYearsLessThan1RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreYears1_5(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreYears1_5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreYears3to5(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreYears3to5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreYearsMoreThan5(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreYearsMoreThan5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreYearsNA(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreYearsNARadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreApps0(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreApps0RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreApps1_5(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreApps1_5RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreApps3to10(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreApp3to10RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickPlayStoreAppsMoreThan10(){
	    	String playStore = prop.getProperty("DeveloperRegistration.PlayStoreAppsMoreThan10RadioButton.Xpath");	    
	    	clickByXpath(playStore);
		return this;
	}

	public DeveloperRegistrationPage clickMarketPlaceApple(){
	    	String marketPlace = prop.getProperty("DeveloperRegistration.MarketplaceAppleCheckbox.Xpath");	    
	    	clickByXpath(marketPlace);
		return this;
	}

	public DeveloperRegistrationPage clickMarketPlaceAmazon(){
	    	String marketPlace = prop.getProperty("DeveloperRegistration.MarketplaceAmazonCheckbox.Xpath");	    
	    	clickByXpath(marketPlace);
		return this;
	}

	public DeveloperRegistrationPage clickMarketPlaceOther(){
	    	String marketPlace = prop.getProperty("DeveloperRegistration.MarketplaceOtherCheckbox.Xpath");	    
	    	clickByXpath(marketPlace);
		return this;
	}

	public DeveloperRegistrationPage clickEmployeeCount0to10(){
	    	String employeeCount = prop.getProperty("DeveloperRegistration.EmployeeCount0to10RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public DeveloperRegistrationPage clickEmployeeCount10to25(){
	    	String employeeCount = prop.getProperty("DeveloperRegistration.EmployeeCount10to25RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public DeveloperRegistrationPage clickEmployeeCount25to100(){
	    	String employeeCount = prop.getProperty("DeveloperRegistration.EmployeeCount25to100RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public DeveloperRegistrationPage clickEmployeeCountMoreThan100(){
	    	String employeeCount = prop.getProperty("DeveloperRegistration.EmployeeCountMoreThan100RadioButton.Xpath");	    
	    	clickByXpath(employeeCount);
		return this;
	}

	public DeveloperRegistrationPage clickEmployeeSameBusinessAddressYes(){
	    	String yes = prop.getProperty("DeveloperRegistration.EmployeeSameBusinessAddressYesRadioButton.Xpath");	    
	    	clickByXpath(yes);
		return this;
	}

	public DeveloperRegistrationPage clickEmployeeSameBusinessAddressNo(){
	    	String no = prop.getProperty("DeveloperRegistration.EmployeeSameBusinessAddressNoRadioButton.Xpath");	    
	    	clickByXpath(no);
		return this;
	}

	public DeveloperRegistrationPage scrollDownAgreement(){
	    	String agreementScrollDown = prop.getProperty("DeveloperRegistration.AgreementScroll.Xpath");	    
	    	clickByXpath(agreementScrollDown);
	    	sendKeys(Keys.END);
		return this;
	}

	public DeveloperRegistrationPage clickAgreementConfirmation(){
	    	String checkbox = prop.getProperty("DeveloperRegistration.AgreementConfirmationCheckbox.Xpath");	    
	    	clickByXpath(checkbox);
		return this;
	}

	public DeveloperRegistrationPage verifySubmit(){
	    	String submitConfirmation = prop.getProperty("DeveloperRegistration.SubmitConfirmation.Xpath");
		verifyTextContainsByXpath(submitConfirmation, "Congratulations! Your registration form is complete.");
		return this;
	}

	public OpeningPage clickBackToHomePage(){
	    	String backToHome = prop.getProperty("DeveloperRegistration.BackToHome.LinkText");
		clickByLinkText(backToHome);
		return new OpeningPage(driver, test);
	}

}
