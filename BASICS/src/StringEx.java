
public class StringEx {
  //strings are immutable and cannot be concatenated but a new object will be created
	//But we can explicitly assign it
	/*String s="Sachin";  
   s=s.concat(" Tendulkar");  
   */
		public static void main(String args[]){  
		String s1="java";//creating string by java string literal  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword  
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		}
		}  
