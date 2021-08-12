package com.practice.leetcode.easy.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 *Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans. 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,1]
   Output: [1,2,1,1,2,1]
   Explanation: The array ans is formed as follows:
   -  ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
   -  ans = [1,2,1,1,2,1]


 * Example 2:
 * 
 * Input: nums = [1,3,2,1]
   Output: [1,3,2,1,1,3,2,1]
   Explanation: The array ans is formed as follows:
   - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
   - ans = [1,3,2,1,1,3,2,1]
 * 
 */

public class ConcatenationOfArray {

	@Test
	public void test1() {
		int[] nums = {1,2,1};
		Assert.assertTrue(Arrays.equals(toConcateArray(nums),new int[] {1,2,1,1,2,1}));
	}
	
//	@Test
	public void test2() {
		int[] nums = {1,3,2,1};
		Assert.assertTrue(Arrays.equals(toConcateArray(nums),new int[] {1,3,2,1,1,3,2,1}));
	}

	private int[] toConcateArray(int[] nums) {
		
//		int[] ans = new int[nums.length+nums.length];
//		int j=0;
//		
//		for(int i=0;i<ans.length;i++) {
//			
//			if(i>=nums.length && j<nums.length) {
//				ans[i] = nums[j++];
//			}
//			else {
//				ans[i]=nums[i];
//			}
//		}
		
		int n = nums.length;
        int[] ans = new int[2*n];
        int j = 0;
        
        for(int i=0;i<ans.length;i++){
            if(i>n && j<n){ // doubt
                ans[i] = nums[j++];
            }
            else{
                ans[i] = nums[i]; //doubt
            }
        }
		
		return ans;
	}
}
