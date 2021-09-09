package com.practice.string.easy;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesInGivenString {
	@Test
	public void test1() {
		String s = "hello";
		Assert.assertEquals(toFind(s), 3);
	}

//	private String toFind(String s) {
//		Set<Character> set = new LinkedHashSet<>();
//		for (int i = 0; i < s.length(); i++) {
//			if(!set.contains(s.charAt(i))) {
//				set.add(s.charAt(i));
//			}
//		}
//		String res="";
//		for (char out : set) {
//			res+=out;
//		}
//		System.out.println(res);
//		return res;
//	}
	
	private int toFind(String s) {
		int res = 0;
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
			}
			else {
				res = ;
			}
		}
		return 0;
	}
}
