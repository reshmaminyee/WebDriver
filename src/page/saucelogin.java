package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.baseclasssauce;

public class saucelogin {
	WebDriver ob;
	By Username=By.name("user-name");
	By Password=By.name("password");
	By login=By.name("login-button");

	public saucelogin (WebDriver ob)
	{
	this.ob=ob;
	}
	
	
	public void saucesetvalues(String username,String password)
	{
		ob.findElement(Username).sendKeys(username);
		ob.findElement(Password).sendKeys(password);
	}
	public void logins()
	{
		ob.findElement(login).click();
	
		
	}
}


