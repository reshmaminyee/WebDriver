package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctcxpath {
	ChromeDriver ob;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	 ob=new ChromeDriver();
	ob.get("https://www.irctc.co.in/nget/train-search");
	}
	@Test
	public void title()
	{
	ob.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("abc@gmail.com");
	}
	

}
