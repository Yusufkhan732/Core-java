package shapearrayconstr;

public class Circle extends Shape {

	private int Radius ;

	public static final float PI = 3.14f;

	public Circle() {

	}

	public Circle(int Radius) {

		this.Radius = Radius;
	}

	public void setRadius(int Radius) {
		this.Radius = Radius;
	}

	public int getradius() {
		return Radius;
	}
        public void Area() {
		double area = PI * Radius * Radius;
		System.out.println("Circle Area" + area);
	}

}
