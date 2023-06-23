package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelpractice {
	public static String getcellvalue(String xl,String sheet,int r,int c)
	{
		try
		{
			FileInputStream files=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(files);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
			return cell.getStringCellValue();	
		}
			else
			{
				return cell.getRawValue();
			}
		}
		catch (Exception e)
		{
			return "";
	}
	}
		public int getrowcount(String xl,String sheet)
		{
			try
			{
				FileInputStream files=new FileInputStream(xl);
				XSSFWorkbook wb=new XSSFWorkbook(files);
				int r=wb.getSheet(sheet).getLastRowNum();
				System.out.println(r);
				return r;
			}
		
		catch(Exception e)
		{
			return 0;
				
			}
		}
}
	
