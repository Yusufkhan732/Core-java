package array;

public class aaaa {
	
	
	public static void main(String[] args) {
		
		
		int []arr = {222,111,333,444,555,};
		
     int temp = 0;
     
     for (int i = 0; i < arr.length; i++) {
    	 
    	 for (int j = i+1; j < arr.length; j++) {
    		 
    	if (arr[i] < arr[j]) {
    		
    		temp = arr[i];
    		
    		arr[i] = arr[j];
    		
    		arr[j]= temp;
			
		}	 
    		 
    	 }
    	 System.out.println(arr[i] + " ");
			
		}
     }
		
	}