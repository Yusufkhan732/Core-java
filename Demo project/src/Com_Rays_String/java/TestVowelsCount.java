package Com_Rays_String.java;

public class TestVowelsCount {

	public static void main(String[] args) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		String name = "vijay dinanath chouhan";

		int count = 0;

		for (int i = 0; i < vowels.length; i++) {

			for (int j = 0; j < name.length(); j++) {

				if (vowels[i] == name.charAt(j)) {
					if (vowels[i] == name.charAt(j))
// Agar current vowel vowels[i] string ke kisi character name.charAt(j) ke
					// barabar hota hai, toh count++ karte ho.

					count++;
				}
			}

			if (count > 0) {
				// Jab current vowel ka count greater than 0 hota hai, tab us vowel ka count
				// print karte ho.

				System.out.println(vowels[i] + " count " + count);
			}
			count = 0;

		}
	}
}
