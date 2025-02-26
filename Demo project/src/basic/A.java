package basic;

public class A {

	public static void main(String[] args) {

		try {

			int a = 20, b = 2, c;
			c = a / b;
			System.out.println(c);
			int arr[] = { 2, 3, 4, 5, };
			System.out.println(arr[8]);
			String name = "khan";
			System.out.println(name.length());
			String str = "123";
			int i = Integer.parseInt(str);
			System.out.println(i);
			String na = "abs";
			System.out.println(na.charAt(2));
			System.out.println(na.toUpperCase());
		}

		catch (ArithmeticException a) {

			System.out.println(a);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		}

		catch (NullPointerException n) {
			System.out.println("Nullexception");

		} catch (NumberFormatException e) {
			System.out.println("Numberexecption");

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndex");
		} catch (Exception e) {

			System.out.println(e);

			System.out.println(e.getMessage());

			e.printStackTrace();
		}

	}
}