package firstscript;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class responsecode200 {
	ChromeDriver ob;
	@Before
	public void code()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.Google.com");
	}
	@Test
	public void open()
	{
		List <WebElement>ab=ob.findElements(By.tagName("a"));
		System.out.println("Total no of link="+ab.size());
		for (WebElement s:ab)
		{
			String link=s.getAttribute("href");
			verify(link);
	}
	}
	private void verify(String link) {
		try {
URL u=new URL(link);
HttpURLConnection con=(HttpURLConnection)u.openConnection();
con.connect();
if(con.getResponseCode()==200)
{
	System.out.println("Successful response code=200---"+link);
}
else if (con.getResponseCode()==400)
{
	System.out.println("Invalid code=400---"+link);
}		
		}
		catch(Exception e)//code to handle exception
		{
			System.out.println(e.getMessage());
		}
	}
}
	
