package array;

public class dimitional {
	public static void main(String[] args) {

		int[][] arr = new int[10][10];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (1 + i) * (1 + j);
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
			System.out.println();
		}
	}

}
