package com.owner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vocalink.pages.FindOwner;

public class FindOwnerTest {
	
	@Test(priority = 1)
	public void AddOwner() throws Exception
	{
		Thread.sleep(2000);
		FindOwner page1 = new FindOwner();
		boolean isownerAdded = page1.addowner(FindOwnerSuiteTest.driver);
		Thread.sleep(2000);			
		Assert.assertTrue(isownerAdded, "Data is not found after adding");
	}

}
