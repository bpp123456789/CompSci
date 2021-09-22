
public class TimeAndDay {
static String time;

	public static void main(String[] args) {
		long milliseconds = System.currentTimeMillis();
		long seconds = milliseconds / 1000;
		long minutes = seconds / 60;
		long hoursUTC = minutes / 60;
		long hoursEST = hoursUTC - 4;
		long shownMil = milliseconds % 1000;
		long shownSec = seconds % 60;
		long shownMin = minutes % 60;
		long shownHours = hoursEST % 12;
		if (hoursEST <= 12) {
			time = " pm";
		} else {
			time = " am";
		}
		System.out.println(shownHours + ":" + shownMin + time);
		
		
		
		
		
	}
}
