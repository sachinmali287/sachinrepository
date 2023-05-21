package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// it is use to store generic reusable methods..
	// all the methods are Non static

	public String readexceldata(String exacelPath,String sheetname, int rowCount, int cellCount) throws EncryptedDocumentException, IOException 
	{

		FileInputStream fis = new FileInputStream(exacelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;

	}

	public int rowCount(String exacelPath,String sheetname) throws EncryptedDocumentException, IOException
	{

		FileInputStream fis = new FileInputStream(exacelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;


	}

}
