package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriver {
	public static void main(String args[]) throws InterruptedException
	{
		//WebDriver driver;
		WebDriver driver = new HtmlUnitDriver();
		//after selenium 3.0 version Html unit driver is not available so we need to download the jar file
		//then add that external jar to jave build path
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//advantages
		//testing is happening behind that mean no browser
		//it is very fast so its improving performance
		//not suitable for actions class like mouse movement drag and drop all
		
		
	}
	

}
