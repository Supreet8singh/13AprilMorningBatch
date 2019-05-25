package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import utility.CommonMethods;
import utility.ConstantLocators;

public class Flight_Select {

	public void flightPrice() throws Exception {
		Thread.sleep(10000);
		String fightPrice = CommonMethods.fetchValues(ConstantLocators.flightPrice_FlightSelectPage);
		System.out.println(fightPrice);
	}
	
	public void selectTime() {
		CommonMethods.click(ConstantLocators.selectTime_FlightSelectPage);
	}
	
	public void NoofFlights() {
		List<WebElement> availableFlights = CommonMethods.allelements(ConstantLocators.allFlights_FlightSelectPage);
		
		int noOfFlights = availableFlights.size();
				System.out.println(noOfFlights);
				
				for (int i = 0; i < noOfFlights-1; i++) {
				String flPrice = availableFlights.get(i).getText();
				String v = flPrice.split(" ")[1];
				String a = v.replace(",", "");
				int q = Integer.parseInt(a);
				System.out.println(q);

				availableFlights.get(2).click();
			}	
	}
	
}
