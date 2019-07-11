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

public class TestngBasics {
//we don't need main method to execute the class
	
	//pre test annotations
	@BeforeSuite
	public void setupSystemPropertyforchrome()
	{
		
	}
	@BeforeTest()
	public void login()
	{
		
	}
	@BeforeClass
	public void lunchCHromeBrowser()
	{
		
	}
	
	@BeforeMethod
	public void url()
	{
		
	}
	//test annotations
	@Test
	public void getgoogleurl()
	{
		
	}
	//after test annotation
	@AfterMethod
	public void logoutfromapp()
	{
		
	}
	
	@BeforeMethod
	public void url1()
	{
		
	}
	//test annotations
	@Test
	public void getgoogleurl1()
	{
		
	}
	//after test annotation
	@AfterMethod
	public void logoutfromapp1																											()
	{
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
	}
	@AfterTest
	public void deletecookies()
	{
		
	}
	@AfterSuite
	public void generateTestReport()
	{
		
	}
	
}
