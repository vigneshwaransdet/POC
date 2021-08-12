package com.practice.leetcode.easy.array;


import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/*
 There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
 

Constraints:

n == candies.length
2 <= n <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50
 */


public class KidsWithTheGreatestNumberOfCandies {
	
//	@Test
	public void test1UsingIntArray() {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
//		assertThat(kidsWithCandiesUsingIntArray(candies,extraCandies),CoreMatchers.hasItems(true,true,true,false,true));
		
	}
	
	@Test
	public void test1UsingList() {
//		List<Integer> candies = new ArrayList<Integer>(Arrays.asList(2,3,5,1,3));
		List<Integer> candies = Arrays.asList(2,3,5,1,3);
		int extraCandies = 3;
		assertThat(kidsWithCandiesUsingList(candies,extraCandies),CoreMatchers.hasItems(true));//doubt
//		Assert.assertEquals(kidsWithCandiesUsingList(candies,extraCandies),true);
		
	}
	
//	@Test
//	public void test1UsingList() {
//		List<Integer> candies = Arrays.asList(2,3,5,1,3);
//		int extraCandies = 3;
//		assertThat(kidsWithCandiesUsingList(candies,extraCandies),CoreMatchers.hasItems(true,true,true,false,true));
//		
//	}
	
	public List<Boolean> kidsWithCandiesUsingIntArray(int[] candies, int extraCandies) {
		int max1=0,sum=0;
		boolean flag = false;
		boolean[] res = new boolean[candies.length];
		for (int i = 0; i < candies.length; i++) {
			if(max1<candies[i])
			max1 = candies[i];
		}
		
		for (int i = 0; i < candies.length; i++) {
			if(candies[i]+extraCandies>=max1) {
				flag = true;
				res[i] = flag;
			}
			else {
				flag = false;
				res[i] = flag;
			}
		}
		List<Boolean> list = new ArrayList<>();
		for (Boolean boolean1 : res) {
			list.add(boolean1);
		}
		
		return list;
    }
	
	public List<Boolean> kidsWithCandiesUsingList(List<Integer> candies, int extraCandies) {
		int max1=0,sum=0;
		boolean flag = false;
		List<Boolean> res = new ArrayList<>();
		for (int i = 0; i < candies.size(); i++) {
			if(max1<candies.get(i))
			max1 = candies.get(i);
		}
		
		for (int i = 0; i < candies.size(); i++) {
			if(candies.get(i)+extraCandies>=max1) {
				flag = true;
				res.add(i, flag);
			}
			else {
				flag = false;
				res.add(i, flag);
			}
		}
		System.out.println(res);
		return res;
    }
}
