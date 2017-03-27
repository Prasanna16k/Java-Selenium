package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WithoutSendKeys {

	public WebDriver driver;
	@Test
	public void SendKeys(){
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		//maximize the window
		driver.manage().window().maximize();
		//sendtext without sendkeys
		WebElement send = driver.findElement(By.id("Email"));
		((JavascriptExecutor)driver).executeAsyncScript("arguments[0].value='prasannareddy1609@gmail.com'", send);
		
	}
	

}
