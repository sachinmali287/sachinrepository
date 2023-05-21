package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowLastNum {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Generalize the row count

		FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");

		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("IPL");

		int rc=sheet2.getLastRowNum();   // count the row start to end

		for(int i=0; i<=rc; i++)
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
