package test;

import org.testng.annotations.Test;

import Utilities.excelutils;
import page.fbloginpage;

public class fbdatadrivenframework extends baseclass {
	@Test
	public void fbloginverifysheet()
	{
		fbloginpage log=new fbloginpage(ob);
		String xl="C:\\Users\\reshm\\Documents\\SOFTWARE TESTING\\data.xlsx";
		String sheet="Sheet1";
		int rowcount=excelutils.getrowcount(xl, sheet);
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String Username=excelutils.getcellvalue(xl, sheet,i,0);
			System.out.println("Username="+Username);
			String Password=excelutils.getcellvalue(xl, sheet,i,1);
			System.out.println("Password="+Password);
			log.setvalues(Username, Password);
			log.login();
			
		}
	}
	

}
