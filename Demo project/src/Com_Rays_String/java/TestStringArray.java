package Com_Rays_String.java;

public class TestStringArray {

	public static void main(String[] args) {

		String arr[] = { "vijay", "dinanath", "chouhan" };

		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[i].length(); j++) {

					if (ch == arr[i].charAt(j)) {
						// Agar current character ch match karta hai string ke kisi character
						// arr[i].charAt(j) ke saath, toh count++ karte ho.

						count++;
					}
				}
			}
			System.out.println(ch + " count = " + count);
			count = 0;

		}
	}

}
