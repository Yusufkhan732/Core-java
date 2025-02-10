package shapearrayconstr;

public class Shape2 {

	public static void main(String[] args) {

		Shape s1 = new Rectangle(10, 20);
		Shape s2 = new Circle(10);
		Shape s3 = new Triangle(10, 20);
		s1.Area();
		s2.Area();
		s3.Area();
	}
}
