package Com.Rays.oop.cnstr;

public class Circle {

	private static final double PI = 3.14;
	private int radius;

	public Circle() {

		System.out.println("default constructor");
	}

	public Circle(int radius ) {

		System.out.println("1 param constactor");

		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void Area() {
		double Area = (PI * radius * radius);
		System.out.println(" area of circle " + Area);

	}

}
