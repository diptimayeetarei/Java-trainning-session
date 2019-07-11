package com.qa.testngconcept.parameterconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterConcept {
	WebDriver driver;
@Test
@Parameters({"browser","url" ,"username"})
public void loginToYahoo(String browser1,String url1,String username1)

{
	if(browser1.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "F:/naveenAuto/JavaTrainningSession/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url1);
driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(username1);
driver.findElement(By.xpath("//input[@id='login-signin']")).click();
}
}
}
