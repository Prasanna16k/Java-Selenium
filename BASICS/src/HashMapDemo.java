import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	//Map consist of key value pairs

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It can only take single duplicate key and ,multiple duplicate values
		Map<Integer,String> names = new HashMap<>();
		names.put(1, "Prassu");
		names.put(2, "Sindhu");
		names.put(3, "Sree");
		names.put(4, "Medha");
		System.out.println(names.keySet());
		System.out.println(names.values());
		names.remove(4);
		System.out.println(names.keySet());
		System.out.println(names.values());

	}

}
