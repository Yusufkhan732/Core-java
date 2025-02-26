package Com_Rays_Inheritence;

public class Circle extends Shape {

	private int radius;
	public static final double PI = 3.14 ;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area () {
		double area = PI * radius * radius ;
		System.out.println("circlr area:" + area);
	}

}
