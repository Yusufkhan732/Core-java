package shaparray;

public class Circle extends Shape {

	private int Radius;
	public static final float PI = 3.14f;

	public Circle() {

	}

	public Circle(int Radius) {
		this.Radius = Radius;

	}

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}

	public void Area() {
		double area = PI * Radius * Radius;
		System.out.println("Circle Area" + area);
	}

}
