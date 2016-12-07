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

}
