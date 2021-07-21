package com.testng.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	@Parameters({"browser","os"})
	public void launchBrowser(String browserType, String os) {
		System.out.println("Browser name is:" +browserType);
		System.out.println("OS name is:" +os);
	}
}
