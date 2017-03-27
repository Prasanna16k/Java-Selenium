package selenium;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;


public class SecondTestCase {
	@BeforeClass
	public static void beginTest(){
		System.out.println("------Beginnig------");
	}
	@AfterClass
	public static void endTest(){
		System.out.println("------Ending------");
	}
	@Before
	public void openingBrowser(){
		System.out.println("Opening the browser");
		
	}
	@After
	public void closingBrowser(){
		System.out.println("closing the browser");
	}
	
	@Test
	//Open Face book web site
	//Identify the register link and click the link
	//Fill all your personal data
	//Identify the submit button,click
	public void registerFB(){
		System.out.println("Performing registration in FB");
	}
	//@Ignore
	@Test
	public void loginFB(){
		System.out.println("Performing logging into FB");
	}
	@Test
	public void logoutFB(){
		System.out.println("Performing log out form FB");
	}

}
