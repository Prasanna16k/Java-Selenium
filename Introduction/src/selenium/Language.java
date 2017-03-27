package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using firefox Browser :
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
			FirefoxProfile profile = new FirefoxProfile();
			//setting the locale french : ‘fr’
			profile.setPreference("intl.accept_languages", "fr");
			//DesiredCapabilities.SetCapability(FirefoxDriver.ProfileCapabilityName, profile.ToBase64String());
			FirefoxDriver d1 = new FirefoxDriver(profile);
			d1.get("http://golfclubs.com");
			
				//Using Chrome Browser :

			/*System.setProperty("webdriver.chrome.driver","C:\\sel Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments(“-–lang= sl”);
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("http://golfclubs.com");*/
			
		
		
	}

}
