package array;

public class dimantional {
	
	public static void main(String[] args) {
		
		
		int [][]arr = new int [10][10];
		
		for (int i = 0; i < arr.length; i++) {
			
			int sum = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				arr[i][j] = i + 1 + sum;
				
				System.out.print(arr[i][j]+ "\t");
				
				sum = sum + 10;
				
			}
			
		
		System.out.println();
		System.out.println();
	}
	}
}
