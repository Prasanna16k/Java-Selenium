package junit;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {
	
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
	public void registerGmail(){
		System.out.println("Performing registration in Gmail");
	}
	@Ignore
	@Test
	public void loginGmail(){
		System.out.println("Performing logging into Gmail");
	}
	@Test
	public void logoutGmail(){
		System.out.println("Performing log out form Gmail");
	}

}
