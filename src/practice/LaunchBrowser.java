package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	
	
	public static WebDriver launchBrowser(String browserName)
	{       WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("ChromeBrowserLunch");
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("firefoxBrowserLunch");
		}
		
		return driver;
		
		
		
		
		
	}
}
