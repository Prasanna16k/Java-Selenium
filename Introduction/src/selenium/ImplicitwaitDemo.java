package selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImplicitwaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("http://www.calculator.net/gas-mileage-calculator.html");
		d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement cod =d1.findElement(By.id("usgasputin"));
		cod.sendKeys("700");
		

	}

}
