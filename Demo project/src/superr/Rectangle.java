package superr;

public class Rectangle extends Shape {

	private int Length;
	private int Width;

	public Rectangle() {

	}

	Rectangle(int Length, int Width) {
		this.Length = Length;
		this.Width = Width;
	}

	public Rectangle(String Color, int Borderwidth) {
		super(Color, Borderwidth);

	}

	public Rectangle(int Length, int Width, String color, int borderwidth) {
		this(color, borderwidth);
		this.Length = Length;
		this.Width = Width;

	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public void Area() {
		int area = Length * Width;
		System.out.println("Rectangle Area" + area);
	}

}
