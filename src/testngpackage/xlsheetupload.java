package testngpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xlsheetupload {
	ChromeDriver ob;
	@BeforeTest
	public void sheet()
	{
		WebDriverManager.chromedriver().setup();
	ob=new ChromeDriver();
	ob.get("https://www.facebook.com");
	}
	@Test
	public void sheetget() throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\reshm\\Documents\\SOFTWARE TESTING\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String Username=sh.getRow(i).getCell(0).getStringCellValue();
			String Password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username="+Username);
			System.out.println("Password="+Password);
			ob.findElement(By.name("email")).clear();
			ob.findElement(By.name("email")).sendKeys(Username);
			ob.findElement(By.name("password")).clear();
			ob.findElement(By.name("password")).sendKeys(Password);
			ob.findElement(By.name("login")).click();
		}	
	}

























}

