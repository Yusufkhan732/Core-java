package override.copy;

public class ClassShape {

	public void area() {

		System.out.println("shape area method");
	}

	public void area(int a, int b) {
		int area = a * b;
		System.out.println("shape area method: " + area);
	}

	public void area(short s, double d) {
		double area = s * d;
		System.out.println("shape area method");
	}
}
