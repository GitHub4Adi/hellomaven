package com.singhals;

import junit.framework.Assert;
import org.junit.Test;

public class HelloWorldTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testPrintHelloWorld() {
		Assert.assertEquals(HelloWorld.printHelloWorld("Aditi"), "Hello Aditi");
	}
}
