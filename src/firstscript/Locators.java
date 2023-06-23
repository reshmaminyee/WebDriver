package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	ChromeDriver ob;
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	 ob=new ChromeDriver();
	ob.get("https://www.Facebook.com");
	}
	@Test
	public void title()
	{
ob.findElement(By.name("email")).sendKeys("abc@gmail.com");
ob.findElement(By.id("pass")).sendKeys("abc@123");
ob.findElement(By.name("login")).click();
	}
	
}
