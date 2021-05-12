package algorithms;

import java.util.Arrays;

/**Problem Description: Given an unsorted integer array, and an integer value named as sum
 * Return true If sum exist any two-pair in the array otherwise false will be returned
 * Example ->
 * input: array ={8,7,2,5,3,1}
 * sum = 10
 * output: true
 * 
 * @author Kaan Bobac
 *
 */
public class GivenSumExistInArray {
	public boolean solution(int array[], int sum) {
		Arrays.sort(array); // complexity : O(nlog()n)
		int right = 0;
		int left = array.length -1;
		while(left > right) {
			int tempSum = array[left] + array[right];
			if(tempSum == sum)
				return true;
			else if(tempSum < sum)
				right++;
			else
				left++;
		}
		return false;
	}
}
