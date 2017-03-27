package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Lavanya.xyz.com");
	driver.findElement(By.id("pass")).sendKeys("Password");
	driver.findElement(By.id("u_0_n")).click();
	
}
}