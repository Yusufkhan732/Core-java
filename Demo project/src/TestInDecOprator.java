
public class TestInDecOprator {

	public static void main(String[]args) {
		
		
		int i =1;
		
		
	//	int sum = i++ + ++i+ --i + ++i + i-- + --i + i + --i;
	          //   1  + 3  + 2   + 3   + 3   + 1   + 1 + 0  
	

		//	int sum = i + --i + ++i + ++i + i++ + i-- + --i + i ;
		         //   1 +  0  +  1  +  2  +  2  + 3   + 1   +  1
	
	
	//	int sum = --i + i++ + i++ + --i + ++i + i-- + i;
		     //    0  +  0  + 1   +  1  +  2  +  2  + 1
		
		int sum = ++i + --i + i-- + i++ + i--;
            //	   2   +   1 + 1 +   0 +  1 = 5    ; 
		
		
		
		System.out.println("sum:" + sum);

		       
		
	
	}
}
