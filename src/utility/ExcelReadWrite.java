package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	static XSSFWorkbook wB;
	static XSSFSheet wS;
	static XSSFCell xC;
	
	public static void setExcel(String pathName) throws Exception {
		
		File f = new File(pathName);
		FileInputStream fis = new FileInputStream(f);
		wB = new XSSFWorkbook(fis);
	}
	
	public static String readValues(String sheetName, int rownumber, int colNum) {
		wS = wB.getSheet(sheetName);
		xC = wS.getRow(rownumber).getCell(colNum);
		
		DataFormatter df = new DataFormatter();
		String cellData = df.formatCellValue(xC);
		
		return cellData;		
	}
	
	public static void writeValue(String sheetName, int rownumber, int colNum, String value) throws Exception {
		wS = wB.getSheet(sheetName);
		xC = wS.getRow(rownumber).getCell(colNum);
		
		xC.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(ConstantValues.excelPath);
		wB.write(fos);
		fos.close();
		
		File f = new File(ConstantValues.excelPath);
		FileInputStream fis = new FileInputStream(f);
		wB = new XSSFWorkbook(fis);		
		
	}
	
//	public static void main(String[] args) throws Exception {
//		setExcel("E:\\13AprilBatch\\DataDrivenFramework\\Indigo Test Cases.xlsx");
//		System.out.println(readValues("TestCases", 10, 3));
//		System.out.println(readValues("TestCases", 15, 3));
//		System.out.println(readValues("TestCases", 0, 3));
//		System.out.println(readValues("TestCases", 1, 3));
//		System.out.println(readValues("TestCases", 5, 4));
//		
//		writeValue("TestCases", 10, 4, "PASS");
//		writeValue("TestCases", 11, 4, "PASS");
//		writeValue("TestCases", 12, 4, "PASS");
//		writeValue("TestCases", 13, 4, "PASS");
//	}
//	
}
