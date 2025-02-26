package Com_Rays_Practice;

public class Shape {

	private String Color;
	private int Borderwidth;

	public Shape() {
		//System.out.println("defaule const");
	}

	public Shape(String Color, int Borderwidth) {
		//System.out.println(" param const");
		this.Borderwidth = Borderwidth;
		this.Color = Color;
	}

	public String getColor() {
		return Color;

	}

	public void setColor(String Color) {
		this.Color = Color;

	}

	public int getBorderwidth() {
		return Borderwidth;

	}

	public void setBorderwidth(int borderwidth) {
		this.Borderwidth = borderwidth;

	}

	public void Area() {
		System.out.println("Shape Area Method");
	}
}

//	public static Shape getShape(int i) {
//
//		if (i == 2) {
//			return new Rectangle();
//
//		}
//		if (i == 1) {
//			
//			return new Circle();
//		}
//		if (i == 3) {
//			
//			return new Triangle();
//
//		}
//		return new Shape();
//
//	}
//}
