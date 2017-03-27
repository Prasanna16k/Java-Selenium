package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExample {
	
	public static void main(String args[]){
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sindhu\\Desktop\\Selenium\\chromedriver.exe");
		//ChromeDriver f1 = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
		f1.get("https://bbc.com");
		//To access multiple elements
		List<WebElement> allPopularLinks = f1.findElements(By.xpath(ObjectRepository.all_links));
		for(int i=0;i<allPopularLinks.size();i++){
			String LinkText = allPopularLinks.get(i).getText();
			System.out.println("The text in the link is:"+LinkText);
		}
	}

}
