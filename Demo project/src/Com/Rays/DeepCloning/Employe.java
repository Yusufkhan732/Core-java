package Com.Rays.DeepCloning;

public class Employe implements Cloneable {

	public String EmpoyeName;
	public int id;

	public Employe(String EmpoyeName, int id) {
		this.EmpoyeName = EmpoyeName;
		this.id = id;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
