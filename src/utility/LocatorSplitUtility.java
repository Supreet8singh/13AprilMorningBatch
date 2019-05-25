package utility;

import org.openqa.selenium.By;

public class LocatorSplitUtility {

	public static By locatorSplit(String locVariable) { //xpath://*[starts-with(@id,'dp155')]/div/div[2]/table/tbody/tr
		String locType = locVariable.split(":")[0];		//name
		String locValue = locVariable.split(":")[1];	//passenger
		
		System.out.println(locType);
		System.out.println(locValue);

		if (locType.equalsIgnoreCase("Name")) {
			return  By.name(locValue);      //By.name("passenger")
		} else if (locType.equalsIgnoreCase("ID")) {
			return By.id(locValue);
		} else if (locType.equalsIgnoreCase("CSSSELECTOR")) {
			return By.cssSelector(locValue);
		} else if (locType.equalsIgnoreCase("LINKTEXT")) {
			return By.linkText(locValue);
		} else if (locType.equalsIgnoreCase("PARTIALLINKTEXT")) {
			return By.partialLinkText(locValue);
		} else if (locType.equalsIgnoreCase("XPATH")) {
			return By.xpath(locValue);
		} 
		return null;
	}
}
