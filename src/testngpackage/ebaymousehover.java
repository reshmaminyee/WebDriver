package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebaymousehover {
	ChromeDriver ob;
	@BeforeTest
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver ();
		ob.get("https://www.ebay.com/");
		}
	
	//navigation commands
	//ob.navig
	@Test
	public void mousehover()
	{
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mainmenu=ob.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions act=new Actions(ob);
		act.moveToElement(mainmenu);
		act.perform();
		
		ob.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[3]/a")).click();
	}
//		act.click();
//		act.perform();
	@AfterTest
	public void teardown()
	{
		ob.quit();
	}
		
}
	
	
	
	
	
	
