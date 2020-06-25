package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Locater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=LaunchBrowser.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement link=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
		//act.sendKeys("t").perform();
		act.sendKeys("w").perform();
		

	}

}
