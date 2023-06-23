package firstscript;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkandlinktext {
	ChromeDriver ob;
	@Before
	public void link()
	{

		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.Facebook.com");
	}
	@Test
	public void linktext()
	{
		List<WebElement> ab=ob.findElements(By.tagName("a"));
		System.out.println("Total no.of links="+ab.size());
		for (WebElement s:ab)
		{
			String link=s.getAttribute("href");
			System.out.println(link+"-------"+s.getText());
		}
	}
	

}
