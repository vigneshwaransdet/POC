package com.practice.string.easy;

import org.junit.Assert;
import org.junit.Test;


public class DefangingAnIPAddress {
	@Test
	public void test1() {
		String s = "1.1.1.1";
		Assert.assertEquals(toDefangingAnIPAddress(s), "1[.]1[.]1[.]1");
	}

	private String toDefangingAnIPAddress(String s) {
		String replace = s.replace(".", "[.]");
		return replace;
	}
}
