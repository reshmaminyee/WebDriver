package firstscript;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotpgm {
	ChromeDriver ob;
	@Before
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("file:///C:/Users/reshm/Documents/SOFTWARE%20TESTING/SELENIUM/note.html");
	}
@Test
public void get() throws IOException 
{
	File src=((TakesScreenshot)ob).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("D:\\Screenshot.png"));
	
   WebElement button=ob.findElement(By.xpath(""));
   File src1=button.getScreenshotAs(OutputType.FILE);
   FileHandler.copy(src, new File("./Screenshot/error.png"));
}
}
