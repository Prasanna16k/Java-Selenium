
public class StaticDemo {
         static {
        	System.out.println("My instructor is sindhu"); 
        	setTestString("This is static block's string");
        	setTestValue(2);
         }
         
         static{
        	 System.out.println("This is static block 2 ");
         }
         private static int TestValue;
         public int getTestValue(){
        	 return TestValue; 
         }
         
         public static void setTestValue(int testValue){
        	 if(testValue>0)
        		 StaticDemo.TestValue = testValue;
        	 System.out.println("setTestValue method:" + testValue);
         }
         public static String testString;
         
     	/**
     	 * @return the testString
     	 */
     	public static String getTestString() {
     		return testString;
     	}
      
     	/**
     	 * @param testString the testString to set
     	 */
     	public static void setTestString(String testString) {
     		StaticDemo.testString = testString;
     		System.out.println("setTestString method: " + testString);
     	}
      
     	// static util method
     	public static int subValue(int i, int  j) {
     		int sum = i+j;
     		
     		return sum;
     	}
     
public static void main (String args[]){
	
	int res = StaticDemo.subValue(6, 7);
	System.out.println(res);
	
}
}
