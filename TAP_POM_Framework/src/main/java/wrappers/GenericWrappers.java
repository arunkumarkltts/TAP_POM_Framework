package wrappers;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import utils.Reporter;

public class GenericWrappers extends Reporter implements Wrappers {
	
	public RemoteWebDriver driver;
	protected static Properties prop;
	public String sUrl,primaryWindowHandle,sHubUrl,sHubPort;
	public WebDriverWait wait;
	LocalDate today = LocalDate.now();

	public GenericWrappers() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
			sHubUrl = prop.getProperty("HUB");
			sHubPort = prop.getProperty("PORT");
			sUrl = prop.getProperty("URL");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public GenericWrappers(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		this.wait = new WebDriverWait(driver, 30);
	}

	public void loadObjects() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream(new File("./src/main/resources/object.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void unloadObjects() {
		prop = null;
	}

	/**
	 * This method will launch the browser in local machine and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Arunkumar K
	 * @param url - The url with http or https
	 * @return 
	 * 
	 */
	public RemoteWebDriver invokeApp(String browser) {
		return invokeApp(browser,false);
	}

	/**
	 * This method will launch the browser in grid node (if remote) and maximise the browser and set the
	 * wait for 30 seconds and load the url 
	 * @author Arunkumar K
	 * @param url - The url with http or https
	 * @return 
	 * 
	 */
	public RemoteWebDriver invokeApp(String browser, boolean bRemote) {
		try {

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName(browser);
			dc.setPlatform(Platform.WINDOWS);

			// this is for grid run
			if(bRemote)
				driver = new RemoteWebDriver(new URL("http://"+sHubUrl+":"+sHubPort+"/wd/hub"), dc);
			else{ // this is for local run
				if(browser.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				}else if (browser.equalsIgnoreCase("firefox")){
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				}else if (browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
					driver = new InternetExplorerDriver();					
				}
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(sUrl);

			primaryWindowHandle = driver.getWindowHandle();		
			reportStep("The browser:" + browser + " launched successfully", "PASS");

		} catch (Exception e) {
			e.printStackTrace();
			reportStep("The browser:" + browser + " could not be launched", "FAIL");
		}
		
		return driver;
	}

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Arunkumar K
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	//
	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElement(By.id(idValue)).sendKeys(data);	
			reportStep("The data: "+data+" entered successfully in field :"+idValue, "PASS");
		} catch (NoSuchElementException e) {
			reportStep("The data: "+data+" could not be entered in the field :"+idValue, "FAIL");
		}
		catch (WebDriverException e) {
			reportStep("Unknown exception occured while entering "+data+" in the field :"+idValue, "FAIL");
		}
		catch (Exception e) {
			reportStep("Unknown exception occured while entering "+data+" in the field :"+idValue, "FAIL");
		}
	}

	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Arunkumar K
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	
	//Enter the values using Name Locator
	public void enterByName(String nameValue, String data) {
		try {
			driver.findElement(By.name(nameValue)).clear();
			driver.findElement(By.name(nameValue)).sendKeys(data);	
			reportStep("The data: "+data+" entered successfully in field :"+nameValue, "PASS");

		} catch (NoSuchElementException e) {
			reportStep("The data: "+data+" could not be entered in the field :"+nameValue, "FAIL");
		} catch (Exception e) {
			reportStep("Unknown exception occured while entering "+data+" in the field :"+nameValue, "FAIL");
		}

	}

	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param xpathValue - xpathValue of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Arunkumar K
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterByXpath(String xpathValue, String data) {
		try {
		    	this.wait = new WebDriverWait(driver, 30);
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).click();
			driver.findElement(By.xpath(xpathValue)).clear();
			driver.findElement(By.xpath(xpathValue)).sendKeys(data);	
			reportStep("The data: "+data+" entered successfully in field :"+xpathValue, "PASS");

		} catch (NoSuchElementException e) {
			reportStep("The data: "+data+" could not be entered in the field :"+xpathValue, "FAIL");
		} catch (Exception e) {
			reportStep("Unknown exception occured while entering "+data+" in the field :"+xpathValue, "FAIL");
		}

	}

	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param xpathValue - xpathValue of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Arunkumar K
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	public void enterByLinkText(String linkText, String data) {
		try {
			driver.findElement(By.linkText(linkText)).clear();
			driver.findElement(By.linkText(linkText)).sendKeys(data);	
			reportStep("The data: "+data+" entered successfully in field :"+linkText, "PASS");

		} catch (NoSuchElementException e) {
			reportStep("The data: "+data+" could not be entered in the field :"+linkText, "FAIL");
		} catch (Exception e) {
			reportStep("Unknown exception occured while entering "+data+" in the field :"+linkText, "FAIL");
		}

	}
	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Arunkumar K
	 */
	public boolean verifyTitle(String title){
		boolean bReturn = false;
		try{
			if (driver.getTitle().equalsIgnoreCase(title)){
				reportStep("The title of the page matches with the value :"+title, "PASS");
				bReturn = true;
			}else
				reportStep("The title of the page:"+driver.getTitle()+" did not match with the value :"+title, "FAIL");

		}catch (Exception e) {
			reportStep("Unknown exception occured while verifying the title", "FAIL", false);
		}
		return bReturn;
	}

	/**
	 * This method will verify the given text matches in the element text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Arunkumar K
	 */
	public void verifyTextByXpath(String xpath, String text){
		try {
			String sText = driver.findElementByXPath(xpath).getText();
			if (sText.equalsIgnoreCase(text)){
				reportStep("The text: "+sText+" matches with the value :"+text, "PASS");
			}else{
				reportStep("The text: "+sText+" did not match with the value :"+text, "FAIL");
			}
		}catch (Exception e) {
			reportStep("Unknown exception occured while verifying the text", "FAIL");
		}
	}

	/**
	 * This method will verify the given text is available in the element text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Arunkumar K
	 */
	public void verifyTextContainsByXpath(String xpath, String text){
		try{
			String sText = driver.findElementByXPath(xpath).getText();
			if (sText.contains(text)){
				reportStep("The text: "+sText+" contains the value :"+text, "PASS");
			}else{
				reportStep("The text: "+sText+" did not contain the value :"+text, "FAIL");
			}
		}catch (Exception e) {
			reportStep("Unknown exception occured while verifying the text", "FAIL");
		}
	}

	/**
	 * This method will verify the given text is available in the element text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Arunkumar K
	 */
	public void verifyTextById(String id, String text) {
		try{
			String sText = driver.findElementById(id).getText();
			if (sText.equalsIgnoreCase(text)){
				reportStep("The text: "+sText+" matches with the value :"+text, "PASS");
			}else{
				reportStep("The text: "+sText+" did not match with the value :"+text, "FAIL");
			}
		}catch (Exception e) {
			reportStep("Unknown exception occured while verifying the text", "FAIL");
		}
	}

	/**
	 * This method will verify the given text is available in the element text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Arunkumar K
	 */
	public void verifyTextContainsById(String id, String text) {
		try{
			String sText = driver.findElementById(id).getText();
			if (sText.contains(text)){
				reportStep("The text: "+sText+" contains the value :"+text, "PASS");
			}else{
				reportStep("The text: "+sText+" did not contain the value :"+text, "FAIL");
			}
		}catch (Exception e) {
			reportStep("Unknown exception occured while verifying the text", "FAIL");
		}
	}

	/**
	 * This method will close all the browsers
	 * @author Arunkumar K
	 */
	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			reportStep("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.", "FAIL", false);
		}

	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Arunkumar K
	 */
	public void clickById(String id) {
		try{
			 
			driver.findElement(By.id(id)).click();
			reportStep("The element with id: "+id+" is clicked.", "PASS");

		}catch (NoSuchElementException e) {
			reportStep("The element with id: "+id+" could not be clicked.", "FAIL");
		}
		
		
		catch (Exception e) {
			reportStep("The element with id: "+id+" could not be clicked.", "FAIL");
		}
	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Arunkumar K
	 */
	public void clickByClassName(String classVal) {
		try{
			driver.findElement(By.className(classVal)).click();
			reportStep("The element with class Name: "+classVal+" is clicked.", "PASS");
		} catch (Exception e) {
			reportStep("The element with class Name: "+classVal+" could not be clicked.", "FAIL");
		}
	}
	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Arunkumar K
	 */
	public void clickByName(String name) {
		try{
			driver.findElement(By.name(name)).click();
			reportStep("The element with name: "+name+" is clicked.", "PASS");
		} catch (Exception e) {
			reportStep("The element with name: "+name+" could not be clicked.", "FAIL");
		}
	}

	/**
	 * This method will click the element using partial link name as locator
	 * @param name  The partial link name (locator) of the element to be clicked
	 * @author Arunkumar K
	 */
	public void clickByPartialLinkText(String name) {
		try{
			driver.findElement(By.partialLinkText(name)).click();
			reportStep("The element with link name: "+name+" is clicked.", "PASS");
		} catch (Exception e) {
			reportStep("The element with link name: "+name+" could not be clicked.", "FAIL");
		}
	}

	/**
	 * This method will click the element using link name as locator
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Arunkumar K
	 */
	public void clickByLinkText(String name) {
		try{
			driver.findElement(By.linkText(name)).click();
			reportStep("The element with link name: "+name+" is clicked.", "PASS");
		} catch (Exception e) {
			reportStep("The element with link name: "+name+" could not be clicked.", "FAIL");
		}
	}

	public void clickByLinkTextNoSnap(String name) {
		try{
			driver.findElement(By.linkText(name)).click();
			reportStep("The element with link name: "+name+" is clicked.", "PASS", false);
		} catch (Exception e) {
			reportStep("The element with link name: "+name+" could not be clicked.", "FAIL");
		}
	}

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Arunkumar K
	 */
	public void clickByXpath(String xpathVal) {
		try{
			driver.findElement(By.xpath(xpathVal)).click();
			reportStep("The element : "+xpathVal+" is clicked.", "PASS");
		} catch (Exception e) {
			reportStep("The element with xpath: "+xpathVal+" could not be clicked.", "FAIL");
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try{
			driver.findElement(By.xpath(xpathVal)).click();
			reportStep("The element : "+xpathVal+" is clicked.", "PASS", false);
		} catch (Exception e) {
			reportStep("The element with xpath: "+xpathVal+" could not be clicked.", "FAIL");
		}
	}

	/**
	 * This method will mouse over on the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be moused over
	 * @author Arunkumar K
	 */
	public void mouseOverByXpath(String xpathVal) {
		try{
			new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathVal))).build().perform();
			reportStep("The mouse over by xpath : "+xpathVal+" is performed.", "PASS");
		} catch (Exception e) {
			reportStep("The mouse over by xpath : "+xpathVal+" could not be performed.", "FAIL");
		}
	}

	/**
	 * This method will mouse over on the element using link name as locator
	 * @param xpathVal  The link name (locator) of the element to be moused over
	 * @author Arunkumar K
	 */
	public void mouseOverByLinkText(String linkName) {
		try{
			new Actions(driver).moveToElement(driver.findElement(By.linkText(linkName))).build().perform();
			reportStep("The mouse over by link : "+linkName+" is performed.", "PASS");
		} catch (Exception e) {
			reportStep("The mouse over by link : "+linkName+" could not be performed.", "FAIL");
		}
	}

	/**
	 * This method will return the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element
	 * @author Arunkumar K
	 */
	public String getTextByXpath(String xpathVal){
		String bReturn = "";
		try{
			return driver.findElement(By.xpath(xpathVal)).getText();
		} catch (Exception e) {
			reportStep("The element with xpath: "+xpathVal+" could not be found.", "FAIL");
		}
		return bReturn; 
	}

	/**
	 * This method will return the text of the element using id as locator
	 * @param idVal  The id (locator) of the element
	 * @author Arunkumar K
	 */
	public String getTextById(String idVal) {
		String bReturn = "";
		try{
			return driver.findElementById(idVal).getText();
		} catch (Exception e) {
			reportStep("The element with id: "+idVal+" could not be found.", "FAIL");
		}
		return bReturn; 
	}

	/**
	 * This method will select the drop down value using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Arunkumar K
	 */
	public void selectVisibileTextById(String id, String value) {
		try{
			new Select(driver.findElement(By.id(id))).selectByVisibleText(value);;
			reportStep("The element with id: "+id+" is selected with value :"+value, "PASS");
		} catch (Exception e) {
			reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
	}

	public void selectVisibileTextByXPath(String xpath, String value) {
		try{
			new Select(driver.findElement(By.xpath(xpath))).selectByVisibleText(value);
			reportStep("The element with xpath: "+xpath+" is selected with value :"+value, "PASS");
		} catch (Exception e) {
			reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
	}

	public void selectIndexById(String id, String value) {
		try{
			new Select(driver.findElement(By.id(id))).selectByIndex(Integer.parseInt(value));
			reportStep("The element with id: "+id+" is selected with index :"+value, "PASS");
		} catch (Exception e) {
			reportStep("The index: "+value+" could not be selected.", "FAIL");
		}
	}

	public String getSelectedDropDownText(String xpath) {
	    	String text = null;
		try{
			text = new Select(driver.findElement(By.xpath(xpath))).getFirstSelectedOption().getText();
			reportStep("The current selected text of the element with xpath: "+xpath+" is: "+text, "PASS");
		} catch (Exception e) {
			reportStep("The current selected text of the element with xpath: "+xpath+" could not be retrieved ", "FAIL");
		}
		return text;
	}

	public void switchToParentWindow() {
		try {
			Set<String> winHandles = driver.getWindowHandles();
			for (String wHandle : winHandles) {
				driver.switchTo().window(wHandle);
				break;
			}
		} catch (Exception e) {
			reportStep("The window could not be switched to the first window.", "FAIL");
		}
	}

	public void switchToLastWindow() {
		try {
			Set<String> winHandles = driver.getWindowHandles();
			for (String wHandle : winHandles) {
				driver.switchTo().window(wHandle);
			}
		} catch (Exception e) {
			reportStep("The window could not be switched to the last window.", "FAIL");
		}
	}

	public void acceptAlert() {
		try {
		    	wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			reportStep("The alert could not be found.", "FAIL");
		} catch (Exception e) {
			reportStep("The alert could not be accepted.", "FAIL");
		}

	}
	

	public String getAlertText() {		
		String text = null;
		try {
			driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			reportStep("The alert could not be found.", "FAIL", false);
		} catch (Exception e) {
			reportStep("The alert could not be accepted.", "FAIL", false);
		}
		return text;

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			reportStep("The alert could not be found.", "FAIL");
		} catch (Exception e) {
			reportStep("The alert could not be accepted.", "FAIL");
		}

	}

	/**
	 * This method will send the given key combination to the element using Xpath as locator
	 * @param keyValue The value to be sent to the element 
	 * @author Arunkumar K
	 */
	public void sendKeys(Keys keyValue) {
		try{
		    	Actions action = new Actions(driver);
		    	action.sendKeys(keyValue).build().perform();
			reportStep("The key combination: "+keyValue+" is sent.", "PASS");
		} catch (Exception e) {
			reportStep("The key combination: "+keyValue+" could not be sent.", "FAIL");
		}
	}

	/**
	 * This method will send the given String to Window Forms
	 * @param value The value to be sent to the element 
	 * @author Arunkumar K
	 */
	public void sendKeysToWindows(String value) {
		try{
		    	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    	StringSelection stringSelection = new StringSelection( value );
		    	clipboard.setContents(stringSelection, stringSelection);
		    	Robot robot = new Robot();
		    	robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
			reportStep("The string: "+value+" is sent.", "PASS");
		} catch (Exception e) {
			reportStep("The string: "+value+" could not be sent.", "FAIL");
		}
	}

	/**
	 * This method will retrieve the row count for the table
	 * @param tableRows The Xpath of the table rows
	 * @author Arunkumar K
	 */
	public int getRowCount(String tableRows) {
		try{
		    	int rowCount = 0;
		    	List<WebElement> rows = driver.findElements(By.xpath(tableRows));
		    	rowCount += rows.size();
			reportStep("The row count for "+tableRows+" is retrieved.", "PASS");
		    	return rowCount;
		} catch (Exception e) {
			reportStep("The row count for "+tableRows+" could not be retrieved.", "FAIL");
			return 0;
		}
	}

	/**
	 * This method will retrieve the row count for the table
	 * @param tableRows The Xpath of the table rows
	 * @param nextButton The next button to be pressed to get to next page of the table
	 * @author Arunkumar K
	 */
	public int getRowCount(String tableRows, String nextButton) {
		try{
		    	int rowCount = 0;
		    	do {
		    	    List<WebElement> rows = driver.findElements(By.xpath(tableRows));
		    	    rowCount += rows.size();
			} while (driver.findElement(By.xpath(nextButton)).isEnabled());
			reportStep("The row count for "+tableRows+" is retrieved.", "PASS");
		    	return rowCount;
		} catch (Exception e) {
			reportStep("The row count for "+tableRows+" could not be retrieved.", "FAIL");
			return 0;
		}
	}

	/**
	 * This method will assert if the actual and expected value are equal
	 * @param actual The actual value
	 * @param expected The expected value
	 * @author Arunkumar K
	 */
	public void verifyIfEqual(Object actual, Object expected) {
		try{
		    	assertEquals(actual, expected);
			reportStep("The actual value "+actual+" is equal to expected value "+expected+".", "PASS");
		} catch (Exception e) {
			reportStep("The actual value "+actual+" is not equal to expected value "+expected+".", "FAIL");
		}
	}

	/**
	 * This method will switch to the required frame
	 * @param index Index value of the frame
	 * @author Arunkumar K
	 */
	public void goToFrame(int index) {
		try{
		    	driver.switchTo().frame(index);
			reportStep("Switch to frame "+index+" is successful", "PASS");
		} catch (Exception e) {
			reportStep("Switch to frame "+index+" is not successful", "FAIL");
		}
	}

	/**
	 * This method will switch back from the existing frame to main window;
	 * @param index Index value of the frame
	 * @author Arunkumar K
	 */
	public void getOutOfFrame() {
		try{
		    	driver.switchTo().defaultContent();
			reportStep("Switch from frame is successful", "PASS");
		} catch (Exception e) {
			reportStep("Switch from frame is not successful", "FAIL");
		}
	}

	/**
	 * This method will verify if given file exists or not;
	 * @param fileName The fileName with absolute path
	 * @author Arunkumar K
	 */
	public void verifyFileExists(String fileName) {
		try{
		    	File file = new File(fileName);
		    	file.exists();
			reportStep("The file "+fileName+" is available", "PASS");
		} catch (Exception e) {
			reportStep("The file "+fileName+" is not available", "FAIL");
		}
	}

	/**
	 * This method will verify if given file exists or not;
	 * @param fileName The fileName with absolute path
	 * @author Arunkumar K
	 */
	public void verifyFileExists(String directoryPath, String fName) {
		try{
		    	File directory = new File(directoryPath);
		    	FileFilter fileFilter = new WildcardFileFilter(fName);
		    	File[] fileList = directory.listFiles(fileFilter);
		    	String fileName = fileList[0].getName();
			reportStep("The file "+fileName+" is available", "PASS");
		} catch (Exception e) {
			reportStep("The file which contains "+fName+" is not available", "FAIL");
		}
	}

	public long takeSnap(){
		/*long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;*/
	    	String date = DateTimeFormatter.ofPattern("yyyyMMdd").format(today);
		int fileCount = new File(".\\reports\\images").list().length;
		long padding = (long) (10000+fileCount+1);
		String fileName = date+Long.toString(padding);
		long fName = Long.valueOf(fileName).longValue();
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+fileName+".jpg"));
		} catch (WebDriverException e) {
			e.printStackTrace();
			reportStep("The browser has been closed.", "FAIL", false);
		} catch (IOException e) {
			reportStep("The snapshot could not be taken", "WARN", false);
		}
		return fName;
	}

}