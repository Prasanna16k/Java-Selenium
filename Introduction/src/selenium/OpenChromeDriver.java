package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sindhu\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://google.com");
		c1.close();
		c1.quit();

	}

}
