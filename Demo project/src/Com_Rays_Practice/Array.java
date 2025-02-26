package Com_Rays_Practice;

public class Array {

	public static void main(String[] args) {

		int arr[] = { 22, 34, 56, 78, };

		int second = 0;
		int high = 0;
		// Agar current element high se zyada hai
		for (int i = 0; i < arr.length; i++) {
			// Pehle jo high tha, wo ab second ban gaya
			if (arr[i] > high) {

				second = high;
				// Ab new high ko set karna
				high = arr[i];
			}
			// Agar element high se chhota hai aur second se bada hai
			if (arr[i] < high && arr[i] > second) {
				// Toh second ko update karna
				second = arr[i];
			}
		}
		// Highest aur second highest value print karna
		System.out.println("high  " + high);
		System.out.println("second  " + second);

	}
}
