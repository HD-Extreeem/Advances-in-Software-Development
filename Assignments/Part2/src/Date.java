
public class Date {
	private int theYear = 2000;
	private int theMonth = 01;
	private int theDay = 01;

	public String dateSet(int year, int month, int day) {
		if ((year <= 2100 && year >= 2000) && (month >= 1 && month <= 12) && (day <= 31 && year >= 1)) {
			
			theYear = year;
			theMonth = month;
			theDay = day;
		}
		return showDate();
	}

	public String showDate() {
		String date = theYear + "-" + theMonth + "-" + theDay;
		return date;
	}
}
