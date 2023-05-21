package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	// read the data from iPL sheet

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// read the multiple data from iPL sheet


		for(int i=0; i<=10; i++)
		{


			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");

			Workbook wb = WorkbookFactory.create(fis);

			Sheet sheet = wb.getSheet("IPL");

			Row row = sheet.getRow(i);

			Cell cell = row.getCell(1);

			String data = cell.getStringCellValue();

			System.out.println(data);

		}


	}

}
