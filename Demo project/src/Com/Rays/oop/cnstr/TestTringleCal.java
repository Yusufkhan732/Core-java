package Com.Rays.oop.cnstr;

public class TestTringleCal {

	public static void main(String[] args) {

		// Cal Constrauctor;

		Tringle t = new Tringle();

		Tringle t1 = new Tringle(4);
		System.out.println("Tringle base" + t1.getBase());

		Tringle t2 = new Tringle(8, 4);
		System.out.println("Tringle hight" + "" + t2.getHight());

		// cal getter setter mathad

		Tringle t3 = new Tringle();
		t3.setBase(4);
		System.out.println("Tringle base" + t3.getBase());
		t3.setHight(8);
		System.out.println(" Tringle hight" + t3.getHight());
		t3.Area();

	}

}
