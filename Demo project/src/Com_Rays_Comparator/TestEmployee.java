package Com_Rays_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(5, "yusuf", 200));
		list.add(new Employee(2, "nikita", 300));
		list.add(new Employee(6, "ilyas", 500));
		list.add(new Employee(4, "puspa", 500));
		list.add(new Employee(3, "anita", 500));
		list.add(new Employee(1, "anas", 500));

		// Collections.sort(list,new OrderByIdDesc());
		// Collections.sort(list,new OrderByIdAsc());
		// Collections.sort(list,new OrderByNameDesc());
		Collections.sort(list, new OrderByNameAsc());

		for (Object object : list) {
			System.out.println(object);

		}

	}
}
