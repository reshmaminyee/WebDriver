package Nactest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wappalyzer {
	ChromeDriver ob;
	@Before
	public void web()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.wappalyzer.com");
	}
	@Test
	public void open()
	{
		ob.manage().window().maximize();
		ob.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		ob.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
		ob.findElement(By.xpath("//*[@id='__layout']/div[2]/main[1]/div[8]/h2/div[2]/a[1]/div[4]/span[1]")).click();
		
		//ob.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
		ob.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a/span")).click();
		
		
	}
}
