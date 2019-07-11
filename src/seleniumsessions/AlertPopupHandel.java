package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandel {
public static void main(String args[]) throws InterruptedException
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(5000);
	//to switch frame from background to foreground
	Alert alert=driver.switchTo().alert();//Return Alert class object reference
	System.out.println(alert.getText());//to get the text
	String text=alert.getText();
	alert.accept();
	if(text.equals("Please enter a valid user name"))
	{
		System.out.println("correct alert");
	}
	else
	{
		System.out.println("wrong message");
	}
	
//	alert.dismiss();
	//alerts-java script popup-alert API(accept,dismiss)
		//File upload popup-browse button-type-(file,sendKeys(path)
		//Browser window popup-Adversiment popup-(Window Handeler api-getWindowHandels)
}
}
