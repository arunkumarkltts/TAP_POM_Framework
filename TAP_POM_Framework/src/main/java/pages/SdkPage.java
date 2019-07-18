package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.TapWrappers;

public class SdkPage extends TapWrappers{

	public SdkPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		verifyTitle("Thales App Portal");
	}

}
