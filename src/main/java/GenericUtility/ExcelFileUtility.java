package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelFileUtility {
	public String readDataFromExcel(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Vtiger.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row rw = sh.getRow(rowNo);
			Cell ce = rw.getCell(cellNo);
			return ce.getStringCellValue();
	}
	public int countRow(String sheetName) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Vtiger.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int lastRow = sh.getLastRowNum();
			return lastRow;
	}
	
	public void writeDataIntoExcelSheet(String sheet,int rowNo,int cellNo,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Vtiger.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheet);
		 Row rw = sh.getRow(rowNo);
		 
		Cell ce = rw.createCell(cellNo);
		ce.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Vtiger.xlsx");
		wb.write(fos);
		wb.close();
	}


}
