package oop.rays.com;

public class PersonCal {

	public static void main(String[] args) {

		Person p = new Person();

		p.setName("yusuf");
		System.out.println(p.getName());

		p.setdob("09/11/2002");

		System.out.println(p.getdob());

		p.setAddress("Indore");
		System.out.println(p.getAddress());

		System.out.println(p.AVG_AGE);

	}

}
