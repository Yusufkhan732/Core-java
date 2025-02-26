package Com_Rays_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test_Collection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add('a');

		Collection c1 = new ArrayList();
		c1.add('a');
		c1.add('b');
		c1.add('c');
		c1.add('d');

		System.out.println("c" + c);
		System.out.println("c1" + c1);

		c.add('b');
		System.out.println("c" + c);

		c.addAll(c1);
		System.out.println("c" + c);
		c1.clear();
		System.out.println("c1" + c1);
		System.out.println(c1.contains('a'));
		System.out.println(c.containsAll(c1));
		System.out.println(c.isEmpty());

		c.remove(2);
		System.out.println("c" + c);
		c.removeAll(c1);
		System.out.println("c" + c);
		System.out.println("c.size =" + c.size());
		System.out.println("c1.size" + c1.size());

	}

}
