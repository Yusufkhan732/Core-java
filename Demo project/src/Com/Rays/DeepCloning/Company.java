package Com.Rays.DeepCloning;

public class Company implements Cloneable {

	public String companyName;
	public int salary;
	public Employe employe;

	public Company(String companyName, int salary, Employe employe) {
		this.companyName = companyName;
		this.salary = salary;
		this.employe = employe;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Company c = (Company) super.clone();
		c.employe = (Employe) c.employe.clone();

		return c;
	}

}
