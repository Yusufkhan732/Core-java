package Com_Rays_Exception;

public class TestArithmatic {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		
		try {
			int c = a / b;

			System.out.println("Divison" + c);

		} catch (ArithmeticException e) {

			System.out.println(e);

			System.out.println(e.getMessage());

			e.printStackTrace();

		}
	}
}
