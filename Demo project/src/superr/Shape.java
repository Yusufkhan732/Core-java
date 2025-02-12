package superr;

public class Shape {

	private String Color;
	private int borderwidth;

	public Shape() {

	}

	public Shape(String Color, int Borderwidth) {
		this.Color = Color;
		this.borderwidth = Borderwidth;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public void Area() {
		System.out.println("shape area method");
	}

}
