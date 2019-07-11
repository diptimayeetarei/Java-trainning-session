package com.qa.testngconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void lunchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:/naveenAuto/JavaTrainningSession/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("a");
	}
	@Test
	public void getUrlDetails()
	{
		String var=driver.getTitle();
		System.out.println(var);
		Assert.assertEquals(var, "Google","title not matchedz");
	}
	@Test
	public void navigate()
	{
		driver.navigate().forward();
	}
	@AfterMethod
	public void closeTheBrowser()
	{
		driver.quit();
		System.out.println("h");
		
	}
	
//	a
//	Releases · SeleniumHQ/htmlunit-driver · GitHub
//	h
//	Starting ChromeDriver 2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5) on port 46834
//	Only local connections are allowed.
//	Jul 10, 2019 3:37:35 PM org.openqa.selenium.remote.ProtocolHandshake createSession
//	INFO: Detected dialect: OSS
//	a
//	h
//	[Utils] Attempting to create F:\naveenAuto\JavaTrainningSession\test-output\Default suite\Default test.html
//	[Utils]   Directory F:\naveenAuto\JavaTrainningSession\test-output\Default suite exists: true
//	[Utils] Attempting to create F:\naveenAuto\JavaTrainningSession\test-output\Default suite\Default test.xml
//	[Utils]   Directory F:\naveenAuto\JavaTrainningSession\test-output\Default suite exists: true
//	PASSED: getUrlDetails
//	PASSED: navigate
	
	//Before and after method runs for every test cases

}
