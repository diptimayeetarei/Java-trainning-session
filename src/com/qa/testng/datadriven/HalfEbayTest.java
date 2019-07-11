package com.qa.testng.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfEbayTest {
	WebDriver driver;
@BeforeMethod
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "F:/naveenAuto/JavaTrainningSession/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
}
@DataProvider
public void getDataFromExcel()
{
	
}
@Test
public void halfEbayTestCase(String firstname,String lastname,String email,String password)
{
	driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	driver.findElement(By.xpath("PASSWORD")).sendKeys(password);
	driver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']")).click();
}
}
