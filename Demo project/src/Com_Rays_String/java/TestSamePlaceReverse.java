package Com_Rays_String.java;

public class TestSamePlaceReverse {

	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";

		String[] arr = name.split(" ");// {"vijay" ,"dinanath". "chouchan"}

		for (int i = 0; i < arr.length; i++) {
			// Reverse each word
			for (int j = arr[i].length() - 1; j >= 0; j--) {

				System.out.print(arr[i].charAt(j));
			}

			System.out.print(" ");
		}
	}

}
