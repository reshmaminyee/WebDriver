package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	
	public static String getcellvalue(String xl,String sheet,int r, int c)
{
		try
		{
			FileInputStream fb=new FileInputStream(xl);
			XSSFWorkbook wb1=new XSSFWorkbook(fb);
			XSSFCell cell=wb1.getSheet(sheet).getRow(r).getCell(c);
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
		public static int getrowcount(String xl,String sheet)
		{
			try
			{
				FileInputStream fb=new FileInputStream(xl);
				XSSFWorkbook wb1=new XSSFWorkbook(fb);
				int r=wb1.getSheet(sheet).getLastRowNum();
				System.out.println(r);
				return r;
				}
		catch (Exception e)
			{
			return 0;
			}
			}
		}


