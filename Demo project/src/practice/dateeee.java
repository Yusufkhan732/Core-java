package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateeee {
	public static void main(String[] args) {
		
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyy");
		
		String str = sdf.format(d);
		
		System.out.println(sdf.format(str));
	}

}
