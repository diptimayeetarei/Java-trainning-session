package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//how to highlight a specific element
		//JavaScriptExecutor is a class we have to pass our driver to javascriptiexecutor
		//execute script is to execute java script code
		
	}
	
	public static void flash(WebElement element,WebDriver driver)
	{
		JavaScriptExecutor js= (JavaScriptExecutor)driver;
		String bgcolor=element.getCssValue("backgroundcolor");
		for (int i=0;i<100;i++)
		{
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
			
		}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver)
	{
		JavaScriptExecutor js=(JavaScriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='"+color"'",element);
		
	}

}
