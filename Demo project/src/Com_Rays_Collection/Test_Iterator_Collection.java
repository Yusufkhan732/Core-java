package Com_Rays_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_Iterator_Collection {
	public static void main(String[] args) {
		List l = new ArrayList();

		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		l.add('e');
		l.add('f');
		l.add('g');
		l.add('h');

		Iterator i = l.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(l);

	}
}
