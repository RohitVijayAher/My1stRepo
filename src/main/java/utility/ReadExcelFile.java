package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {

	public static String ExcelFile(int row,int cell) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Windows 10\\eclipse-workspace\\A_FB_FrameWork\\TestData\\FB_Data.xlsx");
	    Sheet data = WorkbookFactory.create(file).getSheet("FB_Data");
	    String value = data.getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}
}
