package firstscript;

import java.time.Year;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rediffdropdown {
	ChromeDriver ob;
	@Before
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		ob=new ChromeDriver();
		ob.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void get()
	{
		Boolean logo=ob.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is present");
		}
		else
			System.out.println("logo is not present");
		
		WebElement day=ob.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
        Select dayelement=new Select(day);
        dayelement.selectByVisibleText("07");
        List<WebElement>days=dayelement.getOptions();
        System.out.println(days.size());
        WebElement month=ob.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthelement=new Select(month);
		monthelement.selectByValue("07");
		List<WebElement>months=monthelement.getOptions();
	System.out.println(months.size());
	WebElement year=ob.findElement(By.xpath("//select[3]"));
		Select yearelement=new Select(year);
	yearelement.selectByValue("1995");
	List<WebElement>years=yearelement.getOptions();
System.out.println(years.size());	
//		Select year= new Select(ob.findElement(By.xpath("//select[3]")));
//		year.selectByValue("1995");
		
	}

}
