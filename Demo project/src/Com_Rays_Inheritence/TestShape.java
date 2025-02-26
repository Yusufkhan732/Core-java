package Com_Rays_Inheritence;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.setColor("red");
		s.setBorderwidth(100);
		System.out.println("color" + s.getColor());
		System.out.println(" borderwidth" + s.getBorderwidth());

		Circle c = new Circle();
		c.setRadius(27);
		c.setColor("orange");
		c.setBorderwidth(50);
		System.out.println("radius" + c.getRadius());
		System.out.println("color" + c.getColor());
		System.out.println("borderwidth" + c.getBorderwidth());
		c.area();

		Rectangle r = new Rectangle();
		r.setColor("black");
		r.setBorderwidth(20);
		r.setLength(4);
		r.setWidth(8);
		System.out.println("color" + r.getColor());
		System.out.println("borderwidth" + r.getBorderwidth());
		System.out.println("length" + r.getLength());
		System.out.println("width" + r.getWidth());
		r.Area();

		Triangle t = new Triangle();
		t.setColor("blue");
		t.setBorderwidth(30);
		t.setBase(4);
		t.setHight(8);
		System.out.println("color" + t.getColor());
		System.out.println("border" + t.getBorderwidth());
		System.out.println("base" + t.getBase());
		System.out.println("hight" + t.getHight());
		t.area();

	}

}
