package Com.Rays.oop.cnstr;

public class Shape {

	private String Color;

	private int borderWidth;

	public Shape() {
		System.out.println("default Constructor");

	}

	public Shape(String color) {
		this.Color = color;
		System.out.println("1 param Constructor");
	}

	public Shape(int borderWidth) {
		System.out.println("1 param Constructor");
		this.borderWidth = borderWidth;
	}

	public void setColor(String color) {

		this.Color = color;
	}

	public String getColor() {
		return Color;
	}

	public void setborderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getborderWidth() {
		return borderWidth;
	}

}
