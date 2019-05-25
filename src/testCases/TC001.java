package testCases;

import pages.Flight_Select;
import pages.Home_Header;
import utility.CommonMethods;
import utility.ConstantValues;

public class TC001 {

	public static void tc01() throws Exception {
		
		CommonMethods.browserType(ConstantValues.browserName);
		CommonMethods.openURL(ConstantValues.websiteURL);
		
		Home_Header HH = new Home_Header();
		Flight_Select FS = new Flight_Select();

		HH.selectDeparture();
		HH.selectDestination();
		HH.selectDate();
		HH.selectPassengers();
		HH.passengercount();
		HH.confirmPassengers();
		HH.searchFlight();

		FS.flightPrice();
	}
}
