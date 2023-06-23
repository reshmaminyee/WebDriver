package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploaddemo {
	ChromeDriver ob;
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://demo.guru99.com/test/upload/");
		ob.manage().window().maximize();
	}
	@Test
	public void demo()
	{
		ob.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\reshm\\Documents\\SOFTWARE TESTING\\data.xlsx");
		ob.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		ob.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

}
