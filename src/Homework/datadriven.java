package Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven {
	ChromeDriver ob;
	@BeforeTest
	public void get()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.facebook.com/");
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
@Test
public void id() throws Exception
{
	FileInputStream file=new FileInputStream("C:\\Users\\reshm\\Documents\\data.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sh=wb.getSheet("Sheet1");
	int rowcount=sh.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
		String Username=sh.getRow(i).getCell(0).getStringCellValue();
		String Password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(Username);
		System.out.println(Password);
		ob.findElement(By.name("email")).clear();
		ob.findElement(By.name("email")).sendKeys(Username);
		ob.findElement(By.name("pass")).clear();
		ob.findElement(By.name("pass")).sendKeys(Password);
		ob.findElement(By.name("login"));
	}
	
}
}
