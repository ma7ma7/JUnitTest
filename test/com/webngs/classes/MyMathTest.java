package com.webngs.classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before test 3 numbers");
	}
	
	@Test
	public void sum_3numbers() {
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}
	
	@Test
	public void sum_1number() {
		assertEquals(2, myMath.sum(new int[] {2}));
	}
}
