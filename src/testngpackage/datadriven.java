package testngpackage;

import java.io.FileInputStream;
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
	public void data()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.facebook.com/login/");
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void login() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\reshm\\Documents\\SOFTWARE TESTING\\data.xlsx");//copy from properties and add\\filename.xlsx
		XSSFWorkbook wb=new XSSFWorkbook(f);//workbook
		XSSFSheet sh=wb.getSheet("Sheet1");//sheet1details
		int rowcount=sh.getLastRowNum();//rowcount
		for(int i=1;i<=rowcount;i++)
		{
			String Username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username="+Username);
			System.out.println("Password="+password);
			ob.findElement(By.name("email")).clear();
			ob.findElement(By.name("email")).sendKeys(Username);
			ob.findElement(By.name("pass")).clear();
			ob.findElement(By.name("pass")).sendKeys(password);
			ob.findElement(By.name("login")).click();
			ob.navigate().refresh();
			
		}
	}

}
