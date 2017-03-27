package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("http://www.calculator.net/interest-calculator.html");
		WebElement dropdown = d1.findElement(By.xpath("//select[@id='ccompound']"));
		Select dropdown1 = new Select(d1.findElement(By.xpath("//select[@id='ccompound']")));
		dropdown1.selectByIndex(3);
		
		
		System.out.println("the output for isDisplayed :"+dropdown.isDisplayed());
		System.out.println("the output for isEnabled :"+dropdown.isEnabled());
		System.out.println("the output for isSeelcted :"+dropdown.isSelected());
		

	}

}
