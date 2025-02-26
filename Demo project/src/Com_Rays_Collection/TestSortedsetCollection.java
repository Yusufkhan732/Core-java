package Com_Rays_Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedsetCollection {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add("c");
		s.add("b");
		s.add("a");

		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
	}
}
