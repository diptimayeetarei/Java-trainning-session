package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bag");
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading')]")).sendKeys("Bag");
		//how to handel dynamic id'
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Bag");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Bag");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_')]")).sendKeys("Bag");
		//for links xpath
		//all links are started with a
		driver.findElement(By.xpath("//a[contains(text(),'My account']")).sendKeys("Bag");
		
		//absolute xpath-
		//performance is very slow
		//it is not reliable
		//It can change it in future
		
	}

}
