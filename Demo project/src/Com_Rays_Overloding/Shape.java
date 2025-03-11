package Com_Rays_Overloding;

public class Shape {

	public void area() {

		System.out.println("shape area method");
	}

	public void area(int a, int b) {
		int area = a * b;
		System.out.println("shape area method: " + area);

	}

	public void area(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("Hello " + name + " good morning");

		}

	}
}
