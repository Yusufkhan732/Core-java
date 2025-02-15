package Com.Rays.DeepCloning;

public class Patient implements Cloneable {

	public String name;
	public Disease disease;

	public Patient(String name, Disease disease) {
		this.name = name;
		this.disease = disease;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Patient p = (Patient) super.clone();

		p.disease = (Disease) p.disease.clone();
		return p;
	}

}
