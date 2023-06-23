package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitwait {
	ChromeDriver ob;
	@BeforeTest
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver ();
		ob.get("https://www.amazon.in/");
		}
	@Test
	public void scroll()
	{
		ob.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(ob,Duration.ofSeconds(20));
	// wait for 10 seconds
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[3]/a")));
		ob.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[3]/a")).click();
}
}
