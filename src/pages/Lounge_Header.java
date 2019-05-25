package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import utility.CommonMethods;
import utility.ConstantLocators;

public class Lounge_Header {

	public void loungeMainMenu() {
		CommonMethods.mouseHoverwithoutClick(ConstantLocators.loungeMainMenu_LoungeHeaderPage);
	}
	
	public void loungeServices() {
		CommonMethods.mouseHoverwithtClick(ConstantLocators.loungeSubMenu_LoungeHeaderPage);
	}
	
	public void getLoungeServices() {
		List<WebElement> allservices = CommonMethods.allelements(ConstantLocators.allServices_LoungeHeaderPage);
		
		for (int i = 0; i < allservices.size(); i++) {
			String serviceNames = allservices.get(i).getText();
			System.out.println(serviceNames);
		}
	}

}
