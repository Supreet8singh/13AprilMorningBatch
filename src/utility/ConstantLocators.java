package utility;

public class ConstantLocators {

	//locatortype:locatorvalue
	public static String element_From_HomeHeaderPage = "name:or-src";
	public static String element_Destination_HomeHeaderPage = "name:or-dest";
	public static String date_Tablerows_HomeHeaderPage = "xpath://*[starts-with(@id,'dp155')]/div/div[2]/table/tbody/tr";
	public static String PassengersLink_HomeHeaderPage = "name:passenger";
	public static String noOfPassengers_HomeHeaderPage = "xpath://*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]/span";
	public static String confirmPassenger_HomeHeaderPage = "xpath://*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/div/button";		
			
	public static String ele_Searchflight_HomeHeaderPage = "xpath://*[@id='bookFlightTab']/form/div[7]/div[6]/button/span[1]";
	
	public static String flightPrice_FlightSelectPage = "xpath://*[@id='bookingWidgetContainer']/div/div/div/div[2]/div[3]/div/div[1]/span";
	public static String selectTime_FlightSelectPage = "xpath://*[@id='flightSelectMount']/div/div[1]/div/div/div/div[1]/div[1]/div/div/div[2]/div/button[1]";
	public static String allFlights_FlightSelectPage = "xpath://*[starts-with(@class,'row trips-row d-none ')]/div[2]/div/label[1]/div[2]/span";
	
	public static String contactUsLink_ContatctUSPage = "linkText:Contact us";
	public static String corpOffAdd_ContactUSPage = "xpath:/html/body/div[6]/div[1]/div[1]/div/div[2]/div/div[1]/p[1]";
	
	public static String loungeMainMenu_LoungeHeaderPage = "linkText:Manage";
	public static String loungeSubMenu_LoungeHeaderPage = "linkText:Lounge Services";
	public static String allServices_LoungeHeaderPage = "xpath://*[@id='collapse-1607573621']/div/div/div[1]/p";

	
}
