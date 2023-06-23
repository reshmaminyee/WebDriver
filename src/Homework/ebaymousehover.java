package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebaymousehover {
	ChromeDriver ob;
	@BeforeTest
	public void get()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.ebay.com/");
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
@Test
public void id()
{
WebElement Electronics=ob.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
Actions act=new Actions(ob);
act.moveToElement(Electronics);
act.perform();
WebElement cameras=ob.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[4]/a"));
cameras.click();
ob.navigate().back();

	
	
	
}

	
	
	
	
	
}
