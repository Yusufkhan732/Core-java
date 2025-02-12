package superr;

public class Testshape {
	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 20, "red", 10);
		System.out.println("Length" + r.getLength());
		System.out.println("Width" + r.getWidth());
		System.out.println("Color;" + r.getColor());
		System.out.println("Borderwidth:" + r.getBorderwidth());

	}

}
