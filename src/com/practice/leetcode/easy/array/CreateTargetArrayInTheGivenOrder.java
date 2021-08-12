package com.practice.leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CreateTargetArrayInTheGivenOrder {
	@Test
	public void test1() {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		toCreateTargetArrayInTheGivenOrder(nums,index);
		
	}

	private int[] toCreateTargetArrayInTheGivenOrder(int[] nums, int[] index) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < index.length; i++) {
			list.add(index[i], nums[i]);
		}
		int[] res = new int[nums.length];
//		System.out.println(list);
		int indexRes = 0;
		for (int res1 : list) {
			res[indexRes++] = res1;
		}
//		System.out.println(Arrays.toString(res));
		return res;
	}

}
