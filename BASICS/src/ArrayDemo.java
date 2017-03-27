import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] array = new int[5];
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter the values of the array");
          for(int i=0;i<array.length;i++){
        	  array[i] = scanner.nextInt();
          }
          System.out.println("Array elements are:");
          for(int i=0;i<array.length;i++){
        	  System.out.println(array[i]);
          }
          
          
          
	}

}
