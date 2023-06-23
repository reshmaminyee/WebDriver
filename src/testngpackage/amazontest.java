package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class amazontest {
	ChromeDriver ob;
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.amazon.in");
		ob.manage().window().maximize();
	}
	@Test
	public void get()
	{
		ob.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles",Keys.ENTER);
		String exptitle="Amazon.in:mobilephones";
		String acttitle=ob.getTitle();
		if(exptitle.equalsIgnoreCase(acttitle))
				{
			System.out.println("pass");
				}
		else
			System.out.println("fail");
		ob.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		ob.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
	}
	

}
