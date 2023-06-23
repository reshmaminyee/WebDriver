package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99demosite {
	//https://demo.guru99.com/test/simple_context_menu.html
	ChromeDriver ob;
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
	}
@BeforeMethod
public void get()
{
	ob.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void rightclick()
{
	WebElement Doubleclick=ob.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions rightclick=new Actions(ob);
	rightclick.doubleClick(Doubleclick);
	rightclick.perform();	
ob.switchTo().alert();

WebElement right=ob.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	rightclick.contextClick(right);
	
	


}










}
