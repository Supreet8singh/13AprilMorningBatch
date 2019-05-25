package pages;

import org.openqa.selenium.Keys;
import utility.CommonMethods;
import utility.ConstantLocators;
import utility.ConstantValues;

public class Home_Header {

	public void selectDeparture() {
		for (int i = 0; i < 30; i++) {
			CommonMethods.enterKeys(ConstantLocators.element_From_HomeHeaderPage, Keys.BACK_SPACE);
		}
			CommonMethods.enterText(ConstantLocators.element_From_HomeHeaderPage, ConstantValues.departueCity);
			CommonMethods.enterKeys(ConstantLocators.element_From_HomeHeaderPage, Keys.ENTER);
	}
	
	public void selectDestination() throws Exception {
		Thread.sleep(1000);
		CommonMethods.enterText(ConstantLocators.element_Destination_HomeHeaderPage, ConstantValues.arrivaleCity);
		CommonMethods.enterKeys(ConstantLocators.element_Destination_HomeHeaderPage, Keys.TAB);

	}
	
	public void selectDate() throws Exception {
		CommonMethods.calenderDate(ConstantLocators.date_Tablerows_HomeHeaderPage, ConstantValues.travelDate);
	}
	
	public void selectPassengers() {
		CommonMethods.click(ConstantLocators.PassengersLink_HomeHeaderPage);
	}

	public void passengercount() {
		for (int j = 0; j < 2; j++) {
			CommonMethods.click(ConstantLocators.noOfPassengers_HomeHeaderPage);
		}
	}
	
	public void confirmPassengers() {
		CommonMethods.click(ConstantLocators.confirmPassenger_HomeHeaderPage);
	}
	
	public void searchFlight() {
		CommonMethods.click(ConstantLocators.ele_Searchflight_HomeHeaderPage);
	}
}
