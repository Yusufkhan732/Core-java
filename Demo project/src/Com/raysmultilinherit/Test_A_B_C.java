package Com.raysmultilinherit;

public class Test_A_B_C {

	public static void main(String[] args) {

		B b = new B();
		b.multilevel(3, 4);
		b.multiply(5, 10);
		

		C c = new C();
		c.multilevel(2, 3);
		c.multiply(4, 6);
		c.devision(8, 2);

	}

}
