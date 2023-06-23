package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	ChromeDriver ob;
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
	}
	@BeforeMethod
	public void get()
	{
		ob.get("https://demoqa.com/droppable");
	}
	@Test
	public void drop()
	{
		WebElement source=ob.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target=ob.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		Actions act=new Actions(ob);
		act.dragAndDrop(source, target).build().perform();
		ob.manage().window().maximize();
		//act.perform();
		String exp="Dropped";
		String actual=target.getText();
		System.out.println(actual);
		if(exp.equalsIgnoreCase(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	

}













