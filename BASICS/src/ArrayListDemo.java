import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
//3 imp collection frameworks: list, set, map
	//List:ArrayList,LinkedList,vector
	//Set:HashSet,LinkedHashSet,TreeSet
	//Map:HashTable,HashMap,LinkedHashMap,TreeMap
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1, 3);
		list.add(5);
		list.add(5);
		list.add(7);
		System.out.println("List Size:" +list.size());
		for(Integer x:list){
			System.out.println(x);
		}
		//list can contain duplicate elements
		list.remove(0);
		System.out.println("List Size:" +list.size());
		for(Integer x:list){
			System.out.println(x);
		}
	}
}