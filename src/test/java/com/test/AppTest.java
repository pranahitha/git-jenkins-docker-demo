package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.App;

public class AppTest {
	App app;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		app=new App();
	}

	@After
	public void tearDown() throws Exception {
		app=null;
	}

	@Test
	public void sumtest1() {
		assertEquals(12, app.sum(6, 6));;
	}
	@Test
	public void sumtest2() {
		assertEquals(32, app.sum(16, 16));;
	}
	@Test
	public void sumtest3() {
		assertEquals(7, app.sum(1, 6));;
	}

}
