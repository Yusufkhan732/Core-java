package Com_Rays_String.java;

public class TestAlphaBetCount {

	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";

		int count = 0;
		
		// Loop through all the characters from 'a' to 'z'
		for (char ch = 'a'; ch <= 'z'; ch++) {
			
			// Loop through the name string
			for (int i = 0; i < name.length(); i++) {
				
				// Check if the character in the string matches the current character
				if (ch == name.charAt(i)) {

					count++;// If yes, increment the count
				}
			}
			// If the character was found at least once, print the count
			if (count != 0) {// Agar count != 0 (matlab character string mein mil gaya hai), toh us character
								// ka count print karte ho.

				System.out.println(ch + " count = " + count);
			}
			count = 0;
			// Har loop ke baad count = 0 kar rahe ho taki next character ka count sahi ho.
		}

	}
}