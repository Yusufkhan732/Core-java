package Collection_Equals_Hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestEmployeCal {

	public static void main(String[] args) {

		Employe e1 = new Employe(1, "anas", 200);
		Employe e2 = new Employe(1, "anas", 200);

		System.out.println("Employe " + e1);
		System.out.println("Employe " + e2);
		System.out.println(e1.equals(e2));

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

		Set<Employe> set = new HashSet<Employe>();

		set.add(e1);
		set.add(e2);

		System.out.println("set" + set);

		List<Employe> list = new ArrayList<Employe>();
		list.add(e1);
		list.add(e2);
		System.out.println("list " + list);
		System.out.println("list  " + list.remove(new Employe(1, "anas", 200)));
	}
}
