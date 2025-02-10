import java.util.Calendar;
import java.util.Date;

public class calender {
	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, 30);
		Date  nextEvent = cal.getTime();
		System.out.println(nextEvent);
	}

}
