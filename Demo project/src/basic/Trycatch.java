package basic;

public class Trycatch {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		// String name = "khan";
		String name = "abc";

		try {

			int c = a / b;
			System.out.println("division " + c);
			// System.out.println(name.length());
			System.out.println(name.charAt(3));

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}

}
