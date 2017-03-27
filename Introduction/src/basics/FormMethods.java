package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
          WebDriver d2= new FirefoxDriver();
          d2.get("https://www.makemytrip.com/flights");
          System.out.println("Before clicking on multi city radio button");
          System.out.println(d2.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
          d2.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
          System.out.println("After clicking on multi city radio button");
          System.out.println(d2.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());
	}

}
