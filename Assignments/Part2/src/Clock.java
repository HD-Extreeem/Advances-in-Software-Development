
public class Clock {
	private Time theTime = new Time();
	private Date theDate = new Date();
	private String ready;
	private String CM;
	private String set;

	private enum State {
		S1, S2, S3, S4
	}

	State current_state = State.S1;

	public String changeMode() {
		switch (current_state) {
		case S1:
			CM = theDate.showDate();
			current_state = State.S2;
			break;
		case S2:
			CM=theTime.showTime();
			current_state = State.S1;
			break;
		case S3:
			CM="Illegal state!";
			break;
		case S4:
			CM="Illegal state!";
			break;
		}
		return CM;
	}

	public String ready() {
		switch (current_state) {
		case S1:
			ready="Give Time";
			current_state = State.S3;
			break;
		case S2:
			ready="Give Date";
			current_state = State.S4;
			break;
		case S3:
			ready="Illegal state!";
			break;
		case S4:
			ready="Illegal state!";
			break;
		}
		return ready;
	}

	public String set(int p1, int p2, int p3) {
		switch (current_state) {
		case S1:
			set="Illegal state!";
			break;
		case S2:
			set="Illegal state!";
			break;
		case S3:
			set=theTime.timeSet(p1, p2, p3);
			current_state = State.S1;
			break;
		case S4:
			set=theDate.dateSet(p1, p2, p3);
			current_state = State.S2;
			break;
		}
		return set;
	}
}
