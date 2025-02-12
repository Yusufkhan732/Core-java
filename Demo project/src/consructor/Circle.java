package consructor;

public class Circle {

	private int Radius;

	public static final float PI = 3.14f;

	public int getRadius() {
		return Radius;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}

	public void Area() {
		int area = Radius * Radius;
		System.out.println("Radius Area" + area);
	}

}
