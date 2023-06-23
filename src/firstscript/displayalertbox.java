package firstscript;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class displayalertbox {
	ChromeDriver ob;
	@Before
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("file:///C:/Users/reshm/Documents/SOFTWARE%20TESTING/note.html");
	}
	@Test
	public void display()
	{
		ob.findElement(By.xpath("//input[@value='Display alert box']")).click();
		Alert a=ob.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
//		ob.findElement(By.xpath("//input[2][@name='firstname']")).sendKeys("Reshma");
//		ob.findElement(By.xpath("//input[3][@name='lastname']")).sendKeys("P");
//		ob.findElement(By.xpath("c")).click();
		ob.findElement(By.xpath("/html/body/input[2]")).sendKeys("Reshma");
		ob.findElement(By.xpath("/html/body/input[3]")).sendKeys("P");
		ob.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
