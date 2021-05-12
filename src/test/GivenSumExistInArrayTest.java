package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import algorithms.GivenSumExistInArray;

public class GivenSumExistInArrayTest {
	@Test
	void test_sum_exists() {
		int array[] = {8,7,2,5,3,1};
		int k = 10;
		GivenSumExistInArray g = new GivenSumExistInArray();
		assertEquals(g.solution(array,k), true);
	}
	@Test
	void test_sum_not_exist() {
		int array[] = {8,7,2,5,3,1};
		int k = 100;
		GivenSumExistInArray g = new GivenSumExistInArray();
		assertEquals(g.solution(array,k), false);
	}
	@Test
	void test_sum_exist_length_two() {
		int array[] = {3,1};
		int k = 4;
		GivenSumExistInArray g = new GivenSumExistInArray();
		assertEquals(g.solution(array,k), true);
	}
	@Test
	void test_sum_exist_length_one() {
		int array[] = {3};
		int k = 3;
		GivenSumExistInArray g = new GivenSumExistInArray();
		assertEquals(g.solution(array,k), false);
	}

}
