package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ButtonExample {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("http://golfclubs.com");
		d1.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		d1.findElement(By.xpath("//button[@type='submit']")).click();
	
		
	}

}
