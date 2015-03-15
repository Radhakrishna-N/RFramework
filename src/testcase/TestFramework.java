package testcase;

import helper.StartWebDriver;

import org.junit.Test;
import org.testng.Assert;

public class TestFramework extends StartWebDriver {
	
	@Test
	public void testCase() {
		System.out.println("Title : " + driver.getTitle());
		System.out.println("Url : " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Bugzilla Main Page");
	}
	

}
