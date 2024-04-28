package Assignment;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
//11.	W.a.junit program to handled Assert class with all method to check its pass or fail
public class P_Assert {
	@Test
	public void run() {
		int actual = 9;
		int expected = 10;
		assertEquals(expected, actual);
		assertTrue(false);
		assertFalse(false);
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		assertArrayEquals(a, b);
		
	}
}
