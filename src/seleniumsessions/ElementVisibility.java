package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//isDispalyed() is applicable for all the elements
		Boolean b1=driver.findElement(By.xpath("//input[@id='login1']")).isDisplayed();
		System.out.println(b1);
		//is Enabled
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		Boolean b2=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		System.out.println(b2);//false
		//why it is false because we did not checked on I agreerement checkbox thats why the element is disabled
		//Once we click on that check box it will enable
		
		
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		Boolean b3=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		System.out.println(b3);//here website problem so its coming always true
		//isSelected()-it is only applicable for checkbox,radio button and dropdown thing
		
		//take one website cjheck there
		
	}

}
