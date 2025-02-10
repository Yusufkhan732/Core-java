package WithoutConstuctor;

import Com.Rays.oop.cnstr.ShapeCal;

public class TestShape1 {
	public static void main(String[] args) {

		Shape ShapeRectangle = new Rectangle();

		Rectangle r = (Rectangle) ShapeRectangle;
		r.setLength(10);
		r.setWidth(20);
		ShapeRectangle.area();

		Shape ShapeCircle = new Circle();
		Circle c = (Circle) ShapeCircle;
		c.setRadius(50);

		ShapeCircle.area();

		Shape ShapeTriangle = new Triangle();
		Triangle t = (Triangle) ShapeTriangle;
		t.setBase(25);
		t.setHeight(50);
		ShapeTriangle.area();
	}

}
