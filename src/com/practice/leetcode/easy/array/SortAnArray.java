package com.practice.leetcode.easy.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

public class SortAnArray {
	@Test
	public void test1() {
//		int[] nums = { 5, 2, 3, 2, 1 };
//		sortArray(nums);
//		Integer[] nums = { 10, 20, 30, 40, 50 };
		Integer[] nums = { 5, 2, 3, 2, 1 };
		reverse(nums);
	}

//	public int[] sortArray(int[] nums) {
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] > nums[j]) {
//					int temp = nums[i];
//					nums[i] = nums[j];
//					nums[j] = temp;
//				}
//			}
//		}
		
//		Arrays.sort(nums);
//		Collections.reverse(Arrays.asList(nums));
//		System.out.println(Arrays.asList(nums));
//		
//		return nums;
//	}
	
	
	 	static void reverse(Integer a[])
	    {
	        Collections.reverse(Arrays.asList(a)); // doubt
	        System.out.println(Arrays.asList(a));
	    }
	 
//	    public static void main(String[] args)
//	    {
//	        Integer [] arr = {10, 20, 30, 40, 50};
//	        reverse(arr);
//	    }
}
