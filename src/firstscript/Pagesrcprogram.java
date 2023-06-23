package firstscript;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagesrcprogram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.google.com");
		String src=ob.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
