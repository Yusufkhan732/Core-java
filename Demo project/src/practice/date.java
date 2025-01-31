package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

		
		String str = sdf.format(d);
		
		System.out.println(str);
	}

}
