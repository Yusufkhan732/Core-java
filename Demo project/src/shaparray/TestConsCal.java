package shaparray;

public class TestConsCal {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];
		shape[0] = new Rectangle(4,8);
		shape[1] = new Circle(10);
		shape[2] = new Triangle(10,20);
		for (int i = 0; i < shape.length; i++) {

			shape[i].Area();

		}
	}

}
