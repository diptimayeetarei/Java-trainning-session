package com.qa.testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgClass {
	//pre condition annotation -start with before
	@BeforeSuite
	public void setup()//1
	{
		System.out.println("Setup system property");
	}
	@BeforeTest
	public void launch()//2
	{
		System.out.println("lunch the web driver");
	}
	@BeforeClass//3
	public void login()
	{
		System.out.println("login to the browser");
	}
	@BeforeMethod//4
	public void enterUrl()
	{
		System.out.println("enter the url");
	}
	
	//test case starting with test
	@Test
	public void getTitle()//5
	{
		System.out.println("get the tiltle text of the web page");
	}
	//if we will write more than one testcases
	@Test
	public void search()
	{
		System.out.println("search test cases");
	}
	//@@BeforeMethod @Test @AfterMethod @@BeforeMethod @Test @AfterMethod it will execute like this
	@Test
	public void googlelogo()
	{
		System.out.println("hi");
	}
	
	//after this it will execute like this //@@BeforeMethod @Test @AfterMethod //@@BeforeMethod @Test @AfterMethod //@@BeforeMethod @Test @AfterMethod
	//post condition start with After
	@AfterMethod//6
	public void logout()
	{
		System.out.println("it should logout");
	}
	
	@AfterClass//7
	public void closeBrowser()
	{
		System.out.println("close /quit the browser");
	}
	@AfterTest//8
	public void deleteAllCookies()
	{
		System.out.println("delete all the cookies from browser");
	}
	@AfterSuite//9
	public void generateReport()
	{
		
	}
}
