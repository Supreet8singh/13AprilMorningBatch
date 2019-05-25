package testCases;

import pages.Lounge_Header;
import utility.CommonMethods;

public class TC004 {

	public static void tc04() throws Exception {
		
		Lounge_Header LH = new Lounge_Header();
		
		Thread.sleep(2000);
		LH.loungeMainMenu();
		Thread.sleep(2000);
		LH.loungeServices();
		LH.getLoungeServices();
		
		CommonMethods.closeBrowser();
	}
}
