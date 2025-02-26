package Com_Rays_Collection;

import java.util.HashSet;
import java.util.Set;

public class Test_Hash_Collection {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(1);
		s.add("one");
		s.add(1);
		s.add(null);
		s.add(null);
		System.out.println(s);

	}

}
