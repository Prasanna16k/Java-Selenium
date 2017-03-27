import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set cannot take duplicate values
		Set<String> names = new HashSet<>();
		names.add("sindhu");
		names.add("pari");
		names.add("prasu");
		names.add("Teja");
		names.add("medha");
		names.add("sindhu");
		System.out.println(names.size());
		for(String s :names){
			System.out.println(s);
		}
		names.remove("pari");
		System.out.println(names.size());
		
		

	}

}
