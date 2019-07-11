package com.qa.testngconcepts;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=10)
	public void add()
	{
		int a=15;
		int b=55;
		int c=a+b;
		System.out.println(c);
	}
	//here what happened when we want to run perticular test case in 10 times then we have to write invocation count
}
