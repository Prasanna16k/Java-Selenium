
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int a,b;
             // it contains the code which has the possibility of error
             try{
            	 System.out.println("This is try block");
            	 a=100;
            	 b=0;
            	 int result=a/b;
            	 
             }
             //compile(checked) and runtime(unchecked) errors
             catch(ArithmeticException e){
            	 System.out.println("This is catch block");
            	 e.printStackTrace();
             }
             //it enables to close the input streams
             finally{
            	 System.out.println("This is a final block");
             }
             
	}

}
