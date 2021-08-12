package com.practice.leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SumOfAllOddLengthSubarrays {
	
	@Test
	public void test1() {
		int[] arr = {1,4,2,5,3};
		toSumOfAllOddLengthSubarrays(arr);
	}

	private int toSumOfAllOddLengthSubarrays(int[] arr) {
		int n = arr.length;
		int[] oddArr = new int[arr.length];
		int index=0;
		for(int i=1;i<=n;i+=2) {
			oddArr[index++] = i;
		}
		System.out.println(Arrays.toString(oddArr));
		
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			li.add(arr[i]);
		}
		System.out.println(li);
		int windowStart = 0;
		int windowEnd = 0;
		int currentWindowSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int k = 1;
			if(windowEnd < oddArr[k]) {
				currentWindowSum += arr[i];
				windowEnd++;
			}
			li.add(currentWindowSum);
//			windowEnd
		}
		
		return 0;
	}
	
	

}
