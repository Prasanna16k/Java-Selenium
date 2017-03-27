public class Student1{

int age;
int id;
String name;

//creating constructor to initialize variables
//parameterized contructor

public Student1(int age,int id,String name){	
this.age=age;
this.id = id;
this.name= name;
}
public Student1()
{
	
}

  //creating a method
public int Sum(int x,int y){
	
	int  tot = x+y;
	return tot;
	
}

public static void main(String args[]){
	Student1 s1 = new Student1(24,123,"xyz");
	System.out.println(s1.age+" "+s1.id+" "+s1.name);
	System.out.println(s1.Sum(2,3));
}
}