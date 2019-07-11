package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConceptDragAndDropAndImplicitWait {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//to mouse hover add ons first we have to create one object in Actions class
		//a[@id='highlight-addons']
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='highlight-addons']"))).build().perform();
		//action.moveToElement(driver.findElement(By.linkText("Add-Ons"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Priority Check-in")).click();
	}

}
