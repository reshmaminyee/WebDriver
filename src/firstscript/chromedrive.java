package firstscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromedrive {

	public static void main(String[] args) {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		ChromeDriver ob=new ChromeDriver();
//		//EdgeDriver ob=new EdgeDriver();
//		//ob.get("https://www.google.com");
		WebDriverManager.firefoxdriver().setup();
FirefoxDriver obj=new FirefoxDriver();
	obj.get("https://www.google.com");
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		
		
		
	}

}
