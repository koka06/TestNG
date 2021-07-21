package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


//@Listeners(com.listeners.test.ListenerClass.class)
@Listeners(com.listeners.test.ReporterClass.class)
public class Assertion {
	
	//soft assertion continues and executes the next statement even when the assertion falls.
	@Test
	public void softAssertionTestMethod() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.fail("Failing Test1");
		System.out.println("Failing Test1");
		softAssert.fail("Failing Test2");
		System.out.println("Failing Test2");
		softAssert.assertEquals(1, 1,"Passing test3");
		System.out.println("Passing test3");
		softAssert.assertAll();
	}
	
	//the method exits once the assertion fails with hard assertion.
	@Test
	public void hardAssertionTestMethod() {
		boolean bolAssertTrue=true;
		boolean bolAssertFalse=false;
		System.out.println("Executing HardAssert with AssertTrue");
		Assert.assertTrue(bolAssertFalse);
		System.out.println("Executing HardAssert with AssertFalse");
		Assert.assertFalse(bolAssertFalse);
		System.out.println("Executing HardAssert with AssertAll");
		Assert.assertEquals(bolAssertTrue,bolAssertTrue);
		
	}
	
	
}
