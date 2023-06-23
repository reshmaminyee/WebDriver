package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class grouping {
ChromeDriver ob;
@Test(groups= {"smoke"})
public void open()
{
	System.out.println("Test1");
}
@Test(groups= {"smoke"})
public void open1()
{
	System.out.println("Test2");
}
@Test(groups= {"smoke","Sanity"})
public void open3()
{
	System.out.println("Test3");
}
@Test(groups= {"smoke","Sanity"})
public void open4()
{
	System.out.println("Test4");
}
@Test(groups= {"smoke","Regression"})
public void open5()
{
	System.out.println("Test4");
}
@Test(groups= {"Sanity","Regression"})
public void open6()
{
	System.out.println("Test4");
}
}
