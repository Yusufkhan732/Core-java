package basic;

public class TestNumberformatexception {

	public static void main(String[] args) {
		System.out.println("before");

		try {
			int a = 10;
			int b = 0;
			int c = a / b;

			System.out.println("sum" + c);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("after");
	}

}
