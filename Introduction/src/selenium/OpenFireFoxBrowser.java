package selenium;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenFireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("http://golfclubs.com");
		d1.close();
	}

}
