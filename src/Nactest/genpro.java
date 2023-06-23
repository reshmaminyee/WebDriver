package Nactest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class genpro {
	ChromeDriver ob;
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.saucedemo.com/");
	}
	@Test
	public void log() throws Exception
	{
	FileInputStream file=new FileInputStream("C:\\Users\\reshm\\Documents\\RESH\\GenPro\\data.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int rowcount=sh.getLastRowNum();
	for(int i=0;i<=rowcount;i++)
	{
		String Username=sh.getRow(i).getCell(0).getStringCellValue();
		String Password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(Username);
		System.out.println(Password);
		ob.findElement(By.name("user-name")).clear();
		ob.findElement(By.name("user-name")).sendKeys(Username);
		ob.findElement(By.name("password")).clear();
		ob.findElement(By.name("password")).sendKeys(Password);
		ob.findElement(By.name("login-button")).click();
	   ob.navigate().refresh();
	}
	
	}

}
