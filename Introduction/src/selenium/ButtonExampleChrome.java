package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonExampleChrome {
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sindhu\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://golfclubs.com");
		c1.findElement(By.xpath(ObjectRepository.search)).sendKeys("selenium");
		c1.findElement(By.xpath(ObjectRepository.button)).click();
	}

}
