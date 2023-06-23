package test;

import org.testng.annotations.Test;

import page.fbloginpage;

public class fblogintest extends baseclass{
	@Test
	public void login()
	{
		fbloginpage page=new fbloginpage(ob);
		page.setvalues("reshmaminyee@gmail.com", "abc123");
		page.login();
		
	}

}
