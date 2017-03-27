package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
        WebDriver d2= new FirefoxDriver();
        d2.get("http://www.echoecho.com/htmlforms10.htm");
        //d2.findElement(By.xpath("//input[@value='Cheese']")).click();
        //System.out.println(d2.findElements(By.xpath("//input[@name='group1']")).size());
        int count= 	d2.findElements(By.xpath("//input[@name='group1']")).size();
        
        for(int i=0;i<count;i++)
        {
        	//d2.findElements(By.xpath("//input[@name='group1']")).get(i).click();
        	//System.out.println(d2.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
        	String text= d2.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
        	if(text.equals("Cheese"))
        	{
        		d2.findElements(By.xpath("//input[@name='group1']")).get(i).click();
        	}
        	
        }
	
	}

}
