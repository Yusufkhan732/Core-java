package consructor;

public class RectangleCal {
	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		Rectangle r1 = new Rectangle(5, 8);
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());

		Rectangle r2 = new Rectangle(5, 8);
		r2.setLength(5);
		System.out.println(r2.getLength());
		r2.setWidth(8);
		System.out.println(r2.getWidth());
		r2.Area();

	}

}
