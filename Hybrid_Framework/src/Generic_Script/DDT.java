package Generic_Script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT 
{
	public static String getData(String sh,int r,int c) 
	{
		String Value = null;
		try 
		{
		FileInputStream fis = new FileInputStream("./Excel/Test_Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sh);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		Value=cell.toString();
		}
		catch(Exception e) 
		{
		System.out.println(e);
		}
		return Value;
	}
}
