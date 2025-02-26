package Com_Rays_Comparator;

import java.util.Comparator;

public class OrderByNameDesc implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
	
		return e1.name.compareTo(e1.name);
	}

}
