package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitwaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("http://www.calculator.net/gas-mileage-calculator.html");
		//WebElement cod =d1.findElement(By.id("usgasputin"));
		WebDriverWait w = new WebDriverWait(d1,10);
		WebElement t1 = w.until(ExpectedConditions.presenceOfElementLocated(By.id("uscodreading")));
		t1.sendKeys("300");

	}

}
