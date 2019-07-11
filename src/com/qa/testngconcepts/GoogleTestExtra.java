package com.qa.testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestExtra {

	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:/naveenAuto/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test(priority=1,groups="test")
	public void testmethod()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="test")
	public void facebookLogo()
	{
		Boolean k1=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(k1);
	}
	@Test(priority=3,groups="test")
	public void facebookLogo0()
	{
		Boolean k1=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(k1);
	}
	
	@Test(priority=4,groups="test")
	public void facebookLogo1()
	{
		Boolean k1=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(k1);
	}
	
	@Test(priority=5,groups="test link")
	public void facebookLogo2()
	{
		Boolean k1=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(k1);
	}
	
	@Test(priority=6,groups="test link")
	public void facebookLogo3()
	{
		Boolean k1=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(k1);
	}
	@Test(priority=7,groups="test link")
	public void facebookLogo4()
	{
		Boolean k1=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(k1);
	}
	
	@Test(priority=8,groups="test link")	
	public void facebookLogo5()
	{
		Boolean k1=driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		System.out.println(k1);
	}
	



	@AfterMethod
	public void quit()
	{
		driver.close();
	}
//What it will do first it will open browser then execute first test case and clsose
	//again it will again open browser again execute the test cases it will close
	//No of @ Test=No of times browser will open and close
	
//Run as Testng suite
	//if we will not any priority it can take any random test but at last it will execute all the @Tests
	
}
