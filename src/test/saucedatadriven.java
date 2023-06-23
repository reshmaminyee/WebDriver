package test;

import org.testng.annotations.Test;

import Utilities.sauceexcel;
import page.saucelogin;

public class saucedatadriven extends baseclasssauce{
	@Test
	public void sauceloginverifysheet()
	{
		saucelogin pg=new saucelogin(ob);
		String xl="C:\\Users\\reshm\\Documents\\RESH\\GenPro\\data.xlsx";
		String sheet="Sheet1";
		int rowcount=sauceexcel.getrowcount(xl,sheet);
				System.out.println(rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			String Username=sauceexcel.getcellvalue(xl, sheet, i, 0);
			System.out.println("USername="+Username);
			String Password=sauceexcel.getcellvalue(xl, sheet, i, 1);
			System.out.println("Password="+Password);
		    pg.saucesetvalues(Username, Password);
		    pg.logins();
		}
		
	}

}
