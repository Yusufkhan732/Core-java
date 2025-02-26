package Com_Rays_Consructor;

public class Circle {

	private int Radius;

	public static final float PI = 3.14f;

	public Circle() {
		System.out.println("default const");
	}

	public Circle(int Radius) {
		System.out.println("1 param const");
		this.Radius = Radius;
	}

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
