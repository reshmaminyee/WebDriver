package Nactest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yatralinkcount {
	ChromeDriver ob;
	@Before
	public void travel()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.yatra.com/");
	}
	@Test
	public void linkcount()
	{
		List<WebElement>ab=ob.findElements(By.tagName("a"));
		System.out.println("Total no.of links present in yatra="+ab.size());
	}

}
