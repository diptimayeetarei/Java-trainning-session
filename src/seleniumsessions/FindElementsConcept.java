package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//1.Total counts of the link
		//2.to get all the text of eachlinks in spicejet.com How we find?
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		//here we have checked link thats why we have given"a" otherwise if someone will ask how many buttons are there inplace of a we will write"button"
		//instead of "a" we can write"input"
		System.out.println(list);
		System.out.println(list.size());//total no of links avail in that page
		//tto print everything we need for loop
		for(int i=0;i<list.size();i++)
		{
			String value=(list.get(i).getText());//why get because for list we use get() to get respective cvalue
			System.out.println(value);
		}
		
		
	}

}
