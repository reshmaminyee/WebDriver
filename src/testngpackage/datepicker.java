package testngpackage;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {
	ChromeDriver ob;
	@BeforeTest
	public void expedia()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://www.expedia.com/");
		ob.manage().window().maximize();
	}
	@Test
	public void Month()
	{
		ob.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();//flight
		ob.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();//date click
		
	ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	while(true)
	{
		WebElement Month=ob.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
		String Month1=Month.getText();
		System.out.println(Month1);
		if(Month1.equals("July 2023"))
		{
			System.out.println(Month1);
			break; 
		}
		else
		{
		ob.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
		}
	}
	List<WebElement>alldates=ob.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
			for(WebElement date:alldates)
			{
				String dates=date.getAttribute("data-day");
				System.out.println(dates);
				if(dates.equals("7"))
				{
					date.click();					
					System.out.println("Selected Date");
				}
				}	
	}
}

