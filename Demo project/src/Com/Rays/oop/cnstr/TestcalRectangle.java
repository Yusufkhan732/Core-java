package Com.Rays.oop.cnstr;

public class TestcalRectangle {
	public static void main(String[] args) {
		
		//Constarctor cal 

		Rectangle r = new Rectangle();

		Rectangle r1 = new Rectangle(5);

		System.out.println(" Rectangle length" + r1.getLength());

		Rectangle r2 = new Rectangle(5 , 10);
		System.out.println("width:" + r2.getWidth());
		
		//getter setter mathad;
		
		Rectangle rt = new Rectangle();
		
		rt.setLength(5);
		System.out.println(rt.getLength());
		
		rt.setWidth(10);
		System.out.println(rt.getWidth());
       
		rt.Area();
 
	}

}
