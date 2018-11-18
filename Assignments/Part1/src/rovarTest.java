import static org.junit.Assert.*;

import org.junit.Test;

public class rovarTest {
	rovar r = new rovar();

	@Test
	public void testEmptyEnrov() {

		assertEquals("", rovar.enrov(""));
	}

	@Test
	public void testEmptyDenrov() {

		assertEquals("", rovar.derov(""));
	}
	
	@Test
	public void testNullEnrov() {

		assertEquals(null, rovar.enrov(null));
	}

	@Test
	public void testNullDenrov() {

		assertEquals(null, rovar.derov(null));
	}

	
	@Test
	public void testLowerEnrov() {

		assertEquals("hohadodi", rovar.enrov("hadi"));
	}

	@Test
	public void testLowerDenrov() {

		assertEquals("hadi", rovar.derov("hohadodi"));
	}
	
	
	@Test
	public void testUperEnrov() {

		assertEquals("YURORDODAEROR", rovar.enrov("YURDAER"));
	}

	@Test
	public void testUperDenrov() {

		assertEquals("YURDAER", rovar.derov("YURORDODAEROR"));
	}
	
	@Test
	public void testNumberEnrov() {

		assertEquals("momagognonusos1234kokroramompopelol", rovar.enrov("magnus1234krampel"));
	}

	@Test
	public void testNumberDenrov() {

		assertEquals("magnus1234krampel", rovar.derov("momagognonusos1234kokroramompopelol"));
	}
	
	@Test
	public void testSpecialEnrov() {

		assertEquals("momagognonusos*--/1234kokroramompopelol", rovar.enrov("magnus*--/1234krampel"));
	}

	@Test
	public void testSpecialDenrov() {

		assertEquals("magnus*--/1234krampel", rovar.derov("momagognonusos*--/1234kokroramompopelol"));
	}

	@Test
	public void testAllLettersUpper(){
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ", rovar.derov("abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzozåäö"));
	}

	@Test
	public void testAllLettersUpper(){
		assertEquals("ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNONOPOPQOQRORSOSTOTUVOVWOWXOXYZOZÅÄÖ", rovar.enrov("ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ"));
	}

	@Test
	public void testAllLettersLower(){
		assertEquals("abcdefghijklmnopqrstuvwxyzåäö", rovar.derov("abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzozåäö"));
	}

	@Test
	public void testAllLettersLower(){
		assertEquals("abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzozåäö", rovar.enrov("abcdefghijklmnopqrstuvwxyzåäö"));
	}
	1234567890

	@Test
	public void testAllNumbersEn(){
		assertEquals("1234567890", rovar.enrov("1234567890"));
	}

	@Test
	public void testAllNumbersDe(){
		assertEquals("1234567890", rovar.derov("1234567890"));
	}

	@Test
	public void testAllCharactersEn(){
		assertEquals("!\"#€%&/()=?`*^•Ωé®†µüıœπøﬁª√˛¸ƒ∂ß÷≈ç‹›‘’‚…;:–_´±≈][|§∞$£@©{}[]¿`\\¶‰¢¥”¡”•≤≥<>", rovar.enrov("!\"#€%&/()=?`*^•Ωé®†µüıœπøﬁª√˛¸ƒ∂ß÷≈ç‹›‘’‚…;:–_´±≈][|§∞$£@©{}[]¿`\\¶‰¢¥”¡”•≤≥<>"));
	}

	@Test
	public void testAllCharacterssDe(){
		assertEquals("!\"#€%&/()=?`*^•Ωé®†µüıœπøﬁª√˛¸ƒ∂ß÷≈ç‹›‘’‚…;:–_´±≈][|§∞$£@©{}[]¿`\\¶‰¢¥”¡”•≤≥<>", rovar.derov("!\"#€%&/()=?`*^•Ωé®†µüıœπøﬁª√˛¸ƒ∂ß÷≈ç‹›‘’‚…;:–_´±≈][|§∞$£@©{}[]¿`\\¶‰¢¥”¡”•≤≥<>"));
	}

	
}
