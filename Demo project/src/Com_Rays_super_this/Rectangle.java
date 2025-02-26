package Com_Rays_super_this;

public class Rectangle extends Shape {
	// parents ke constructor ke call karne ke liye super keyword ka use kiya jata
	// hai child class mein

	private int length;

	private int width;

	public Rectangle() {
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(String color, int borderWidth) {
		super(color, borderWidth);
	}

	public Rectangle(int length, int width, String color, int borderWidth) {
		this(color, borderWidth);
		this.length = length;
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

	@Override
	public void area() {
		int rArea = length * width;
		System.out.println("Rectangle Area: " + rArea);
	}
}