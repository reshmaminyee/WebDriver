package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class copypaste {
	ChromeDriver ob;
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
	ob=new ChromeDriver();
	ob.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void copy()
	{
		WebElement firstname=ob.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement lastname=ob.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		firstname.sendKeys("Reshma");
		Actions act=new Actions(ob);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp( Keys.CONTROL);
		act.keyDown(firstname, Keys.CONTROL).sendKeys("c").keyUp( Keys.CONTROL);
		act.keyDown(lastname, Keys.CONTROL).sendKeys("v").keyUp( Keys.CONTROL);
		act.perform();
	}

}
