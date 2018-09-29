
public class Time {

	private int theHour = 00;
	private int theMinute = 00;
	private int theSecond = 00;

	public String timeSet(int hour, int minute, int second) {
		if ((hour <= 23 && hour >= 0) && (minute >= 0 && minute <= 59) && (second <= 59 && second >= 0)) {
			theHour = hour;
			theMinute = minute;
			theSecond = second;
		}
		return showTime();
	}

	public String showTime() {
		String time = theHour + ":" + theMinute + ":" + theSecond;
		return time;
	}

}
