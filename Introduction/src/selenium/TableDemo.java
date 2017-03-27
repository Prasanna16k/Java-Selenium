package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDemo {
	
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sindhu\\Desktop\\Selenium\\chromedriver.exe");
		//ChromeDriver d1 = new ChromeDriver();
		d1.get("http://newtours.demoaut.com/");
		
		WebElement td1 = d1.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[3]/td[1]"));
		
		System.out.println("one of the text in the table is:"+td1.getText());
		
		WebElement td2 = d1.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[1]/td[2]"));
		
		System.out.println("One of the value in the table is:"+td2.getText());
		
		
	}

}
