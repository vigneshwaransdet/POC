package com.practice.leetcode.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	@Test
	public void test1() {
		int[] nums = {2,7,11,15};
		int k = 9;
		Assert.assertArrayEquals(toFindTwoSum(nums,k), new int[] {0,1});
	}

	@Test
	public void test2() {
		int[] nums = {3,2,4};
		int k = 6;
		Assert.assertArrayEquals(toFindTwoSum(nums,k), new int[] {1,2});
	}
	
	@Test
	public void test3() {
		int[] nums = {3,3};
		int k = 6;
		Assert.assertArrayEquals(toFindTwoSum(nums,k), new int[] {0,1});
	}
	
	@Test
	public void test4() {
		int[] nums = {3,2,3};
		int k = 6;
		Assert.assertArrayEquals(toFindTwoSum(nums,k), new int[] {0,2});
	}
	
	private int[] toFindTwoSum(int[] nums, int target) {
//		for (int i = 0; i < nums.length; i++) {
//            for(int j=i+1;j<nums.length;j++){
//			    if((target-nums[i])==nums[j]) return new int[] {i,j};
//            }
//		}
		
//		Map<Integer,Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			map.put(nums[i], i);
//		}
//		
//		for (int i = 0; i < nums.length; i++) {
//			if(map.containsKey(target-nums[i])) {
//				if(i!=map.get(target-nums[i])) {
//					return new int[] {i,map.get(target-nums[i])};
//				}
//				
//			}
//		}
//		return new int[] {};
		
		Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {i,map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        
		return new int[0];
	}
}
