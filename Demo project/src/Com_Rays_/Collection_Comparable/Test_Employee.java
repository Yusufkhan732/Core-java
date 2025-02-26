package Com_Rays_.Collection_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Employee {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(6, " anita ", 200));
		list.add(new Employee(2, " pushpa", 300));
		list.add(new Employee(5, " satyya ", 400));
		list.add(new Employee(7, " nikita ", 500));
		list.add(new Employee(3, " yusuf ", 100));
		list.add(new Employee(1, " sahad ", 700));
		list.add(new Employee(4, " adityya ", 800));

		Collections.sort(list);

		for (Object object : list) {
			System.out.println(object);

		}
	}
}
