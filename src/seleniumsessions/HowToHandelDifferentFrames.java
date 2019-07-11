package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandelDifferentFrames {
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
		//driver.switchTo().frame("downloadFrame");
		//driver.findElement(By.xpath("//a[text()='App Configuration']")).click(); 
		//driver.findElement(By.linkText("Contacts")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
//		driver.findElement(By.xpath("//*[@id='main-nav']/a[3]")).click();
	//	driver.findElement(By.xpath("//div[contains(text()='contacts']")).click();
		//div[contains(text(),'contacts')]
		//driver.findElement(By.xpath("//div[contains(text(),'contacts')]")).click();
		//driver.findElement(By.xpath("//span[contains(@class='item-text'][contains(text(),'contacts')]")).click();
	//driver.findElement(By.xpath("//*[@id='main-nav']/a[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
	
	}
	

}
