package testCases;

import pages.Contact_Us;

public class TC003 {

	public static void tc03() throws Exception {
		
		Contact_Us CU = new Contact_Us();
		
		Thread.sleep(2000);
		
		CU.contatctUsLink();
		Thread.sleep(2000);
		CU.allWindows();
		Thread.sleep(2000);
		CU.corpOfficeaddress();

	}
}
