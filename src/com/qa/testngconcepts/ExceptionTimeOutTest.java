package com.qa.testngconcepts;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	@Test(timeOut=5000)
	public void infiniteloop()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	
	//here loop will stop after 5 mili seconds
	
	
	
	@Test(invocationTimeOut=2,expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void infiniteloop1()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	//what happened here once just we are expecting expections so once we will get this exception still our test case will pass
	//interview question-how we handel exception in testng
}
