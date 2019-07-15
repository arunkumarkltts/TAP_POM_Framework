package pages;

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
	
	public RegistrationPage enterCompanyName(String data){
	    	String companyName = prop.getProperty("Registration.CompanyName.Id");	    
	    	enterById(companyName, data);
		return this;
	}
	
	public RegistrationPage enterCompanyPhone(String data){
	    	String companyPhone = prop.getProperty("Registration.CompanyPhone.Id");	    
	    	enterById(companyPhone, data);
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

	public RegistrationPage verifySubmit(){
	    	String submitConfirmation = prop.getProperty("Registration.SubmitConfirmation.Xpath");
		verifyTextContainsByXpath(submitConfirmation, "Congratulations! Your registration form is complete.");
		return this;
	}

	public OpeningPage clickBackToHomePage(){
	    	String backToHome = prop.getProperty("Registration.BackToHome.LinkText");
		clickByLinkText(backToHome);
		return new OpeningPage(driver, test);
	}


}

















