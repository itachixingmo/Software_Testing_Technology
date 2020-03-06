package software_testing;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestChange {
	Change cha;
	
	@Before
	public void setUp() {
		cha = new Change();
	}
	
	@Test
	public void testChange1() {
		int result = cha.change(0);
		assertEquals(0,result);
	}
	
	@Test
	public void testChange2() {
		int result = cha.change(16);
		assertEquals(0,result);
	}
	
	@Test
	public void testChange3() {
		int result = cha.change(4);
		assertEquals(-1,result);
	}
}
