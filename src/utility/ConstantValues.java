package utility;

public class ConstantValues {

//	public static String browserName = "CHROME";
//	public static String websiteURL = "https://www.goindigo.in/?linkNav=home_header";
//	public static String departueCity = "Chennai (MAA)";
//	public static String arrivaleCity = "Ahmedabad (AMD)";
//	public static String travelDate = "20";
//	public static String excelPath = "E:\\13AprilBatch\\DataDrivenFramework\\Indigo Test Cases.xlsx";
//	public static String testcasesSheetName = "TestCases";

	public static final String browserName = ExcelReadWrite.readValues("TestCases", 1, 4);
	public static final String websiteURL = ExcelReadWrite.readValues("TestCases", 2, 4);
	public static final String departueCity = ExcelReadWrite.readValues("TestCases", 3, 4);
	public static final String arrivaleCity = ExcelReadWrite.readValues("TestCases", 4, 4);
	public static final String travelDate = ExcelReadWrite.readValues("TestCases", 5, 4);
	public static final String excelPath = "E:\\13AprilBatch\\HybridFarmework_WithMaven\\Indigo Test Cases.xlsx";
	public static final String testcasesSheetName = "TestCases";
	public static final String testScenarioSheet = "Test Scenarios";
	public static final int runModeCol = 3;
	public static final int statusCol = 2;
}
