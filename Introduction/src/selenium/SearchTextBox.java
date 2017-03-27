package selenium;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SearchTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
		//finding the element by ID
		f1.get("https://bbc.com");
		//f1.findElementById("orb-search-q").sendKeys("selenium");
		//finding the element by name
		f1.findElementByName("q").sendKeys("selenium");
        //f1.findElement(By.id("orb-search-q")).sendKeys("selenium");
        //f1.findElement(By.name("q")).sendKeys("selenium");
	}

}
