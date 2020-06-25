package practice;

import org.openqa.selenium.WebDriver;


public class TestLaunchBrowser {

	public static void main(String[] args) {
		WebDriver driver;
		driver=LaunchBrowser.launchBrowser("chrome");
	driver.manage().window().maximize();

	}

}
