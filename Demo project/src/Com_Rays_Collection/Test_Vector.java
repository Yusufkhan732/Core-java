package Com_Rays_Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Test_Vector {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(100);
		v.add("one");
		v.add("20");
		v.add(2);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}
		System.out.println(v);
	}
}
