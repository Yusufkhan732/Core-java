package overlodingg;

public class Shape {

	public void Area() {
		System.out.println("Shape Area Method");

	}

	public void Area(int b, int c) {
		int area = b * c;
		System.out.println("Shape Area" + area);

	}

	public void Area(int a, short b) {
		int area = a * b;
		System.out.println("Shape Area Method" + area);
	}

	public void Area(short s, double d) {
		double area = s * d;
		System.out.println("Shape Area" + area);

	}
}
