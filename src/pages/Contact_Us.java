package pages;

import utility.CommonMethods;
import utility.ConstantLocators;

public class Contact_Us {

	public void contatctUsLink() {
		CommonMethods.click(ConstantLocators.contactUsLink_ContatctUSPage);
	}
	
	public void allWindows() {
		CommonMethods.allWindows(1);
	}
	
	public void corpOfficeaddress() {
		String add = CommonMethods.fetchValues(ConstantLocators.corpOffAdd_ContactUSPage);
		System.out.println(add);
	}
}
