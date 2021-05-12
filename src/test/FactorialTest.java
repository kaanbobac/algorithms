package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import algorithms.Factorial;

public class FactorialTest {

	@Test
	void test_five() {
		Factorial f = new Factorial();
		assertEquals(f.calculate_iteration(5), 120);
	}
}
