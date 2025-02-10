package TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
public class TestCustomcalender {
//	
//	
	// public static void main(String[] args) throws ParseException {
//		
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyy");
//		
//		
//		String str = "01.01.2025";
//		
//		Date date = sdf.parse(str);
//		
//		Calendar cal = Calendar.getInstance();
//		
//		cal.setTime(date);
//		cal.add(Calendar.DATE,30);
//		Date nextEvent = cal.getTime();
//		
//		System.out.println(sdf.format(nextEvent));
//		 
//	}
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyy");

		String str = "01.01.23";

		Date date = sdf.parse(str);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		Date nextEvent = cal.getTime();

		System.out.println(sdf.format(nextEvent));

	}

}