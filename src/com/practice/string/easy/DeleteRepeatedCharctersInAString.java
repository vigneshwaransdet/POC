package com.practice.string.easy;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class DeleteRepeatedCharctersInAString {
	@Test
	public void test1() {
		String s = "ABCABDEFG";
		Assert.assertEquals(toDeleteRepeatedCharctersInAString(s), "ABCDEFG");
	}

	private String toDeleteRepeatedCharctersInAString(String s) {
//		char[] charArray = s.toCharArray();
		Set<Character> set = new HashSet<>();
//		for (char chars : charArray) {
//			set.add(chars);
//		}
		String res="";
//		for (char chars : set) {
//			res+= chars;
//		}
		
		for (int i = 0; i < s.length(); i++) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				res+=s.charAt(i);
			}
		}
		return res;
	}
}
