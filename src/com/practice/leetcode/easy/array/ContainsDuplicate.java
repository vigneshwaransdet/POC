package com.practice.leetcode.easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicate {
	@Test
	public void test1() {
		int[] nums = {1,2,3,1};
		Assert.assertTrue(toFindContainsDuplicate(nums));
	}
	
	@Test
	public void test2() {
		int[] nums = {1,2,3,4};
		Assert.assertFalse(toFindContainsDuplicate(nums));
	}
	
	@Test
	public void test3() {
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		Assert.assertTrue(toFindContainsDuplicate(nums));
	}

	private boolean toFindContainsDuplicate(int[] nums) {
//		Using Set:
//		Set<Integer> set = new HashSet<>();
//		for (int i = 0; i < nums.length; i++) {
//			if(!set.contains(nums[i])) {
//				set.add(nums[i]);
//			}
//			else return true;
//		}
		
//		Using Map:
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			if((map.get(nums[i]))>1) {
				return true;
			}
		}
		return false;
	}

}
