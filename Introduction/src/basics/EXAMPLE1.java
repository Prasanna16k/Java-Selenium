package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EXAMPLE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		driver.close();*/
		System.setProperty("webdriver.ie.driver", "C:\\sel Drivers\\IEDriverServer.exe");
		WebDriver d1=new InternetExplorerDriver();
		d1.get("http://google.com");
		d1.close();
		
	}

}
