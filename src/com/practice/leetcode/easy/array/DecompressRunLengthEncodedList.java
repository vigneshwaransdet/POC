package com.practice.leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DecompressRunLengthEncodedList {
	
//	@Test
	public void test1() {
		int[] nums = {1,2,3,4};
		Assert.assertTrue(Arrays.equals(decompressRLElist(nums), new int[] {2,4,4,4}));
	}
	
//	@Test
	public void test2() {
		int[] nums = {2,1};
		Assert.assertTrue(Arrays.equals(decompressRLElist(nums), new int[] {1,1}));
	}
	
	
	@Test
	public void test3() {
		int[] nums = {42,39};
		Assert.assertTrue(Arrays.equals(decompressRLElist(nums), new int[] {39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39}));
	}
	private int[] decompressRLElist(int[] A) {
//		int n=0;
//		for(int i=0;i<nums.length;){
//            n+=nums[i];
//            i+=2;
//        }
//        int[] nums1 = new int[n];
//        int k =0;
//        for(int i=0;i<nums.length;i+=2){
//            for(int j=0;j<nums[i];j++){
//                nums1[k++]=nums[i+1];
//            }
//        }
//        return nums1;
		
		List<Integer> res = new ArrayList<>();
	    int f = 0, n = 0;
	    for(int i = 0; i < A.length; i++)
	    {
	        if(i%2 == 0)
	        {
	            f = A[i];
	        }
	        else
	        {
	            while(f-- > 0)
	            {
	                res.add(A[i]);
	            }
	        }
	    }
	    
	    int[] result = new int[res.size()];
	    for(int i = 0; i < res.size(); i++) result[i] = res.get(i);
	    return result;
    }

}
