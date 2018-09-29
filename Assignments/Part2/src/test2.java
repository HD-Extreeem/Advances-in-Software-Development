import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test2 {
	private static Clock clock;

	@Before
	public void setup(){
		System.out.println("Test");
		clock = new Clock();
	}
	
	@Test
	public void testChangeModeDate2x() {
		assertEquals("2000-1-1", clock.changeMode());
		assertEquals("0:0:0", clock.changeMode());
	}

	@Test
	public void testChangeTime1x() {
		clock.ready();
		assertEquals("16:57:56", clock.set(16, 57, 56));
		assertEquals("2000-1-1", clock.changeMode());
	}

	@Test
	public void testChangeTime2x() {
		assertEquals("2000-1-1", clock.changeMode());
		assertEquals("0:0:0", clock.changeMode());

	}

	@Test
	public void testChangeTime3x() {
		clock.changeMode();
		assertEquals("0:0:0", clock.changeMode());
		assertEquals("Give Time", clock.ready());
	}

	@Test
	public void testChangeTime4x() {
		clock.changeMode();
		clock.ready();
		assertEquals("2005-5-8", clock.set(2005, 5, 8));
		assertEquals("Give Date", clock.ready());
	}

	@Test
	public void testSecondLimit1() {
		assertEquals("Illegal state!", clock.set(16, 57, -10));
	}

	@Test
	public void testSecondLimit2() {
		assertEquals("Illegal state!", clock.set(16, 57, 60));
	}

	@Test
	public void testMinuteLimit1() {
		assertEquals("Illegal state!", clock.set(16, 60, 00));
	}
	
	@Test
	public void testMinuteLimit2() {
		assertEquals("Illegal state!", clock.set(16, -10, 00));
	}

	@Test
	public void testHourLimit1() {
		assertEquals("Illegal state!", clock.set(-10, 50, 00));
	}

	@Test
	public void testHourLimit2() {
		assertEquals("Illegal state!", clock.set(60, 50, 00));
	}

	@Test
	public void testDayLimit2() {
		clock.changeMode();
		assertEquals("Illegal state!", clock.set(2000, 01, 32));
	}
	
	@Test
	public void testDayLimit1() {
		clock.changeMode();
		assertEquals("Illegal state!", clock.set(2001, 01, -10));
	}

	@Test
	public void testMonthLimit1() {
		clock.changeMode();
		assertEquals("Illegal state!", clock.set(2000, -2, 31));
	}

	@Test
	public void testMonthLimit2() {
		clock.changeMode();
		assertEquals("Illegal state!", clock.set(2000, 13, 31));
	}

	@Test
	public void testYearLimit1() {
		clock.changeMode();
		assertEquals("Illegal state!", clock.set(1999, 12, 31));
	}

	@Test
	public void testYearLimit2() {
		clock.changeMode();
		assertEquals("Illegal state!", clock.set(2101, 12, 31));
	}

	@Test
	public void testChangeDateTime1x() {
		clock.ready();
		assertEquals("Illegal state!", clock.ready());
	}
	@Test
	public void testChangeDateTime2x() {
		clock.changeMode();
		clock.ready();
		assertEquals("Illegal state!", clock.ready());
	}
	
	@Test
	public void testChangeDateTime3x() {
		clock.ready();
		assertEquals("Illegal state!", clock.changeMode());
	}
	
	@Test
	public void testChangeDateTime4x() {
		clock.changeMode();
		clock.ready();
		assertEquals("Illegal state!", clock.changeMode());
	}

}
