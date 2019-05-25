package p1;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testCases.TC001;
import testCases.TC002;
import testCases.TC003;
import testCases.TC004;
import utility.ConstantValues;
import utility.ExcelReadWrite;
import utility.Log;

public class MainMethod {
	
	public static boolean tvalue;

		@BeforeClass
		public static void prerequiste() throws Exception {
			ExcelReadWrite.setExcel(ConstantValues.excelPath);
			DOMConfigurator.configure("log4j.xml");
		}

//----------------------------------------------TC001------------------------------------------------		
		@Test(priority=1)
		public static void tc001() throws Exception{
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, 1, ConstantValues.runModeCol).equalsIgnoreCase("Y")) {
			tvalue = true;
			Log.startTestCase("TC001");
			TC001.tc01();
			Log.endTestCase();
			if (tvalue == false) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 1, ConstantValues.statusCol, "FAIL");				
			} else if (tvalue == true) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 1, ConstantValues.statusCol, "PASS");								
			}
		} else {
			ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 1, ConstantValues.statusCol, "SKIP");
		}
		}
//----------------------------------------------TC002------------------------------------------------		
		@Test(priority=2)
		public static void tc002() throws Exception {
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, 2, ConstantValues.runModeCol).equalsIgnoreCase("Y")) {
			tvalue = true;
			Log.startTestCase("TC002");
			TC002.tc02();
			Log.endTestCase();
			if (tvalue == false) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 2, ConstantValues.statusCol, "FAIL");				
			} else if (tvalue == true) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 2, ConstantValues.statusCol, "PASS");								
			}
		} else {
			ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 2, ConstantValues.statusCol, "SKIP");
		}
		}
//----------------------------------------------TC003------------------------------------------------
		@Test(priority=3)
		public static void tc003() throws Exception {
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, 3, ConstantValues.runModeCol).equalsIgnoreCase("Y")) {
			tvalue = true;
			Log.startTestCase("TC003");
			TC003.tc03();
			Log.endTestCase();
			if (tvalue == false) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 3, ConstantValues.statusCol, "FAIL");				
			} else if (tvalue == true) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 3, ConstantValues.statusCol, "PASS");								
			}
		} else {
			ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 3, ConstantValues.statusCol, "SKIP");
		}
		}
//----------------------------------------------TC004------------------------------------------------
		@Test(priority=4)
		public static void tc004() throws Exception {
		if (ExcelReadWrite.readValues(ConstantValues.testScenarioSheet, 4, ConstantValues.runModeCol).equalsIgnoreCase("Y")) {
			tvalue = true;
			Log.startTestCase("TC004");
			TC004.tc04();
			Log.endTestCase();
			if (tvalue == false) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 4, ConstantValues.statusCol, "FAIL");				
			} else if (tvalue == true) {
				ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 4, ConstantValues.statusCol, "PASS");								
			}
		} else {
			ExcelReadWrite.writeValue(ConstantValues.testScenarioSheet, 4, ConstantValues.statusCol, "SKIP");
		}
		}
	}
