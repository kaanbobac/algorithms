package algorithms;

/**
 * Problem Description: Given n, calculate F(n)
 * 
 * Meta Info:The Fibonacci numbers, commonly denoted F(n) form a sequence,
 * called the Fibonacci sequence, such that each number is the sum of the two
 * preceding ones, starting from 0 and 1.
 * 
 * Example-> input: n = 4, output = 3, 
 * explanation: 
 * F(0) = 0 
 * F(1) = 1 
 * F(2) = F(0) + F(1) -> 0+1 = 1 
 * F(3) = F(2) + F(1) -> 1+1 = 2 
 * F(4) = F(3) + F(2) -> 2+1 = 3
 * 
 * @author Kaan Bobac
 *
 */
public class Fibonacci {

	public int calculate_iterative(int n) {
		int first = 0;
		int second = 1;
		if(n ==0)
			return 0;
		if(n==1)
			return 1;
		for(int i=2 ; i <n; i++) {
			int temp = second;
			second = first+second;
			first = temp;
		}
		return first+second;
	}
}
