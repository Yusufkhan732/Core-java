package Com_Rays_Consructor;

public class Shapecal {
	public static void main(String[] args) {

		Shape s = new Shape();

		Shape s1 = new Shape();

		s.setColor("red");
		s.setBorderwidth(20);
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());

	}

}
