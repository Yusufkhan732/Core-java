package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dat {
	
	public static void main(String[] args) throws ParseException {
		
		
		Date d = new Date();
		
		System.out.println(d);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.yyy");
		
		
		String rts = sdf.format(d);
		
		System.out.println(rts);
		
		
		String str = "29/jan/2025";
		
		SimpleDateFormat cdf = new SimpleDateFormat("dd/MMM/yyyy");
		
		Date t = cdf.parse(str);
		
		System.out.println(t);
		
		
		
	
	}

}
