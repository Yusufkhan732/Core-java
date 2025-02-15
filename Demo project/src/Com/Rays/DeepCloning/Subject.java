package Com.Rays.DeepCloning;

public class Subject implements Cloneable {

	public String marks;

	public Subject(String marks) {
		this.marks = marks;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
