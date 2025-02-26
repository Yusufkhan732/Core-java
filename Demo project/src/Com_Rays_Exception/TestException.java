package Com_Rays_Exception;

public class TestException {
	public static void main(String[] args) {

		System.out.println("Before");

		try {

			int a = 10;
			int b = 0;
			int c = a / b;
			
			System.out.println("sum" + c);
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		System.out.println("After");

	}
}