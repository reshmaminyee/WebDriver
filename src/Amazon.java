import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
ChromeDriver ob;
@Before
public void open()
{
	WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.amazon.in/");
		ob.manage().window().maximize();

	}
@Test
public void get()
{
	ob.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kurtis for women",Keys.ENTER);
	ob.findElement(By.xpath("//*[@id='nav-xshop']/a[8]")).click();
	ob.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
	ob.findElement(By.xpath("//*[@id='nav-tools']/a[2]/span[1]")).click();
	ob.findElement(By.name("email")).sendKeys("reshmaminyee@gmail.com",Keys.ENTER);
	ob.findElement(By.name("password")).sendKeys("ReshmA@07",Keys.ENTER);
	ob.navigate().back();
	ob.navigate().back();
	ob.navigate().back();
	ob.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
}



}
