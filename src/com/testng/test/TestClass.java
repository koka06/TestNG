package com.testng.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void firstTestMethod() {
		System.out.println("this is my first test method");
	}
	
	@BeforeSuite
	public void afterSuiteMethod() {
		System.out.println("this is before suite method");
	}
	
	@AfterSuite
	public void beforeSuiteMethod() {
		System.out.println("this is before suite method");
	}
	
	@Test
	public void firstTestMethodForAnotherTest() {
		System.out.println("Test method of anothe Test");
	}
}
