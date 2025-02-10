package string;

public class wovels {
	public static void main(String[] args) {

		char[] Wovels = { 'a', 'e', 'i', 'o', 'u' };
		String name = "vijay dinanath chouhan";
		int count = 0;
		for (int i = 0; i < Wovels.length; i++) {
			for (int j = 0; j < name.length(); j++) {
				if (Wovels[i] == name.charAt(j)) {
					count++;

				}

			}
			if (count > 0) {
				System.out.println(Wovels[i] + " count " + count);

			}
			count = 0;
		}
	}

}
