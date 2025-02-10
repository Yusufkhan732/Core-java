package Com.Rays.oop.cnstr;

public class ShapeCal {
	
	public static void main(String[] args) {
		
		
		Shape  s = new Shape();
		
		Shape s1 = new Shape("orange");
		System.out.println(s1.getColor());
		s1.setColor("blue");
		System.out.println(s1.getColor());
		
	   
	   
	   Shape s2 = new Shape(20);
	   System.out.println(s2.getborderWidth());
	   s2.setborderWidth(14);
	   System.out.println(s2.getborderWidth());
	   
	   
		
	}

}