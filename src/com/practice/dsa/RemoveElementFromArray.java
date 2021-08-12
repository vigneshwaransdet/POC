package com.practice.dsa;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class RemoveElementFromArray {
	
	@Test
	public void test1() {
		int[] arr = {1,2,5,6,4,8};
		Assert.assertTrue(Arrays.equals(removeElementFromArray(arr),new int[] {1,2,6,4,8}));
	}

	private int[] removeElementFromArray(int[] arr) {
		
		int k = 5;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==k) {
				for (int j = 0; j < arr.length-1; j++) {
					arr[i]=arr[j+1];
				}
			}
		}
		
		return arr;
	}
}
