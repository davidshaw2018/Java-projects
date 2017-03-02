package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		for(int i = 0; i < 1000; ++i) {
			int ans = i*(i+1)/2;
			assertEquals(ans, Sum.sum(i));
		}
	}

}
