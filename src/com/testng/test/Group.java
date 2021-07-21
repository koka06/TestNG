package com.testng.test;

import org.testng.annotations.Test;

public class Group {
	@Test(groups="sanity")
	public void satnitTest1() {
		System.out.println("Sanity Test 1");
	}
	
	@Test(groups="sanity")
	public void satnitTest2() {
		System.out.println("Sanity Test 2");
	}

	public void satnitTest3() {
		System.out.println("Sanity Test 3");
	}

	@Test(groups="smoke")
	public void smokeTest1() {
		System.out.println("Smoke Test 1");
	}

	public void smokeTest2() {

	}

	@Test(groups="regression")
	public void regressionTest1() {
		System.out.println("Regression Test 1");
	}
}
