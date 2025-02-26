package Com_Rays_Inheritence;

public class TestShapeTypeCasting {
	public static void main(String[] args) {

		Shape s = new Shape();

		Rectangle r = new Rectangle();

		Circle c = new Circle();

		Triangle t = new Triangle();

		Shape shape = new Rectangle();

		shape.setColor("red");
		shape.setBorderwidth(6);
		System.out.println(shape.getColor());
		System.out.println(shape.getBorderwidth());

		Rectangle rectangle = (Rectangle) shape;

		rectangle.setColor("abc");
		rectangle.setBorderwidth(10);
		rectangle.setLength(8);
		rectangle.setWidth(4);
		System.out.println(rectangle.getColor());
		System.out.println(rectangle.getBorderwidth());
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getWidth());

		Shape shape1 = new Circle();

		Circle c1 = (Circle) shape1;
		c1.setRadius(20);
		System.out.println(c1.getRadius());
		c1.setBorderwidth(18);
		c1.setColor("blue");
		System.out.println(c1.getBorderwidth());
		System.out.println(c1.getColor());

		Shape shape2 = new Triangle();

		Triangle tt = (Triangle) shape2;

		tt.setBase(20);
		tt.setHight(30);
		System.out.println(tt.getBase());
		System.out.println(tt.getHight());

	}
}
