
public class MethodOverloading {
	
	 public int multiply(int a, int b){
		 return a*b;
	 }
	 
	 public long multiply(long a, long b){
		 return a*b;
	 }
	 
	 public void multiply(int a ,String b){
		 System.out.println(a + b);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading methodOverloading = new MethodOverloading();
		System.out.println(methodOverloading.multiply(5, 6));
		methodOverloading.multiply(4,"prasu");
		System.out.println(methodOverloading.multiply(1L, 2L));
		
	}

}
