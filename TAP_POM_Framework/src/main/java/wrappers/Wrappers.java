package wrappers;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface Wrappers {

		/**
		 * This method will launch the given browser and maximize the browser and set the
		 * wait for 30 seconds and load the url
		 * @author Arunkumar K
		 * @param browser - The browser of the application to be launched
		 * @param url - The url with http or https
		 * @return 
		 * 
		 */
		public RemoteWebDriver invokeApp(String browser);

		/**
		 * This method will enter the value to the text field using id attribute to locate
		 * 
		 * @param idValue - id of the webelement
		 * @param data - The data to be sent to the webelement
		 * @author Arunkumar K
		 */
		public void enterById(String idValue, String data);
		
		/**
		 * This method will enter the value to the text field using name attribute to locate
		 * 
		 * @param nameValue - name of the webelement
		 * @param data - The data to be sent to the webelement
		 * @author Arunkumar K
		 */
		public void enterByName(String nameValue, String data);		
		
		/**
		 * This method will enter the value to the text field using xpath attribute to locate
		 * 
		 * @param xpathValue - name of the webelement
		 * @param data - The data to be sent to the webelement
		 * @author Arunkumar K
		 */
		public void enterByXpath(String xpathValue, String data);
		
		/**
		 * This method will enter the value to the text field using LinkText attribute to locate
		 * 
		 * @param linkText - name of the webelement
		 * @param data - The data to be sent to the webelement
		 * @author Arunkumar K
		 */
		public void enterByLinkText(String linkText, String data);

		/**
		 * This method will verify the title of the browser 
		 * @param title - The expected title of the browser
		 * @author Arunkumar K
		 * @return 
		 */
		public boolean verifyTitle(String title);
		
		/**
		 * This method will verify the given text
		 * @param id - The locator of the object in id
		 * @param text  - The text to be verified
		 * @author Arunkumar K
		 */
		public void verifyTextById(String id, String text);
		
		/**
		 * This method will verify the given text
		 * @param xpath - The locator of the object in xpath
		 * @param text  - The text to be verified
		 * @author Arunkumar K
		 */
		public void verifyTextByXpath(String xpath, String text);
		
		/**
		 * This method will verify the given text
		 * @param xpath - The locator of the object in xpath
		 * @param text  - The text to be verified
		 * @author Arunkumar K
		 */
		public void verifyTextContainsByXpath(String xpath, String text);

		/**
		 * This method will verify the given text
		 * @param xpath - The locator of the object in xpath
		 * @param text  - The text to be verified
		 * @author Arunkumar K
		 */
		public void verifyTextContainsById(String id, String text);

		/**
		 * This method will click the element using id as locator
		 * @param id  The id (locator) of the element to be clicked
		 * @author Arunkumar K
		 */
		public void clickById(String id);

		/**
		 * This method will click the element using id as locator
		 * @param id  The id (locator) of the element to be clicked
		 * @author Arunkumar K
		 */
		public void clickByClassName(String classVal);
		
		/**
		 * This method will click the element using name as locator
		 * @param name  The name (locator) of the element to be clicked
		 * @author Arunkumar K
		 */
		public void clickByName(String name);

		/**
		 * This method will click the element using link name as locator
		 * @param name  The link name (locator) of the element to be clicked
		 * @author Arunkumar K
		 */
		public void clickByLinkText(String name);

		/**
		 * This method will click the element using link name as locator without taking snapshot
		 * @param name  The link name (locator) of the element to be clicked
		 * @author Arunkumar K
		 */
		public void clickByLinkTextNoSnap(String name);

		/**
		 * This method will click the element using xpath as locator
		 * @param xpathVal  The xpath (locator) of the element to be clicked
		 * @author Arunkumar K
		 */
		public void clickByXpath(String xpathVal);
		
		/**
		 * This method will get the text of the element using id as locator
		 * @param xpathVal  The id (locator) of the element 
		 * @author Arunkumar K
		 */
		public String getTextById(String idVal);

		/**
		 * This method will get the text of the element using xpath as locator
		 * @param xpathVal  The xpath (locator) of the element 
		 * @author Arunkumar K
		 */
		public String getTextByXpath(String xpathVal);

		/**
		 * This method will select the drop down visible text using id as locator
		 * @param id The id (locator) of the drop down element
		 * @param value The value to be selected (visibletext) from the dropdown 
		 * @author Arunkumar K
		 */
		public void selectVisibileTextById(String id, String value);
		
		/**
		 * This method will select the drop down using index as id locator
		 * @param id The id (locator) of the drop down element
		 * @param value The value to be selected (visibletext) from the dropdown 
		 * @author Arunkumar K
		 */
		public void selectIndexById(String id, String value);
		
		/**
		 * This method will switch to the parent Window
		 * @author Arunkumar K
		 */
		public void switchToParentWindow();
		
		/**
		 * This method will move the control to the last window
		 * @author Arunkumar K
		 */
		public void switchToLastWindow();
		
		/**
		 * This method will accept the alert opened
		 * @author Arunkumar K
		 */
		public void acceptAlert();
		
		/**
		 * This method will close all the browsers
		 * @author Arunkumar K
		 */
		public void quitBrowser();

}
