package Com_Rays_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test_Map_Collection {

	public static void main(String[] args) {

		// Map<Integer, String> m = new HashMap();

		Map<String, Integer> m = new TreeMap<>();
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);
		m.put("five", 5);

		System.out.println(m);
		
		m.remove("two", 2);
//	m.clear();
//		System.out.println(m);
//	System.out.println(m.get(4));
//
//	System.out.println(m.containsKey(3));
//	System.out.println(m.containsValue("five"));

		for (Entry<String, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey());
//		}
//		for (int i = 0; i < m.size(); i++) {
//			System.out.println(m.get(i));

		}
	}

}
