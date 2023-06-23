package firstscript;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearch {
	ChromeDriver ob;
	@Before
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		
		ob=new ChromeDriver();
		ob.get("https://www.Google.com");
	}
	@Test
	public void search()
	{
		ob.findElement(By.name("q")).sendKeys("irctc login",Keys.ENTER);
}

}
