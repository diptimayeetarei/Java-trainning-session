package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	public static void main(String args[])
	{
		WebDriver driver;
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./JavaTrainningSession/chromedriver.exe");
		driver.get("https://m.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='firstname_input']")).sendKeys("Hardik");
		driver.findElement(By.xpath("//input[@id='lastname_input']")).sendKeys("pandya");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByIndex(10);
		
		Select month= new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Jan");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByIndex(15);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.cssSelector("#contactpoint_step_input")).sendKeys("9148215227");
		driver.findElement(By.xpath("//button[@value='Next']")).click();
		driver.findElement(By.xpath("//input[@id='Female']")).click();
		driver.findElement(By.xpath("//button[@value='Next']")).click();
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Twinkle@Tarei");
		driver.findElement(By.xpath("//button[@value='Sign Up']")).click();
		
		
	}

}
