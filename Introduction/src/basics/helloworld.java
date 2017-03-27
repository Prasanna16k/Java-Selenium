package basics;


import org.openqa.selenium.chrome.ChromeDriver;




public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
		System.setProperty("webdriver.chrome.driver","C:\\sel Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
