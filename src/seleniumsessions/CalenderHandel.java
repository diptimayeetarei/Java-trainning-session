package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandel {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	}
	public static void selectDateByJs(WebElement element,WebDriver driver)
	{
		JavaScriptExecutor js= ((JavaScriptExecutor)driver);
		js.executeScript();
	}

}
