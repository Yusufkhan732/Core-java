package string;

public class vowels {
	
	public static void main(String[] args) {
		
		
		char[] Vowels = { 'a','e','o','u','i'};
		
		String name = " vijay dinanath chouhan";
		
		int count=0;
		for (int i = 0; i < Vowels.length; i++) {
			
			for (int j = 0; j < name.length(); j++) {
				
				if (Vowels[i]==name.charAt(j)) {
					
			       count++;
				}	
				}
				if (count > 0) {
					
					System.out.println(Vowels[i] + "count"+count );
					
				}
			count=0;
			
		}
	}

}
