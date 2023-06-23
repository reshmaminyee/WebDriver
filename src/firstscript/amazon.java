package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon{

	ChromeDriver ob;
	@Before
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.amazon.in/");
	}
	@Test
	public void search()
	{
		ob.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("mobiles",Keys.ENTER);
		ob.findElement(By.xpath("//*[@id='nav-tools']/a[4]")).click();
		ob.findElement(By.xpath("//*[@class='nav-line-1-container']/span[1]")).click();
		ob.findElement(By.name("email")).sendKeys("abcdf");
		ob.findElement(By.xpath("//input[@id='continue']")).click();
		ob.navigate().back();
		ob.navigate().back();
		ob.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		ob.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i[1]")).click();
		
	}
		
		{
	}

	}
