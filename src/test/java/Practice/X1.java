package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class X1 {
	
//	public void readDataFromExcel(String sheetName,int rowNo) throws EncryptedDocumentException, IOException {
//		 FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Vtiger.xlsx");
//			Workbook wb=WorkbookFactory.create(fis);
//			Sheet sh = wb.getSheet(sheetName);
//			sh.getRow(rowNo);
//		
//	}
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888");
	}

}
