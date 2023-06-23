package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowsertest {
	WebDriver ob;
	@Parameters("Browser")
	@BeforeTest
	public void setup(String Browser)
	{
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			ob=new FirefoxDriver();
		}
		else
		{
			WebDriverManager.edgedriver().setup();
			ob=new EdgeDriver();
		}
	}
	@Test
	public void search()
	{
		ob.get("https://www.Google.com");
	}

}
