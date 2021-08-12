package com.practice.dsa.windowrefer;

import org.junit.Assert;
import org.junit.Test;

public class MaxSumSubarray {
	
	@Test
	public void test1() {
		int[] nums = {4,2,1,7,8,1,2,8,1,0};
		int k = 3;
		Assert.assertEquals(toMaxSumSubarray(nums,k), 16);
	}
	
	@Test
	public void test2() {
		int[] nums = {4,2,1,7,8,1,2,8,1,9};
		int k = 3;
		Assert.assertEquals(toMaxSumSubarray(nums,k), 18);
	}

	private int toMaxSumSubarray(int[] nums,int k) {
		int maxValue = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if(i >= k-1) {
				maxValue = Math.max(maxValue, currentSum);
				currentSum -= nums[i - (k-1)];
			}
		}
		System.out.println(maxValue);
		return maxValue;
	}

}
