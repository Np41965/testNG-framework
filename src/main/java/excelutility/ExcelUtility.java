package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import baselibrary.Baselibrary;


public class ExcelUtility extends Baselibrary
{
	public static String path ="C:\\Users\\Naresh\\eclipse-workspace\\TestingBABA\\TestData\\Testdata.xlsx";
	public static String getreaddata(int row,int column)
	{
		String data=null;
		try 
		{
			FileInputStream fil= new FileInputStream(path);
			XSSFWorkbook Wbook= new XSSFWorkbook(fil);
			XSSFSheet sheet = Wbook.getSheetAt(0);
			data=sheet.getRow(row).getCell(column).getStringCellValue();
			Wbook.close();
		}
		catch (Exception e) 
		{
			System.out.println("issue on getreaddata mathods"+e);
			
		}
		return data;
	}
	

}
