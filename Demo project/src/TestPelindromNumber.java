
public class TestPelindromNumber {

public static void main(String[]args) {
	   

       int number=1234321;
       
       
   int    r = 0;
       
  int     sum = 0;
       
       
    int   n = number;
       
      while (  n > r);{

    	  r = n* 10;
    	  
    	  sum = sum* 10+r;
   
    	  n = n * 10;
      }
      
      if (sum==number) {
    	 
    	  System.out.println("PelindromNumber"+ sum);
      }
      
      
      else {
           
        	   System.out.println("'NotpelindromNumber" + sum);
        	   
      }       	   
        	  
           }
       
} 		   
    		   
    		   
