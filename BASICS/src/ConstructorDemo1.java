public class ConstructorDemo1 {  
		int id;  
		String name;  
		  
		void display(){
			System.out.println(id+" "+name);
			}  
		  
		public static void main(String args[]){  
			ConstructorDemo1 s1=new ConstructorDemo1();  
			ConstructorDemo1 s2=new ConstructorDemo1();  
		s1.display();  
		s2.display();  
		}  
		}  


