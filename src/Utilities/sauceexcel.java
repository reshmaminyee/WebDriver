package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sauceexcel {
	public static String getcellvalue(String xl,String sheet,int r,int c)
	{
		try
	{
		FileInputStream sauce=new FileInputStream(xl);
		XSSFWorkbook wb=new XSSFWorkbook(sauce);
		XSSFCell celll=wb.getSheet(sheet).getRow(r).getCell(c);
		if(celll.getCellType()==CellType.STRING)
		{
			return celll.getStringCellValue();
		}
		else
		{
			return celll.getRawValue();
		}
	
	}
		catch(Exception e)
		{
			return "";
		}
	}
		public static int getrowcount(String xl,String sheet)
		{
			try
			{
				FileInputStream sauce=new FileInputStream(xl);
				XSSFWorkbook wb=new XSSFWorkbook(sauce);
				int r=wb.getSheet(sheet).getLastRowNum();
				System.out.println(r);
				return r;
			}
			catch (Exception e)
			{
				return 0;
			}
		}
	
		
	
	

}

