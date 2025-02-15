package consructor;

public class CircleCal {
	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		Circle c1 = new Circle(5);
		c1.setRadius(5);
		System.out.println(c1.getRadius());
		c1.Area();
	}

}
