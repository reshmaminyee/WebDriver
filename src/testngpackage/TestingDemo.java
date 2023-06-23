package testngpackage;

import org.junit.jupiter.api.extension.InvocationInterceptor.Invocation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingDemo {
	ChromeDriver ob;
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		ob.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test(priority = 2)
	public void test1()
	{
	WebElement title=ob.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
String Exptitle="rediff.com";
String acttitle=ob.getTitle();
System.out.println(acttitle);
if(Exptitle.equalsIgnoreCase(acttitle))
{
	System.out.println("title is correct");
}
else
{
	System.out.println("title is wrong");
}
}
@Test(priority=1)
public void test2()
{
	WebElement button=ob.findElement(By.xpath("//input[@value=\"Check availability\"]"));
	if(button.isEnabled())
	{
		System.out.println("button is enabled");
	}
	else
	{
		System.out.println("button is not enabled");
	}
}
@Test(priority = 3)
	public void test3()
	{
		WebElement button=ob.findElement(By.xpath("//input[@value='Check availability']"));
		String actualbuttontext=button.getAttribute("value");
		String exp="Check availability";
		if(exp.equalsIgnoreCase(actualbuttontext))
		{
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
}
@AfterMethod
	public void mtd()
	{
	System.out.println("AfterMethod");
		
	}
}









