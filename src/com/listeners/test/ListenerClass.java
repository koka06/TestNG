package com.listeners.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " test is started.");
		ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " test is passed.");
		ITestListener.super.onTestSuccess(result);
	}
  
}
