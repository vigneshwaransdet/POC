package com.practice.dsa.binarysearch;

import org.junit.Assert;
import org.junit.Test;


public class SearchInsertPosition {
	@Test
	public void test1() {
		int[] nums = {1,3,5,6};
		int target = 5;
		Assert.assertEquals(toFindSearchInsertPosition(nums,target), 2);
	}

	private int toFindSearchInsertPosition(int[] nums, int target) {
		int low=0,high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return low;
	}

}
