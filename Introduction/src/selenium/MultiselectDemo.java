package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MultiselectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		FirefoxDriver f1 = new FirefoxDriver();
		f1.get("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		f1.findElement(By.id("ContentHolder_lbSelectionMode_I")).click();
		Thread.sleep(2000);
		f1.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
		WebElement select = f1.findElement(By.id("ContentHolder_lbFeatures_LBT"));
		List<WebElement>options = select.findElements(By.tagName("td"));
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());
		}
		Actions builder = new Actions(f1);
		Action mulselect = builder.keyDown(Keys.CONTROL).click(options.get(3)).click(options.get(5)).click(options.get(7)).build();
		mulselect.perform();
		
	}

}
