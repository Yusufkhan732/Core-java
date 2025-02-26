package Com_Raya_Array;

public class TestFindNumber {

	public static void main(String[] args) {

		int array[] = { 2, 3, 8, 9, 19, 32, };

		int number = 33;

		int count = 0;
		// Loop through the array to find the number
		for (int i = 0; i < array.length; i++) {

			if (array[i] == number) {
				count++;
			}
		}
		// Check if the number exists in the array or not
		if (count == 0) {

			System.out.println("not exist number");

		} else {
			System.out.println("exist number");
		}
	}

}
