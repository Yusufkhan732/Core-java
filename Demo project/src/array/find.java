package array;

public class find {
	
	public static void main(String[] args) {
		
		
		int []arr = {3,45,677,8,90,};
		int  number =98;
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==number) {
				
				count++;
			}
			}
			
		if (count == number) {
			
			System.out.println("existnumber");
			
		}
		else {
			System.out.println("notexistnumber");
		}
	}

}
