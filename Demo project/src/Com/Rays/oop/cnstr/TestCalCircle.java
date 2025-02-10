package Com.Rays.oop.cnstr;

public class TestCalCircle {

	public static void main(String[] args) {

		Circle cl = new Circle();

		Circle c1 = new Circle(5);
		System.out.println("radius:" + c1.getRadius());

		Circle c = new Circle();

		c.setRadius(5);

		System.out.println(c.getRadius());

		c.Area();

	}
}