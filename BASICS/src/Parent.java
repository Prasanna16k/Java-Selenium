import Practice.Method;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I started learning Java");
		//Add 2 numbers
		int a=3;
		int b=4;
		int sum=a+b;
		System.out.println(sum);
		System.out.println("sum is " + sum);
		
		System.out.println("Navigating to home page");
		Method m= new Method();
		System.out.println(m.validateHeader());
		//MethodObject.methodName
		//ClassObject.methodname
		
	}

}
