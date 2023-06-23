package testngpackage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreports {
	WebDriver ob;
	String baseurl=("https://www.facebook.com/login/");
	ExtentHtmlReporter reporter;//reporter=reference name
	ExtentTest Test;//test=reference name
	ExtentReports Extent;//Extent reports are used to get environment details
	@BeforeTest
	public void open()
	{
		WebDriverManager.chromedriver().setup();
		reporter=new ExtentHtmlReporter("./Reports/myreport.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		Extent=new ExtentReports();
		Extent.attachReporter(reporter);
		Extent.setSystemInfo("hostname","Localhost");
		Extent.setSystemInfo("os","Windows");
		Extent.setSystemInfo("testername", "Reshma");
		Extent.setSystemInfo("Browsername", "Chrome");
		ob=new ChromeDriver();
	}
	@BeforeMethod
	public void setup()
	{
		ob.get(baseurl);
	}
	@org.testng.annotations.Test
	public void fbtitleverification()
	{
		Test=Extent.createTest("Fbtitleverification");
		String exp="Facebook";
		String act=ob.getTitle();
		Assert.assertEquals(exp, act);
	}
	@AfterTest
	public void teardown()
	{
		Extent.flush();
	}
	@AfterMethod
	public void browserclosetest(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Test.log(Status.FAIL,"test case failed is"+result.getName());
			Test.log(Status.FAIL,"test case failed is"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Test.log(Status.SKIP,"test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			Test.log(Status.PASS,"test case passed is"+result.getName());
		}
	}
		
		
		
	}

