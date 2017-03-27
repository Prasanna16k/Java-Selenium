package junit;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class AssertionDemo {
	//if the rule is not defined.The assertion case passes even though the values are not equal
	//with the help of @rule we can catch the errors.
	@Rule
	public ErrorCollector e = new ErrorCollector();
	
	@Test
	public void checkFriendsCount(){
		
		int expectedFriendsCount = 100;
		int actualFriendsCount = 101;//comes from the web site
		/*
		if(expectedFriendsCount == actualFriendsCount){
			System.out.println("Passed");
		}else{
			System.out.println("Failed");
		}
		*/
		System.out.println("Before assert method");
		try{
		Assert.assertEquals(expectedFriendsCount, actualFriendsCount);
		}catch(Throwable t){
			e.addError(t);
			System.out.println("error has occurred");
		}
		System.out.println("checkfriendscount method have been completed");
		
	}

}
