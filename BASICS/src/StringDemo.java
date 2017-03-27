
public class StringDemo {
/*
 * String buffer is synchronized and thread safe
 * String builder is not  synchronized and  not thread safe
 * String value cannot be modified whereas others give a chance to modify
 */
	public static void main(String[] args) {
		String value =  "Lavanya"; // gets already created value
		// there is no append method. 
	     value = value+" Saibersys"; //creates a new reference in the heap as it is immutable
	     System.out.println("using String: "+value);
	     StringBuffer value1 = new StringBuffer("appended ");
	     value1.append("using append method"); // mutable
	     System.out.println("using string Buffer: "+value1);
	     
	     
	     // using StringBuilder
	     StringBuilder value2 = new StringBuilder("appended ");
	     value2.append("using append method ");
	     System.out.println("using StringBuilder: "+value2);
	}


}
