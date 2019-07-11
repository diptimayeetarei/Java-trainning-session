package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		
		//drag and drop
		//click move relaese
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		//first click and hold then move after that release in that posistion and then build and perform
		
		
	}

}
