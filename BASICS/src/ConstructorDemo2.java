public class ConstructorDemo2{  
    int id;  
    String name;  
      
    ConstructorDemo2(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
    	ConstructorDemo2 s1 = new ConstructorDemo2(111,"Karan");  
    	ConstructorDemo2 s2 = new ConstructorDemo2(222,"Aryan");  
    s1.display();  
    s2.display();  
   }  
}  

