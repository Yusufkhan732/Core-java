package TestDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
	
	
	public static void main(String[] args) {
		
		
		Date d = new Date();
		
		System.out.println(d);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		
		String str = sdf.format(d);
		
		System.out.println(str);
	}
}