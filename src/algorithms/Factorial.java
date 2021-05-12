package algorithms;

/**
 * Problem Description: Write a method that receives an integer N Then
 * calculates and return N! Example-> input: 5 output: 5! = 120
 *
 */
public class Factorial {

	public int calculate_iteration(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public int calculate_recursive(int n) {
		if (n == 1)
			return 1;
		return calculate_recursive(n - 1) * n;
	}
}
