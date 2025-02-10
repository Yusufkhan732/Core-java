package TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringToDate {
	
	public static void main(String[] args) throws ParseException {
		
		
		String str = "29/01/2025";
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddd/MM/yyy");
		
		
		String d = sdf.format(sdf);
		
		System.out.println(str);
	}
}
