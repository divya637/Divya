package practice;

import org.openqa.selenium.WebDriver;

public class UrlNavigation {

	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.launchBrowser("chrome");
                    driver.manage().window().maximize();
                    driver.navigate().to("https://www.flipkart.com/");
                   // driver.navigate().to("https://www.myntra.com/");
                   // driver.navigate().back();
                   // driver.navigate().forward();
                  //  driver.navigate().refresh();
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getCurrentUrl());
	}

}
