package com.practice.leetcode.easy.array;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringsAlternately {
	@Test
	public void test1() {
		String word1 = "abc";
		String word2 = "pqr";
		Assert.assertEquals(toMergeStringsAlternatelyMethod(word1,word2), "apbqcr");
	}
	
	@Test
	public void test2() {
		String word1 = "ab";
		String word2 = "pqrs";
		Assert.assertEquals(toMergeStringsAlternatelyMethod(word1,word2), "apbqrs");
	}

	private String toMergeStringsAlternatelyMethod(String word1, String word2) {
		int w1 = word1.length(),w2 = word2.length();
        char[] arrRes = new char[w1+w2];
        int left=0,right=0,rp=0;
        while(left<w1 || right<w2){
            if(left<w1) arrRes[rp++] = word1.charAt(left++);
            if(right<w2) arrRes[rp++] = word2.charAt(right++);
        }
        return new String(arrRes);
	}
}
