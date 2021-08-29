package com.practice.leetcode.easy.array;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfTwoElementsInAnArray {
	@Test
	public void test1() {
		int[] nums = {3,4,5,2};
		Assert.assertEquals(toFindMaximumProductOfTwoElementsInAnArray(nums), 12);
	}

	private int toFindMaximumProductOfTwoElementsInAnArray(int[] nums) {
		int max1=0,max2=0;
		for (int i = 0; i < nums.length; i++) {
			if(max1<nums[i]) {
				max2=max1;
				max1=nums[i];
			}
			else if(max2<nums[i]) max2=nums[i];
			
		}
		return (max1-1)*(max2-1);
	}
}
