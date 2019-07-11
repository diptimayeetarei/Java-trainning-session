package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//atleast wait for 50 second sometimes page is very heavay it will not load in 50 second so it will give error.
		//sometimes page is loaded in 5 second so rest  45 seconds will be ignored
		//dynamic nature
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		//implicitily wait is for all the elements which are available in the page
		//Its a global wait
		//after page is loaded some elements are not available so that time if we will give some time to that element it will appear in that page
		//there are some element which
		
	}

}
