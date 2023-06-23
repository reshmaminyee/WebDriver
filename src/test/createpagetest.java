package test;

import org.testng.annotations.Test;

import page.createpage;

public class createpagetest extends baseclass {
	@Test
	public void create()
	{
		createpage create=new createpage(ob);
		create.createpageclick();
		create.getstarted();
		
	}

}
