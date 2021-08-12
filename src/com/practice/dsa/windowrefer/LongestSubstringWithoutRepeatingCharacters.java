package com.practice.dsa.windowrefer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {
	@Test
	public void test1() {
		String s = "abcabcbb";
		Assert.assertEquals(toLongestSubstringWithoutRepeatingCharacters(s), 3);
	}

	@Test
	public void test2() {
		String s = "bbbbb";
		Assert.assertEquals(toLongestSubstringWithoutRepeatingCharacters(s), 1);
	}
	
	@Test
	public void test3() {
		String s = "pwwkew";
		Assert.assertEquals(toLongestSubstringWithoutRepeatingCharacters(s), 3);
	}
	
	@Test
	public void test4() {
		String s = "";
		Assert.assertEquals(toLongestSubstringWithoutRepeatingCharacters(s), 0);
	}
	
//	private int toLongestSubstringWithoutRepeatingCharacters(String s) {
//		int currentWindowSize = 0;
//		int maxWindowSize = 0;
//		int windowStart = 0;
//		int windowEnd = 0;
//		
//		Map<Character,Integer> map = new HashMap<>();
//		while(windowEnd < s.length()) {
//			if(!map.containsKey(s.charAt(windowEnd))) {
//				map.put(s.charAt(windowEnd), 0);
//				windowEnd++;
//			}
//			else {
//				map.remove(s.charAt(windowStart));
//				windowStart++;
//			}
//			
//			currentWindowSize = (windowEnd - windowStart);
//			maxWindowSize = Math.max(maxWindowSize, currentWindowSize);
//		}
//		System.out.println(maxWindowSize);
//		return maxWindowSize;
//	}
	
//	private int toLongestSubstringWithoutRepeatingCharacters(String s) {
//		int currentWindowSize = 0;
//		int maxWindowSize = 0;
//		int windowStart = 0;
//		int windowEnd = 0;
//		
//		Map<Character,Integer> map = new HashMap<>();
//		while(windowEnd < s.length()) {
//			if(map.get(s.charAt(windowEnd))==null) {
//				map.put(s.charAt(windowEnd), 0);
//				windowEnd++;
//			}
//			else {
//				map.remove(s.charAt(windowStart));
//				windowStart++;
//			}
//			
//			currentWindowSize = (windowEnd - windowStart);
//			maxWindowSize = Math.max(maxWindowSize, currentWindowSize);
//		}
//		System.out.println(maxWindowSize);
//		return maxWindowSize;
//	}
	
	private int toLongestSubstringWithoutRepeatingCharacters(String s) {
		int currentWindowSize = 0;
		int maxWindowSize = Integer.MIN_VALUE;
		int windowStart = 0;
		int windowEnd = 0;
		if(s.length() == 0) return 0;
		Map<Character,Integer> map = new HashMap<>();
		while(windowEnd < s.length()) {
			while(map.get(s.charAt(windowEnd))!=null) {
				map.remove(s.charAt(windowStart));
				windowStart++;
			}
			map.put(s.charAt(windowEnd),windowEnd);
			currentWindowSize = windowEnd - windowStart + 1;
			maxWindowSize = Math.max(currentWindowSize, maxWindowSize);
			windowEnd++;
		}
		return maxWindowSize;
	}
}
