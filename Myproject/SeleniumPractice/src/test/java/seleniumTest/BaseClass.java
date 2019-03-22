package seleniumTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	
	
	public String getData(int i, int j) throws IOException
	{
		FileInputStream fis =new FileInputStream("C:\\Users\\ganesh.achari\\Desktop\\Selenium.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(i);
		String cell=row.getCell(j).toString();
		return cell;
	}
}