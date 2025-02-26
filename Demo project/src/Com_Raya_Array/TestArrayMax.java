package Com_Raya_Array;

public class TestArrayMax {

	public static void main(String[] args) {

		// Ek array banaya jisme kuch numbers hain
		int arr[] = { 23, 76, 89, 65, 34, 12 };

		// Maximum value ko store karne ke liye max variable
		int max = 0;

		// Loop ke through array ke har element ko check karte hain
		for (int i = 0; i < arr.length; i++) {

			// Agar current element max se bada hai, toh max ko update karte hain
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// Maximum value ko print karte hain
		System.out.println("maximum " + max);
	}
}
