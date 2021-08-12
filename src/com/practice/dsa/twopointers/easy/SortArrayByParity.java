package com.practice.dsa.twopointers.easy;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParity {
	@Test
	public void test1() {
		int[] nums = {3,1,2,4};
		toSortArrayByParity(nums);
	}
	
	@Test
	public void test2() {
		int[] nums = {0,1,2};
		toSortArrayByParity(nums);
	}

	@Test
	public void test3() {
		int[] nums = {1,0,3};
		toSortArrayByParity(nums);
	}
	private int[] toSortArrayByParity(int[] nums) {
		int left = 0;
        int right = nums.length-1;
        while(right>=left){
            if(nums[left]%2!=0 && nums[right]%2==0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            else if((nums[left]%2!=0 && nums[right]%2!=0)){
                right--;
            }
            else if(nums[left]%2==0 && nums[right]%2!=0){
                right--;
            }
            else if((nums[left]%2==0 && nums[right]%2==0)) {
            	left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
	}

	
	public int[] sortArrayByParity(int[] nums) {
		int left = 0, right = 0;
		while(right < nums.length) {
			if((nums[right] & 1) == 0 && right > left) {
				int tmp = nums[right];
				nums[right++] = nums[left];
				nums[left++] = tmp;
			}else right++;

			if((nums[left] & 1) == 0) left++;
		}
		return nums;
	}

}
