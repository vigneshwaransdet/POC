package com.practice.string.easy;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class SortingTheSentence {
	
	@Test
	public void test1() {
		String s = "is2 sentence4 This1 a3";
		Assert.assertEquals(toSortingTheSentence(s), "This is a sentence");
	}

	private String toSortingTheSentence(String s) {
		String[] str = new String[10];
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				str[s.charAt(i) - '0'] = temp;
				temp="";
				continue;
			}
			
			if(s.charAt(i)!=' ') {
				temp += s.charAt(i);
			}
		}
		String ans ="";
		for (String string : str) {
			if(string!=null) {
				ans += string;
				ans += " ";
			}
		}
		
		return ans.trim();
		
	}
}
