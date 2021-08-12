package com.practice.dsa.twopointers.easy;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateII {
	@Test
	public void test1() {
		int[] nums = {1,2,3,1};
		int k = 3;
		Assert.assertTrue(toContainsDuplicateII(nums,k)==true);
	}
	
	@Test
	public void test2() {
		int[] nums = {1,0,1,1};
		int k = 1;
		Assert.assertTrue(toContainsDuplicateII(nums,k)==true);
	}
	
	@Test
	public void test3() {
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		Assert.assertTrue(toContainsDuplicateII(nums,k)==false);
	}
	
	@Test
	public void test4() {
		int[] nums = {4,1,2,3,1,5};
		int k = 3;
		Assert.assertTrue(toContainsDuplicateII(nums,k)==true);
	}
	
	@Test
	public void test5() {
		int[] nums = {1,2,1};
		int k = 0;
		Assert.assertTrue(toContainsDuplicateII(nums,k)==false);
	}

	@Test
	public void test6() {
		int[] nums = {1,2,3,4,5,6,7,8,9,9};
		int k = 3;
		Assert.assertTrue(toContainsDuplicateII(nums,k)==true);
	}
	
//	Not all the test cases passed in leetcode
//	private boolean toContainsDuplicateII(int[] nums, int k) {
//
//		int left=0,right=1;
//        while(left<nums.length-1 && right < nums.length) {
//	        if(nums[left]!=nums[right]){
//	            right++;
//	        }
//	        else if(nums[left] == nums[right] && Math.abs(left-right) <=k && left!=right){
//	        	 return true;
//	        }
//	        else{
//	            left = right;
//	            right++;
//	        }
//			if (right >= nums.length - 1 /* && Math.abs(left-right) > k */) {
//	        	left++;
//	        	right=left+1;
//	        }
//        }
//        return false;
//	}
	
	private boolean toContainsDuplicateII(int[] nums, int k) {
		
		for(int i=0;i<nums.length;i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					
				}
			}
		}
		
        return false;
	}
}
