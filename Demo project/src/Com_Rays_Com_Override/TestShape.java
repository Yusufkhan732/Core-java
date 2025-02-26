package Com_Rays_Com_Override;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		Rectangle r = new Rectangle();

		r.area();

		Shape shape = new Rectangle();

		shape.area();
	}
}
