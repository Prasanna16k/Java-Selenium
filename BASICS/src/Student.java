
public class Student {

	public String lastName = "";
	public String firstName = "";
	public String DOB = "";

	public  String stuStat(Student s) {
		return "Last Name: " + s.lastName + " First Name: " + s.firstName + " DOB:" + s.DOB;
	}

	/* to call a method using an object 
	 * student s1 = new student();
	 *s1.stuStat(student1); /*
	 */

	public Student(String lastName, String firstName, String DOB) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.DOB = DOB;
	}

	public static void main(String args[]) {

		Student student1 = new Student("Prasanna", "Kanathala", "Sepetember16");
		System.out.println(student1.stuStat(student1));
		Student student2 = new Student("Radhika", "Kande", "March20");
		System.out.println(student2.stuStat(student2));
		Student student3 = new Student("Yamini", "Dandu","June10");
		System.out.println(student3.stuStat(student3));
		Student student4 = new Student("Divya", "Uddaraju", "February2");
		System.out.println(student4.stuStat(student4));
	}
}
