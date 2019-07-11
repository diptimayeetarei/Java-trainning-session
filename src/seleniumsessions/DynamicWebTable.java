package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//frame handeling
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tareidiptimayee@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Twinkle@Tarei");
		driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		//now we have to find dynamic table x-path
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[1]")).click();
	}

}
