package com.example.java;

/*
 * Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */
public class FindNumberswithEvenNumberofDigits {
	public int findNumbers(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (numberOfDigits(nums[i]) % 2 == 0) {
				result++;
			}
		}
		return result;
	}

	int numberOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

}
