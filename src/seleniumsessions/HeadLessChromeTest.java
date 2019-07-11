package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		ChromeOptions ch= new ChromeOptions();//
		ch.addArguments("window-size=1400,800");//
		ch.addEncodedExtensions("headless");//
		WebDriver driver = new ChromeDriver(ch);//
		driver.get("https://ui.freecrm.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tareidiptimayee@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Twinkle@Tarei");
		driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
	}
}
