package Com.Rays.DeepCloning;

public class Person implements Cloneable {

	String name;
	Address address;

	public Person(String name, Address address) {
		this.address = address;
		this.name = name;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Shallow clone for Person object
		Person p = (Person) super.clone();
		// Deep clone for Address object if address is not null
		//if (this.address != null) {
			p.address = (Address) this.address.clone();
		
		return p;
	}
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// Initialize the Address object properly
		Address a = new Address("kalapipal");
		Person p = new Person("Yusuf khan", a);

		// Clone the Person object
		Person p1 = (Person) p.clone(); // Correct clone call for Person

		// Modify the cloned object
		p1.address.City = "Bhopal"; // Changing address city in cloned object
		p1.name = "Ilyas khan"; // Changing name in cloned object

		// Print details
		System.out.println(p1.name); // Ilyas khan (cloned object name)
		System.out.println(p1.address.City); // Bhopal (cloned object address)
		System.out.println(a.City); // kalapipal (original object address, unchanged)
		System.out.println(p.name); // Yusuf khan (original object name)
	}
}
