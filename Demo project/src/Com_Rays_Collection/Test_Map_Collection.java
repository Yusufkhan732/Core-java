package Com_Rays_Collection;

import java.util.HashMap;
import java.util.Map;

public class Test_Map_Collection {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(4, "ggg");

		System.out.println(m);
//		m.clear();
//		System.out.println(m);
		System.out.println(m.get(4));

		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("five"));

		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			System.out.println(entry.getKey());
		}
		for (int i = 0; i < m.size(); i++) {
			System.out.println(m.get(i));

		}
	}
}
