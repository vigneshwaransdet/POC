package com.practice.leetcode.easy.array;

import org.junit.Assert;
import org.junit.Test;


public class FindNumbersWithEvenNumberOfDigits {
	@Test
	public void test1() {
		int nums[] = {12,345,2,6,7896};
		Assert.assertEquals(toFindNumbersWithEvenNumberOfDigits(nums), 2);
	}
	
	@Test
	public void test2() {
		int nums[] = {555,901,482,1771};
		Assert.assertEquals(toFindNumbersWithEvenNumberOfDigits(nums), 1);
	}

	private int toFindNumbersWithEvenNumberOfDigits(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			while (nums[i] > 0) {
				nums[i] = nums[i] / 10;
				count++;
				if (count % 2 == 0 && nums[i] == 0) {
					res++;
				}
			}
		}
		return res;
	}
	

}
