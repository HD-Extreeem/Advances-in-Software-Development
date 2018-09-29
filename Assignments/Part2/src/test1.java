import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test1 {
	private static Clock clock;
	
	@Before
	public void setup(){
		System.out.println("Test");
		clock = new Clock();
	}
	
	@Test
	public void testReady() {
		assertEquals("Give Time", clock.ready());
	}
	
	@Test
	public void testSet() {
		clock.ready();
		assertEquals("16:57:56", clock.set(16, 57, 56));
	}
	
	@Test
	public void testChangeModeDate() {
		assertEquals("2000-1-1", clock.changeMode() );
	}
	
	@Test
	public void testChangeModeTime() {
		clock.changeMode();
		assertEquals("0:0:0",clock.changeMode() );
	}
	
	@Test
	public void testChange() {
		clock.changeMode();
		assertEquals("Give Date", clock.ready());
	}
	
	@Test
	public void testSetDate() {
		clock.changeMode();
		clock.ready();
		assertEquals("2005-5-8", clock.set(2005, 5, 8));
	}
	

}
