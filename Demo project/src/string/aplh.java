package string;

public class aplh {
	
	public static void main(String[] args) {
		
		String name = "vija dinanath chouhan";
		
		
	int	count = 0;
	
	for (char ch = 'a'; ch <= 'z'; ch++) {
		
		for (int i = 0; i < name.length(); i++) {
			
			if (ch == name.charAt(i)) {
				
				count++;
			}
				
		}		
			if (count !=0) {
				
				System.out.println(ch + "count=" + count);
				count =0;
			}
			
		
		
	}
	}
}

