package array;

public class secondhighest {
	
	
	public static void main(String[] args) {
		
		
		int arr[] = {120,124,345,66};
		
		int h = 0;
		int s = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]> h) {
				
				h = arr[i];
				
			}
		
	          if (arr[i]<h && arr[i] > s)   {
	        	  
	        	  s = arr[i];
	        	  
	          }
		}	
			System.out.println("s"+ s);
			System.out.println("h"+h);
		}
	}


