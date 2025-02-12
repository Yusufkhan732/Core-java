package shapearrayyy;

public class Circle extends Shape{

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
		System.out.println("Readius Area" + area);
	}

}
