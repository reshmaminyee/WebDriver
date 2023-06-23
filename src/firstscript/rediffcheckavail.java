package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rediffcheckavail {
	ChromeDriver ob;
	@Before
	public void link()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void links()
	{
		WebElement button=ob.findElement(By.xpath("//input[@value='Check availability']"));
		String actualbuttontext=button.getAttribute("value");//use .gettext for text values 
		String exp="Check availability";
		if(exp.equalsIgnoreCase(actualbuttontext))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
		
	}
		
}
