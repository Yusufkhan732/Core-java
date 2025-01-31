package Slide;

public class Allswitch {
	
	public static void main(String[] args) {
		
		int size = args.length;
		
		switch(size) {
		
		case 0: 
		System.out.println("Hello");
		
		break;
		
		case 1:
			
			System.out.println("world");
			break;
			
			default:
			for (int i = 0; i < size; i++) {
				System.out.println(i +"=Hello"+args[i]);
				
			}
				
				
				
		
			
		}
		
	}

	
		
	}


