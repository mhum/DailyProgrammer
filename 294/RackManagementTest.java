import static org.junit.Assert.*;

import org.junit.Test;

public class RackManagementTest {

	@Test
	public void challenge() {
		assertEquals(RackManagement.scrabble("ladilmy", "daily"), true);	
		assertEquals(RackManagement.scrabble("eerriin", "eerie"), false);
		assertEquals(RackManagement.scrabble("orrpgma", "program"), true);
		assertEquals(RackManagement.scrabble("orppgma", "program"), false);
	}
	
	@Test
	public void bonus1() {
		assertEquals(RackManagement.scrabble("pizza??", "pizzazz"), true);	
		assertEquals(RackManagement.scrabble("pisza??", "pizzaz"), true);	
		assertEquals(RackManagement.scrabble("pi?za?s", "pizzaz"), true);
		assertEquals(RackManagement.scrabble("piizza?", "pizzazz"), false);
		assertEquals(RackManagement.scrabble("a??????", "program"), true);
		assertEquals(RackManagement.scrabble("b??????", "program"), false);
	}

}
