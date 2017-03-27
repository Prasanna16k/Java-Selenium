package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\sel Drivers\\chromedriver.exe");
		WebDriver d1= new ChromeDriver();
		d1.get("http://spicejet.com");
		
		/*d1.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
          d1.findElement(By.xpath("//a[@value='GOI']")).click();*/
		
 //If you want to access in any class, create object for that class and access methods using object.method()
 Select dropdown = new Select(d1.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
 dropdown.selectByIndex(4);
 dropdown.selectByVisibleText("9 Adults");
 dropdown.selectByValue("8");
 
 System.out.println(d1.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
 d1.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
 System.out.println(d1.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
 d1.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
 System.out.println(d1.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	}

}
