package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createpage {
	WebDriver ob;
	
	By Createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By Getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public createpage(WebDriver ob)
	{
		this.ob=ob;
	}
	public void createpageclick()
	{
		ob.findElement(Createpage).click();
	}
	public void getstarted()
	{
		ob.findElement(Getstarted).click();
	}
}
