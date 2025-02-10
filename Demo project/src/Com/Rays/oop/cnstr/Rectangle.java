package Com.Rays.oop.cnstr;

public class Rectangle {

	private int length;

	private int width;

	public Rectangle() {
		System.out.println("defult Constructor");
	}

	public Rectangle(int legth) {
		this.length = legth;
		System.out.println("1 param constactor");
	}

	public Rectangle(int length, int width) {
		System.out.println("2 param Constructor");
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void Area() {
		int area = width * length;
		System.out.println("area:" + area);

	}

}
