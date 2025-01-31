package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendar {
	public static void main(String[] args) throws ParseException {
		
		String date = "10/01/2025";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(date);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, 20);
		Date dt = cal.getTime();
		
		System.out.println(sdf.format(dt));
		
		
		
		
		
		
		 
		
		
		
		
		
	}

}
