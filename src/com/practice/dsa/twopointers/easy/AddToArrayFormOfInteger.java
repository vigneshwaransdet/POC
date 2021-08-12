package com.practice.dsa.twopointers.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class AddToArrayFormOfInteger {
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
		int rem = 0;
		int carry=0;
		boolean flag = false;
		List<Integer> li1 = new ArrayList<>();
		for (int i = 0; i < num.length; i++) {
			li1.add(num[i]);
		}
		List<Integer> li2 = new ArrayList<>();
		int liSize = li1.size()-1;
		while (liSize == 0) {
			if(k>0) {
				rem = k%10;
				k = k/10;
				flag = true;
			}
			if(li1.get(liSize)==0) {
				li2.add(rem);
			}
			if(rem==0 && (k==0 && li1.get(liSize)!= 0)) {
				System.out.println(li1);
				return li1;
			}
			else if(li1.get(liSize)!=0 && k>0){
				li2.add(li1.get(liSize)+rem);
			}
			else {
				li2.add(rem);
			}
			if(k==0) {
				flag = true;
				break;
			}
		}
		Collections.reverse(li2);
		System.out.println(li2);
		if(flag==true) return li2;
		 
		while(liSize >= 0 ) {
			if(k>0) {
				rem = k%10;
				k = k/10;
			}
			else rem = 0;
			
			if((li1.get(liSize)+rem)>9) {
				int total = li1.get(liSize)+rem;
				carry = total/10;
				int remTotal = total%10;
				li2.add(remTotal);
				liSize--;
			}
			else if((li1.get(liSize)+rem+carry)>9){
				int total = li1.get(liSize)+rem+carry;
				carry = total/10;
				int remTotal = total%10;
				li2.add(remTotal);
				liSize--;
			}
			else {
				li2.add(li1.get(liSize)+rem+carry);
				liSize--;
				carry=0;
			}
			
		}
		if(carry!=0) {
			li2.add(carry);
		}
		Collections.reverse(li2);
		System.out.println(li2);
		return li2;
		
	}

}
