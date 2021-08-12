package com.practice.dsa.twopointers.easy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class ReverseWordsInAStringIII {
	
	@Test
	public void test1() {
		String s = "God Ding";
		Assert.assertEquals(toReverseWordsInAStringIII(s), "doG gniD");
	}

	private String toReverseWordsInAStringIII(String s) {
		
//		Brute Force
//		String[] split = s.split("\\s");
//		System.out.println(Arrays.toString(split));
//		System.out.println(split.length);
//		String s1 = "";
//		for (int i = 0; i < split.length; i++) {
//			for (int j = split[i].length()-1; j >=0 ; j--) {
//				s1 +=split[i].charAt(j);
//			}
//			s1+=" ";
//		}
//		System.out.println("["+s1+"]");
//		String s2 = s1.trim();
//		System.out.println("["+s2+"]");
//		return s2;
		
//		Approach #1 Simple Solution[Accepted]
	    
//		String[] words = s.split(" ");
//		StringBuilder res = new StringBuilder();
//		for (String word : words) {
//			res.append(new StringBuffer(word).reverse().toString()+" "); // Correct Method
//			res.append(new StringBuilder(word).reverse().toString()+" "); // Correct Method
//		} 
//		return res.toString().trim();
		
//		Approach #3 Using StringBuilder and reverse method [Accepted]
		
		StringBuilder res = new StringBuilder();
		StringBuilder word = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') word.append(s.charAt(i));
			else {
				res.append(word.reverse());
				
			}
		}
		return s;
		
	}
}
