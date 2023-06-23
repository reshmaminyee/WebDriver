package Homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	ChromeDriver ob;
	@BeforeTest
	public void get()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://demoqa.com/droppable");
		ob.manage().window().maximize();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
@Test
public void id()
{
	WebElement source=ob.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement target=ob.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
	Actions act=new Actions(ob);
	act.dragAndDrop(source, target).build().perform();
	String Exp="Dropped";
	String actual=target.getText();
	System.out.println(actual);
	if(Exp.equalsIgnoreCase(actual))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("Fail");
	}

}
}
