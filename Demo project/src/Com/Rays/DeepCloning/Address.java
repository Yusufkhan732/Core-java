package Com.Rays.DeepCloning;

public class Address implements Cloneable {

	String City;

	public Address(String City) {
		this.City = City;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone(); // Shallow clone for Address object
	}

}
