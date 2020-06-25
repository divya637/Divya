package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import practice.LaunchBrowser;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=LaunchBrowser.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Geetesh");
		driver.findElement(By.xpath("//input[@onclick='cancelCustomerCreation();']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
