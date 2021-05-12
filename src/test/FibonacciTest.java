package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import algorithms.Fibonacci;

public class FibonacciTest {

	@Test
	void test_iterative() {
		Fibonacci f = new Fibonacci();
		assertEquals(f.calculate_iterative(4),3);
	}
	@Test
	void test_iterative_zero() {
		Fibonacci f = new Fibonacci();
		assertEquals(f.calculate_iterative(0),0);
	}
	@Test
	void test_iterative_one() {
		Fibonacci f = new Fibonacci();
		assertEquals(f.calculate_iterative(1),1);
	}
	@Test
	void test_recrusive() {
		Fibonacci f = new Fibonacci();
		assertEquals(f.calculate_recrusive(4),3);
	}
	@Test
	void test_recrusive_zero() {
		Fibonacci f = new Fibonacci();
		assertEquals(f.calculate_recrusive(0),0);
	}
	@Test
	void test_recrusive_one() {
		Fibonacci f = new Fibonacci();
		assertEquals(f.calculate_recrusive(1),1);
	}
}
