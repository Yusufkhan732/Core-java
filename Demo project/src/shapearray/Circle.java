package shapearray;

public class Circle extends Shape {

	private int Radius;
	public static final float IP = 3.14f;

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}

	public void Area() {
		double area = IP * Radius * Radius;
		System.out.println("Radius Area" + area);

	}

}
