package shapearrayyy;

public class Rectangle extends Shape {
	private int Length;
	private int Width;

	public Rectangle() {
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
		double area = Length * Width;
		System.out.println("Rectangle Area" + area);
	}
}