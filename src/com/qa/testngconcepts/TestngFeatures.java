package com.qa.testngconcepts;

import org.testng.annotations.Test;

public class TestngFeatures {
	@Test
	public void login()
	{
		System.out.println("1");
		//int 9/0;when we will write this thing then login() will fail so homepage is totally dependent on login() so it will not execute homepage test
	}
	@Test(dependsOnMethods ="login")//Here if Login() will pass then only homepage() will execute otherwise homepage will not execute
	public void homePage()
	{
		System.out.println("2");
	}
	@Test
	public void searchPage()
	{
		System.out.println("3");
	}
	
	@Test(dependsOnMethods ="login")//if login will fail then registration will be ignored
	public void registration()
	{
		System.out.println("3");
	}

}
