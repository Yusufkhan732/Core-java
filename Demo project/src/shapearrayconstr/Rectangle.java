package shapearrayconstr;

public class Rectangle extends Shape {

	private int Length;
	private int Width;

	public Rectangle() {

	}

	public Rectangle(int Length, int Width) {
		this.Length = Length;
		this.Width = Width;
	}

	public void setlength(int Length) {
		this.Length = Length;
	}

	public int getLength() {
		return Length;

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
