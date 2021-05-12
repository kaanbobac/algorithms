package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import algorithms.Factorial;

public class FactorialTest {

	@Test
	void test_iterative_five() {
		Factorial f = new Factorial();
		assertEquals(f.calculate_iteration(5), 120);
	}
	@Test
	void test_iterative_one() {
		Factorial f = new Factorial();
		assertEquals(f.calculate_iteration(1), 1);
	}
	@Test
	void test_recursive_five() {
		Factorial f = new Factorial();
		assertEquals(f.calculate_recursive(5), 120);
	}
}
