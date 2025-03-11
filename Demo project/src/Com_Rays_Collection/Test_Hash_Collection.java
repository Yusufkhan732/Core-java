package Com_Rays_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test_Hash_Collection {

	public static void main(String[] args) {

		//Set set = new HashSet();

		// Set<Integer> set = new LinkedHashSet<Integer>();
     //jis order mein element diye hai usi order me milenge
		
		Set<Integer> set = new TreeSet<Integer>();
		//sorted form mein chota number pehle
		
		set.add(32);
		set.add(2);
		set.add(52);
		set.add(65);

		System.out.println(set);
	}

}
