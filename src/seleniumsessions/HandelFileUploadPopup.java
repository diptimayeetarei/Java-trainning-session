package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelFileUploadPopup {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		//as it is window based we can not to by click we have to send file path
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("F:\\UPSC PREPARATION\\mains (1).pdf");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
