import Practice.Method;
public class MethodTypes {
/*
 * method with void return type and no parameters
 */
	public void printName(){
		System.out.println("My name is Prasanna");
	}
	/*method with void  return type and parameters
	 * 
	 */
	public void sum(int a, int b){
		System.out.println(a+b);
	}
	
	/*
	 method with return type and parameters
	 */
	public int sumAll(int x, int y, int z){
		int total= x+y+z;
		return total;
	}
	
	public String printGender(){
	String G= "Female";
	return G;
	}
	
	final static  int x = 10;
	
	public static void main(String args[]){
		MethodTypes types = new MethodTypes();
		Method method = new Method();
		types.printName();
		types.sum(6, 5);
		System.out.println(types.sumAll(2, 3, 4));
		System.out.println(types.printGender());
		String result = types.printGender();
		System.out.println(result);
		System.out.println(method.validateHeader());
		System.out.println(x);
	}
	
	
}
