package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
WebDriver d1= new FirefoxDriver();
/*d1.get("http://qaclickacademy.com");
d1.findElement(By.xpath(".//*[@id='teacher-form']/button")).click();
*/
d1.get("http://facebook.com");
d1.findElement(By.id("email")).sendKeys("abcdefghijklmnoprstuvwxy");
d1.findElement(By.name("pass")).sendKeys("123456789");
d1.findElement(By.className("inputtext")).sendKeys("prasanna");
d1.findElement(By.linkText("Forgot account?")).click();
//d1.findElement(By.partialLinkText("Forgot")).click();
d1.findElement(By.xpath(".//*[@id='u_0_n']")).click();


	}

}
