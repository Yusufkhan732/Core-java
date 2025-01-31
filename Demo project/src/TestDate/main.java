package TestDate;

import java.util.Calendar;
import java.util.Date;

public class main {
	
	public static void main(String[] args) {
		
		Calendar cal= Calendar.getInstance();
		
		cal.add(Calendar. DATE, 26);
		
		Date nextEvent = cal.getTime();
		
		System.out.println(nextEvent);
		
	}	}	