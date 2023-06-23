package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {
	ChromeDriver ob;
	@BeforeTest
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver ();
		ob.get("https://www.amazon.in/");
		}
	@Test
	public void scroll()
	{
		ob.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)ob;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		ob.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[1]/a")).click();
	}
	@AfterTest
	public void close()
	{
		ob.quit();
	}

}
