package string;

public class vowel {
	
	public static void main(String[] args) {
		
		
		
		char[] vowels = {'a','e','i','o','u'};
		
		String name = "vijay dinanath chouhan";
		
		int count =0;
		
		for (int i = 0; i < vowels.length; i++) {
       for (int j = 0; j < name.length(); j++){
		
	if (vowels[i]==name.charAt(j)) {
		
		count++;
	}
		
	}
	System.out.println(vowels[i] + "count"+count);
	count=0;
			
		}
	}

}
