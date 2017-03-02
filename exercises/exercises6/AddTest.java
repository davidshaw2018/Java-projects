package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		for (int i = 0; i < 100; ++i) {
			for (int j = 0; j < 100; ++j) {
				int ans = i + j;
				assertEquals(ans, Add.add(i, j));
			}
		}
		
		//
		// write other test cases here:
		//
		
		for (int i = -5; i < 10; ++i) {
			for (int j = -5; j < 10; ++j) {
				int ans = i+j;
				assertEquals(ans, Add.addAny(i, j));
			}
		}
	}

}
