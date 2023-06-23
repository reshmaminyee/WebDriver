package testngpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {
	ChromeDriver ob;
	@BeforeTest
	public void file()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.freepdfconvert.com/");
	}
	@Test
	public void pdf() throws Exception
	{
		ob.findElement(By.xpath("//*[@id=\"top\"]/body/main/div[1]/div/div/div[2]/section/label/div/div[1]/a")).click();
		fileUpload("\"C:\\Users\\reshm\\Documents\\SOFTWARE TESTING\\data.xlsx\"");
	}
	private void fileUpload(String file) throws Exception 
	{
		StringSelection str=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Robot robo=new Robot();
		robo.delay(1000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_ENTER);	
		
	}

}
