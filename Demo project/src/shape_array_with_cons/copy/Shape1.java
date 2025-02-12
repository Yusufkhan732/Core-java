package shape_array_with_cons.copy;

public class Shape1 {

	public static void main(String[] args) {

		Shape[] shape = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Rectangle(10, 20);
		shape[2] = new Triangle(10, 20);
		
		for (int i = 0; i < shape.length; i++) {
			shape[i].area();

		}
	}
}