package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ThreadsleepDemo {

	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		///d1.get("http://www.calculator.net/gas-mileage-calculator.html");
		d1.get("http://www.calculator.net");
		System.out.println("waiting for ten seconds");
		
		try {
			Thread.sleep(10000);
			System.out.println("waited for ten seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement cod =d1.findElement(By.id("uscodreading"));
		cod.sendKeys("1500");
		
	}
}
