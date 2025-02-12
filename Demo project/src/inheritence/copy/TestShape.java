package inheritence.copy;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.setColor("red");
		s.setBorderwidth(20);
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());

		Circle c = new Circle();
		c.setRadius(10);
		System.out.println(c.getRadius());
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		c.area();

		Rectangle r = new Rectangle();

		r.setLength(20);
		r.setWidth(10);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		r.Area();
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHight(20);
		System.out.println(t.getBase());
		System.out.println(t.getHight());
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		t.area();

	}
}