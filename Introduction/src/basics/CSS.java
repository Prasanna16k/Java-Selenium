package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CSS== tagname[attribute='value']
    System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
	WebDriver driver=  new FirefoxDriver();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.cssSelector("[name='username']")).sendKeys("prasanna");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sairam");
	//driver.findElement(By.xpath("//input[@id='Login']")).click();
	driver.findElement(By.cssSelector("#Login")).click();
	}

}
