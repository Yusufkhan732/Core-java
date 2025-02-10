package string;

public class cha {
	public static void main(String[] args) {

		String name = "ilyas khan";
		char ch = 'h';
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ch) {

				count++;

			}
		}
		System.out.println("count" + count);
	}

}
