package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelData {
 public static void main(String[] args) throws IOException {
	 File file = new File("C:\\Users\\Shubham\\Desktop\\SeleniumExcel.xlsx");
	 
	 FileInputStream ip = new FileInputStream(file);
	 
	 XSSFWorkbook wb = new XSSFWorkbook(ip);
	 
	 XSSFSheet sheet = wb.getSheet("Sheet1");
	 
	 int rowCount = sheet.getLastRowNum()- sheet.getFirstRowNum();
	 
	 System.out.println("Number of rows in Excel Sheets are: " + rowCount);
	 
 }
}
