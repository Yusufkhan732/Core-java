package consructor;

public class Shape {
	private String Color;
	private int Borderwidth;

	public Shape() {

	}

	public Shape(String Color, int Borderwidth) {
		System.out.println("1 param Const");
		this.Color = Color;
		this.Borderwidth = Borderwidth;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getBorderwidth() {
		return Borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		Borderwidth = borderwidth;

	}

}
