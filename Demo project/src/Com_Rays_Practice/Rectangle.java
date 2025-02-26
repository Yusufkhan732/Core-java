package Com_Rays_Practice;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {
		// System.out.println("default const");
	}

	public Rectangle(String Color, int Borderwidth) {
		super(Color, Borderwidth);

	}

	public Rectangle(String Color, int Borderwidth, int length, int width) {
		this(Color, Borderwidth);
		// System.out.println("1 param const");
		this.length = length;
		this.width = width;
	}

	public int getlength() {
		return length;
	}

	public void setlength(int length) {
		this.length = length;

	}

	public int getwidth() {
		return width;
	}

	public void setwidth(int width) {
		this.width = width;

	}

	@Override
	public void Area() {
		int area = length * width;
		System.out.println("Rectangle Area" + area);
	}

}
