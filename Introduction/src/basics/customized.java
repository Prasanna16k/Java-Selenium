package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class customized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//xpath= //tagname[@attributr='value']
System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://facebook.com");
driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
