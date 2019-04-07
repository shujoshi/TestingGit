package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead1 {

	public static void main(String[] args) throws IOException {}
	
	File file = new File("C://Users//Shubham//Desktop//SeleniumExcel.xlsx");
	
	FileInputStream ip = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook(ip);
	
	XSSFSheet sheet = wb.getSheet("Sheet1");
	
	
}
