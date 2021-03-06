package com.practice.leetcode.easy.array;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarray {
	@Test
	public void test1() {
//		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums = {-2,2,5,-11,6};
//		Assert.assertEquals(toFindMaximumSubarrayUsingBruteForce(nums), 6);
		Assert.assertEquals(toFindMaximumSubarrayUsingKadane_sAlgo(nums), 6);
		
	}

	private int toFindMaximumSubarrayUsingBruteForce(int[] nums) {
		int maxSum = Integer.MIN_VALUE,currentSum,preSum=0;
		for (int i = 0; i < nums.length; i++) {
			currentSum=0;
			for (int j = i; j < nums.length; j++) {
				currentSum += nums[j];
				maxSum = Math.max(maxSum, currentSum);
			}
			preSum=maxSum;
		}
		return preSum;
	}
	
	private int toFindMaximumSubarrayUsingKadane_sAlgo(int[] nums) {
		int maxSum=nums[0];
		int currentSum=maxSum;
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i]+currentSum, nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
