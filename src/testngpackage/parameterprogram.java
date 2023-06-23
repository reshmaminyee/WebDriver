package testngpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterprogram {
	ChromeDriver ob;
@BeforeTest
	public void main()
	{
	WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.Google.com");
	}
	@Parameters("q")
	@Test
	public void open(String q)
	{
		ob.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		
	}

}
