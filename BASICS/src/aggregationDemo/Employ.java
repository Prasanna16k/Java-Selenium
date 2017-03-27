package aggregationDemo;

public class Employ {  
int id;  
String name;  
Address address;  
  
public Employ(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Employ e=new Employ(111,"varun",address1);  
Employ e2=new Employ(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  
