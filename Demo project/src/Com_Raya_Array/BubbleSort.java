package Com_Raya_Array;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 100, 10, 5, 11, 13, 17, 88 };

		int temp = 0;
		// Outer loop - array ke har element ko compare karna

		for (int i = 0; i < arr.length; i++) {
			// Inner loop - current element ke baaki elements ke saath compare karna

			for (int j = i + 1; j < arr.length; j++) {

				// Agar arr[i] chhota hai arr[j] se (descending order ke liye)
				if (arr[i] < arr[j]) {

					// Swap karte hain arr[i] aur arr[j] ki values ko

					temp = arr[i]; // arr[i] ko temp mein store karte hain

					arr[i] = arr[j];// arr[i] ko arr[j] se replace karte hain

					arr[j] = temp;// arr[j] ko temp ki value se replace karte hain

				}

			}
			System.out.println(arr[i] + " ");
		}

	}

}
