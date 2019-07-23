package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

/*NOTE: Sweet Alerts observed in this page can he handled using wrapper methods while writing a testcase*/

public class AirlineRegistrationPage extends TapWrappers{

	public AirlineRegistrationPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	    	String pageVerification = prop.getProperty("AirlineRegistration.PageVerification.Xpath");
		verifyTextContainsByXpath(pageVerification, " Airline Registration");
	}

	public AirlineRegistrationPage enterCompanyName(String data){
	    	String companyName = prop.getProperty("AirlineRegistration.CompanyName.Id");	    
	    	enterById(companyName, data);
		return this;
	}

	public AirlineRegistrationPage enterCompanyPhone(String data){
	    	String companyPhone = prop.getProperty("AirlineRegistration.CompanyPhone.Id");	    
	    	enterById(companyPhone, data);
		return this;
	}

	public AirlineRegistrationPage enterCompanyWebsite(String data){
	    	String companyWebsite = prop.getProperty("AirlineRegistration.CompanyWebsite.Id");	    
	    	enterById(companyWebsite, data);
		return this;
	}

	public AirlineRegistrationPage enterFirstName(String data){
	    	String firstName = prop.getProperty("AirlineRegistration.FirstName.Name");	    
	    	enterByName(firstName, data);
		return this;
	}
	
	public AirlineRegistrationPage enterLastName(String data){
	    	String lastName = prop.getProperty("AirlineRegistration.LastName.Name");	    
	    	enterByName(lastName, data);
		return this;
	}

	public AirlineRegistrationPage enterEmail(String data){
	    	String email = prop.getProperty("AirlineRegistration.Email.Id");	    
	    	enterById(email, data);
		return this;
	}

	/*Possible Error Messages are:
	"is already in use"
	"Please enter a valid email address."*/
	public AirlineRegistrationPage verifyInvalidEmailError(String data){
	    	String emailError = prop.getProperty("AirlineRegistration.EmailError.Xpath");	    
	    	verifyTextContainsByXpath(emailError, data);
		return this;
	}

	public AirlineRegistrationPage verifyInvalidEmailWarning(){
	    	String emailWarning = prop.getProperty("AirlineRegistration.EmailWarning.Xpath");	    
	    	verifyTextContainsByXpath(emailWarning, "Please use company Email Address");
		return this;
	}

	public AirlineRegistrationPage reEnterEmail(String data){
	    	String email = prop.getProperty("AirlineRegistration.ReEnterEmail.Id");	    
	    	enterById(email, data);
		return this;
	}
	
	/*Possible Error Messages are:
	"Email doesn't match" 
	"Please enter a valid email address."*/
	public AirlineRegistrationPage verifyInvalidReEnterEmailError(String data){
	    	String reEnterEmailError = prop.getProperty("AirlineRegistration.ReEnterEmailError.Xpath");	    
	    	verifyTextContainsByXpath(reEnterEmailError, data);
		return this;
	}

	public AirlineRegistrationPage enterPassword(String data){
	    	String password = prop.getProperty("AirlineRegistration.Password.Name");	    
	    	enterByName(password, data);
		return this;
	}
	
	public AirlineRegistrationPage verifyInvalidPasswordError(){
	    	String passwordError = prop.getProperty("AirlineRegistration.PasswordError.Xpath");	    
	    	verifyTextContainsByXpath(passwordError, "Password requirements: ");
		return this;
	}

	public AirlineRegistrationPage reEnterPassword(String data){
	    	String password = prop.getProperty("AirlineRegistration.ReEnterPassword.Name");	    
	    	enterByName(password, data);
		return this;
	}

	public AirlineRegistrationPage verifyInvalidReEnterPasswordError(String data){
	    	String reEnterPasswordError = prop.getProperty("AirlineRegistration.ReEnterPasswordError.Xpath");	    
	    	verifyTextContainsByXpath(reEnterPasswordError, "Password doesn't match");
		return this;
	}

	public AirlineRegistrationPage clickSubmitRegistrationForm(){
	    	String submit = prop.getProperty("AirlineRegistration.SubmitButton.Xpath");
		clickByXpath(submit);
		return this;
	}

	public AirlineRegistrationPage clickContinue(){
	    	String continueButton = prop.getProperty("AirlineRegistration.ContinueButton.Xpath");
		clickByXpath(continueButton);
		return this;
	}

	public OpeningPage clickCancel(){
	    	String cancelButton = prop.getProperty("AirlineRegistration.CancelButton.Xpath");
		clickByXpath(cancelButton);
		return new OpeningPage(driver, test);
	}

	public AirlineRegistrationPage verifySubmit(){
	    	String submitConfirmation = prop.getProperty("AirlineRegistration.SubmitConfirmation.Xpath");
		verifyTextContainsByXpath(submitConfirmation, "Congratulations! Your registration form is complete.");
		return this;
	}

	public OpeningPage clickBackToHomePage(){
	    	String backToHome = prop.getProperty("AirlineRegistration.BackToHome.LinkText");
		clickByLinkText(backToHome);
		return new OpeningPage(driver, test);
	}

}
	
	
	
	
