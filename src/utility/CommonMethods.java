package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import p1.MainMethod;

public class CommonMethods {

	public static WebDriver driver; 
	public static boolean bvalue;
	static String value; 
	static List<WebElement> elements;
	
	public static WebDriver browserType(String bName) {
		if (bName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
			Log.info("The browser which got openend is :" + bName);
			Reporter.log("The browser which got openend is :" + bName);
		} else if (bName.equalsIgnoreCase("FIREFOX")) {
			driver = new FirefoxDriver();
			Log.info("The browser which got openend is :" + bName);
			Reporter.log("The browser which got openend is :" + bName);
		}
		return driver;
	}
	
	public static void openURL(String testData) {
		try {
			driver.get(testData);
			driver.manage().window().maximize();			
			Log.info("The URL which got openend is :" + testData);
			Reporter.log("The URL which got openend is :" + testData);
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Not able to open the URL :" + testData);
			Reporter.log("Not able to open the URL :" + testData);
			e.printStackTrace();
		}
	}
	
	public static void enterText(String locVariable, String testData) { 
		try {
			WebElement element = driver.findElement(LocatorSplitUtility.locatorSplit(locVariable)); 
			element.sendKeys(testData);			
			Log.info("Sucessfully entered the text in  :" + locVariable + " and the value is : " + testData);
			Reporter.log("Sucessfully entered the text in  :" + locVariable + " and the value is : " + testData);
		} catch (Exception e) { 
			MainMethod.tvalue = false;
			Log.error("Did now enter the text in  :" + locVariable + " and the value is : " + testData);
			Reporter.log("Did now enter the text in  :" + locVariable + " and the value is : " + testData);
			e.printStackTrace();
		}
	}
	
	public static void enterKeys(String locVariable, Keys testData) { 
		try {
			WebElement element = driver.findElement(LocatorSplitUtility.locatorSplit(locVariable)); 
			element.sendKeys(testData);			
			Log.info("Sucessfully worked with the keyboard keys in  :" + locVariable);
			Reporter.log("Sucessfully worked with the keyboard keys in  :" + locVariable);
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Did now work with the keyboard keys  :" + locVariable);
			Reporter.log("Did now work with the keyboard keys  :" + locVariable);
			e.printStackTrace();
		}
	}
	
	public static void click(String locVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitUtility.locatorSplit(locVariable)); 
			element.click();			
			Log.info("Sucessfully clicked the webelement at  :" + locVariable);
			Reporter.log("Sucessfully clicked the webelement at  :" + locVariable);
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Not able to click at the webelement  :" + locVariable);
			Reporter.log("Not able to click at the webelement  :" + locVariable);
			e.printStackTrace();
		}

	}
	
	public static void mouseHoverwithoutClick(String locVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitUtility.locatorSplit(locVariable)); 
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();			
			Log.info("Sucessfully hovered the mouse at the webelement :" + locVariable);
			Reporter.log("Sucessfully hovered the mouse at the webelement :" + locVariable);
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Now able to  hover the mouse at the webelement :" + locVariable);
			Reporter.log("Now able to  hover the mouse at the webelement :" + locVariable);
			e.printStackTrace();
		}

	}
	
	public static void mouseHoverwithtClick(String locVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitUtility.locatorSplit(locVariable)); 
			Actions act = new Actions(driver);
			act.moveToElement(element).click().perform();		
			Log.info("Sucessfully hovered and click the mouse at the webelement :" + locVariable);
			Reporter.log("Sucessfully hovered and click the mouse at the webelement :" + locVariable);
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Not able to hover and click the mouse at the webelement :" + locVariable);
			Reporter.log("Not able to hover and click the mouse at the webelement :" + locVariable);
			e.printStackTrace();
		}

	}
	
	public static String fetchValues(String locVariable) {
		try {
			WebElement element = driver.findElement(LocatorSplitUtility.locatorSplit(locVariable)); 
			value = element.getText();			
			Log.info("Sucessfully fetched the value from the webelement : " + locVariable + "and the value is : " + value);
			Reporter.log("Sucessfully fetched the value from the webelement : " + locVariable + "and the value is : " + value);
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Not able to fetch the value from the webelement : " + locVariable + "and the value is : " + value);
			Reporter.log("Not able to fetch the value from the webelement : " + locVariable + "and the value is : " + value);
			e.printStackTrace();
		}
		return value;
	}
	
	public static void allWindows(int testData) {
		try {
			List<String> allwindows = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(allwindows.get(testData));			
			Log.info("Sucessfully switched to a new window ");
			Reporter.log("Sucessfully switched to a new window ");
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Not able to switch to a new window ");
			Reporter.log("Not able to switch to a new window ");
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser() {
		try {
			driver.quit();			
			Log.info("Sucessfully closed the browser");
			Reporter.log("Sucessfully closed the browser");
		} catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Not able to close the browser");
			Reporter.log("Not able to close the browser");
			e.printStackTrace();
		}
	}
	
	public static void calenderDate(String locVariable, String testData) throws Exception {
		try {
		Thread.sleep(1000);
		List<WebElement> tableRows = driver.findElements(LocatorSplitUtility.locatorSplit(locVariable));
		int rowCount = tableRows.size();
		
		System.out.println(rowCount);
		
		for (int i = 0; i < rowCount; i++) {
			if (CommonMethods.bvalue == true) {
				break;
			} 
			
			else {
			List<WebElement> tabaleData = tableRows.get(i).findElements(By.tagName("td"));
			int dataCount = tabaleData.size();
			System.out.println("The count in row # " + i + " is --- " + dataCount);
			
				for (int j = 0; j < dataCount; j++) 
				{
					String tableValue = tabaleData.get(j).getText();
						System.out.println("The value in table row # " + i + " and column # " + j + " is " + tableValue);
						
						if (tableValue.equals(testData)) 
							{
							tabaleData.get(j).click();
							CommonMethods.bvalue = true;
							break;
					}
				}
			}		
		}
		
		Log.info("Sucessfully fetched the date from the calender :" + testData);
		Reporter.log("Sucessfully fetched the date from the calender :" + testData);
		}		
		catch (Exception e) {
			MainMethod.tvalue = false;
			Log.error("Not able to fetch the date from the calender :" + testData);
			Reporter.log("Not able to fetch the date from the calender :" + testData);
			e.printStackTrace();
		}
	}
	
	public static List<WebElement> allelements(String locVariable){
		try {
			elements = driver.findElements(LocatorSplitUtility.locatorSplit(locVariable));			
		} catch (Exception e) {
			MainMethod.tvalue = false;
			e.printStackTrace();
		}
		return elements;
	}
}
