package Com_Rays_WithoutConstuctor;

public class TestShape1 {
	public static void main(String[] args) {

		Shape Shape = new Rectangle();

		Rectangle r = (Rectangle) Shape;
		r.setColor("blue");
		r.setBorderWidth(10);
		r.setLength(10);
		r.setWidth(20);
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		r.area();

		Shape Shape1 = new Circle();
		Circle c = (Circle) Shape1;
		c.setRadius(50);
		Shape1.area();

		Shape Shape2 = new Triangle();
		Triangle t = (Triangle) Shape2;
		t.setBase(25);
		t.setHeight(50);
		Shape2.area();
	}

}
