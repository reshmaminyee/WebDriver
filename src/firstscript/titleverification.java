package firstscript;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class titleverification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.google.com");
		String expectedtitle="Google.com";
		String actualtitle=ob.getTitle(); 
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
