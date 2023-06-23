package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redifflogo {
	ChromeDriver ob;
	@Before
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void check()
	{
		Boolean logo=ob.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is present");
		}
		else
			System.out.println("logo is not present");
		
		
	}


}

