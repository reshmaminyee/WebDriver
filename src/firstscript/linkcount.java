package firstscript;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkcount {
	
	ChromeDriver ob;
	@Before
	public void link()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.Facebook.com");
	}
@Test
public void open()
{
	List<WebElement> ab=ob.findElements(By.tagName("a"));
	System.out.println("Total no.of links="+ab.size());
//	List<WebElement>ab=ob.findElements(By.tagName("//*[@id=id='pageFooterChildren']/u1/li"));
//	System.out.println("Total no.of elements="+ab.size());


}
}
