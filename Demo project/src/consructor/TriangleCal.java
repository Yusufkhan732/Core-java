package consructor;

public class TriangleCal {
	public static void main(String[] args) {
		
		
		Triangle t = new Triangle();
		Triangle t1 = new Triangle(4,8);
		
		System.out.println(t1.getBase());
		System.out.println(t1.getHight());
		
		Triangle t2 = new Triangle();
		t2.setBase(10);
		System.out.println(t2.getBase());
		t2.setHight(20);
		System.out.println(t2.getHight());
		t2.Area();
	}

}
