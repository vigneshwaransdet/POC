package com.practice.dsa.twopointers.easy;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class AddToArrayFormOfInteger2 {
	@Test
	public void test1() {
		int[] arr = {1,2,0,0};
		int k = 34;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test2() {
		int[] arr = {2,7,4};
		int k = 181;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test3() {
		int[] arr = {2,1,5};
		int k = 806;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test4() {
		int[] arr = {9,9,9,9,9,9,9,9,9,9};
		int k = 1;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test5() {
		int[] arr = {9,9};
		int k = 1;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test6() {
		int[] arr = {0};
		int k = 23;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test7() {
		int[] arr = {0};
		int k = 0;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test8() {
		int[] arr = {8};
		int k = 0;
		toAddToArrayFormOfInteger(arr,k);
	}
	
	@Test
	public void test9() {
		int[] arr = {2};
		int k = 7;
		toAddToArrayFormOfInteger(arr,k);
	}

	@Test
	public void test10() {
		int[] arr = {1};
		int k = 33;
		toAddToArrayFormOfInteger(arr,k);
	}
	private List<Integer> toAddToArrayFormOfInteger(int[] num, int k) {
		int size=num.length,carry=0;
        LinkedList<Integer> list=new LinkedList<>();
        int a=0;
        while(size>0 || k>0)
        {
            if(size>=1) a=num[--size];
            else a=0;
            int x=a+k%10+carry;
            list.addFirst(x%10);
			carry=x/10;
            k/=10;
        }
        if(carry>0) list.addFirst(carry);
        System.out.println(list);
        return list;
	}

}
