package com.practice.leetcode.easy.array;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfASortedArray {
	@Test
	public void test1() {
		int nums[] = {-4,-1,0,3,10};
		Assert.assertArrayEquals(toFindSquaresOfASortedArray(nums), new int[] {0,1,9,16,100});
		
	}
	
	@Test
	public void test2() {
		int nums[] = {-7,-3,2,3,11};
		Assert.assertArrayEquals(toFindSquaresOfASortedArray(nums), new int[] {4,9,9,49,121});
		
	}
	
	@Test
	public void test3() {
		int nums[] = {-5,-3,-2,-1};
		Assert.assertArrayEquals(toFindSquaresOfASortedArray(nums), new int[] {1,4,9,25});
		
	}

	private int[] toFindSquaresOfASortedArray(int[] nums) {
		int[] res = new int[nums.length];
		int left=0,right=nums.length-1,i=nums.length-1;
		while(right>=left) {
			int s1=nums[left]*nums[left];
			int s2=nums[right]*nums[right];
			if(s1>s2) {
				res[i--] = s1;
				left++;
			}
			else {
				res[i--] = s2;
				right--;
			}
		}
		return res;
	}
}
