
package seleniumsessions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcepts  {
	public static void main(String args[]) throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			// now copy the screenshot to desired location using copyFile method.
		FileUtils.copyFile(src,new File("F:\\Core java naveen\\Screenshot"+System.currentTimeMillis()+".png"));
		
	}
}
