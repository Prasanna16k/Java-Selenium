package selenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ThirdTestCaseDemo {
	FirefoxDriver f1;
	
	@Before
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		f1 = new FirefoxDriver();
		f1.get("http://easycalculation.com/");
		System.out.println("opening the browser");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@After
	public void closeBrowser(){
		System.out.println("closing the browser");
		f1.close();
	}

	@Test
	public void clickNumbersLink(){
		System.out.println("clicking the numbers link");
		f1.findElement(By.xpath("//a[@href='//www.easycalculation.com/numbers.php']")).click();
				
	}
	@Test
	public void clickTaxLink(){
		System.out.println("clicking the tax link");
		f1.findElement(By.xpath("//a[@href='//www.easycalculation.com/tax/tax.php']")).click();
		
	}
}
