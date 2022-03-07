package com.example.java;


// Given a binary array nums, return the maximum number of consecutive 1's in the array.
/**
 * Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3
 * 
 */
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int maxi = 0;
		int i = 0;
		while (i < nums.length) {
			int values = 0;
			while (i < nums.length && nums[i] == 1) {
				values++;
				i++;
			}
			maxi = Math.max(maxi, values);
			i++;
		}
		return maxi;
	}
}
