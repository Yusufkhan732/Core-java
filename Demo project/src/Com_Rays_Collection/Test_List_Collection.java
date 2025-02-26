package Com_Rays_Collection;


import java.util.ArrayList;
import java.util.List;
public class Test_List_Collection {

	public static void main(String[] args) {

		List l =new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");

		System.out.println(l);

		l.add(2, "one");
		
		System.out.println(l.get(2));

		System.out.println(l);
		l.remove(2);
		System.out.println(l);

		System.out.println(l.subList(0, 3));
		System.out.println( l.indexOf("d"));
	}

}
