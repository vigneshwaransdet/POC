package com.practice.dsa.twopointers.easy;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParityII {
	@Test
	public void test1() {
		int[] nums = {4,2,5,7};
		sortArrayByParityII(nums);
	}
	
//	One Way
//	private int[] sortArrayByParityII(int[] nums) {
//		int odd = 1;
//        int even = 0;
//        int[] res = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]%2==0 && i%2==0){
//                res[even]=nums[i];
//                even+=2;
//            }
//            else if(nums[i]%2==0 && i%2!=0){
//                res[even] = nums[i];
//                even+=2;
//            }
//            else if(nums[i]%2!=0 && i%2==0){
//                res[odd]=nums[i];
//                odd+=2;
//            }
//            else{
//                res[odd]=nums[i];
//                odd+=2;
//            }
//        }
//        System.out.println(Arrays.toString(res));
//        return res;
//	}
	
//	Another Way:
	private int[] sortArrayByParityII(int[] nums) {
		int left = 0;
        int right = 1;
        while(right<nums.length && left < nums.length) {
        	if(nums[left]%2 == 0) {
        		left+=2;
        	}
        	else if(nums[right]%2 != 0) {
        		right+=2;
        	}
        	else {
        		int temp = nums[right];
        		nums[right] = nums[left];
        		nums[left] = temp;
        		left+=2;
        		right+=2;
        	}
        }
        System.out.println(Arrays.toString(nums));
		return nums;
	}

}
