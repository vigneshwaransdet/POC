package com.practice.dsa.windowrefer;

import org.junit.Assert;
import org.junit.Test;

public class SamllestSubArray {
	
	@Test
	public void test1() {
	int[] nums = {4,2,2,7,8,1,2,8,10};
	int target = 8;
	Assert.assertEquals(toSamllestSubArray(nums,target), 1);
	}

	private int toSamllestSubArray(int[] nums, int k) {
		int minWindowSize = Integer.MAX_VALUE;
		int currentWindowSum = 0;
		int windowStart = 0;
		for(int windowEnd = 0; windowEnd<nums.length; windowEnd++) {
			currentWindowSum += nums[windowEnd];
			while(currentWindowSum >= k) {
				minWindowSize = Math.min(minWindowSize, windowEnd - windowStart+1);
				currentWindowSum -= nums[windowStart];
				windowStart++;
			}
		}
		return minWindowSize;
	}
}
