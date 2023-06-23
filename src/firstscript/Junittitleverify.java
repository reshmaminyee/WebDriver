package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junittitleverify {
ChromeDriver ob;
@Before
public void setup()
{
WebDriverManager.chromedriver().setup();
   ob=new ChromeDriver();
	ob.get("https://www.Google.com");
}
@Test
public void open()
{
	String exp="Google";
	String act=ob.getTitle();
	if(exp.equalsIgnoreCase(act))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}


}
}