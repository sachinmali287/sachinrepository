package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Read data from ipl Excel Sheet

		// provide the path of excel file
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); 

		// make the file ready  for read
		Workbook wb = WorkbookFactory.create(fis);

		// get into the sheet
		Sheet sheet = wb.getSheet("IPL");

		// get into the desired row
		Row row = sheet.getRow(2); 

		// get into desired cell
		Cell cell = row.getCell(1); 

		// read the value from cell
		String data = cell.getStringCellValue();
		System.out.println(data);

	}

}
