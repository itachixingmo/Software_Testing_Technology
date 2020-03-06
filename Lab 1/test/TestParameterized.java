package software_testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestParameterized {
	private int input;
	private int expected;
	private Change cha = null;
	
	public TestParameterized(int input,int expected){
		this.input = input;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		cha = new Change();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{0,0},{93,0},
			{1,0},{5,0},{10,0},{20,0},{50,0},
			{2,0},{3,0},{7,0},{18,0},{27,0},{66,0},
			{4,-1},{9,-1},{19,-1},{44,0},{47,-1},{89,-1},{7,0},
			});
	}
	
	
	@Test
	public void testChange() {		
		assertEquals(this.expected,cha.change(input));
	}
}
