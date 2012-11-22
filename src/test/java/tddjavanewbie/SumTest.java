package tddjavanewbie;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test public void returnsExpectedResult() {
		Sum sum = new Sum();
		assertEquals(9, sum.calculate(2, 2, 5));
	}
	
}
