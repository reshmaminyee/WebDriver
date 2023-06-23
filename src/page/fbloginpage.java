package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginpage {
	WebDriver ob;
	
	By fbemail=By.name("email");
	By fbpass=By.id("pass");
	By login=By.name("login");
	
	public fbloginpage (WebDriver ob)//constructor represents to run this page
	{
		this.ob=ob;
	}
	public void setvalues(String email,String pass)
	{
		ob.findElement(fbemail).sendKeys(email);
		ob.findElement(fbpass).sendKeys(pass);
	}
	public void login()
	{
		ob.findElement(login).click();
	}
}
