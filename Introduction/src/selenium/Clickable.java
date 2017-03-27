package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Clickable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver c1 = new FirefoxDriver();
		c1.get("https://login.yahoo.com");
		WebElement i1 = c1.findElement(By.xpath("//label[@for='persistent']"));
		i1.click();
	    c1.close();
		

	}

}
