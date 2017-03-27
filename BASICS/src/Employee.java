import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	String fname;
	String lname;
	
	Employee(String fname,String lname){
		this.fname = fname;
		this.lname = lname;
	}
	static List<Employee> emplist = new ArrayList<>();
	
	public  List<Employee> getEmpList(){
			return emplist;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("sindhu","sura");
		Employee e2 = new Employee("prasu","Kanathala");

		emplist.add(e1);
		emplist.add(e2);
		
				List<Employee> list = e1.getEmpList();
		for(Employee e :list){
			System.out.println(e.fname+" "+e.lname);
		}
		
        
	}

}
