package com.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeAnnotation {
	@Test
	public void getCart() {
	System.out.println("this is the best annotation");
	
	
	}
	@BeforeMethod
	public void getShopping() {
		System.out.println("this is BeforeMethod annotation");
	}
	
	@AfterSuite
	public void getMoney() {
		System.out.println("this is aftersuite annotation");
	}
}
