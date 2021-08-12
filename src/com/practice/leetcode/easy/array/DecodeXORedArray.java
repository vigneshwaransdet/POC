package com.practice.leetcode.easy.array;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * 
 * 
 * 
 */

public class DecodeXORedArray {
	
	@Test
	public void test1() {
		int[] encoded = {1,2,3};
		int first = 1;
		Assert.assertTrue(Arrays.equals(decode(encoded,first),new int [] {1,0,2,1}));
	}
	
	 public int[] decode(int[] encoded, int first) {
	        int[] arr = new int[encoded.length+1];
	        arr[0]=first;
	        for(int i=1;i<arr.length;i++) {
	        	arr[i]=encoded[i-1]^first;
	        	first=arr[i];
	        }
	        return arr;
	    }
	

}
