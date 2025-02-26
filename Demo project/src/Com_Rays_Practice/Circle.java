package Com_Rays_Practice;

public class Circle extends Shape {

	private int Radius;

	public static final float PI = 3.14f;

//	public Circle() {
//		System.out.println("default const");
//	}
//
//	public Circle(int Radius) {
//		System.out.println("1 param const");
//		this.Radius = Radius;
//
//	}

	public int getRadius() {
		return Radius;

	}

	public void setRadius(int Radius) {
		this.Radius = Radius;

	}

	public void Area() {
		double area = PI * Radius * Radius;

		System.out.println("Circle Area" + area);

	}

}
