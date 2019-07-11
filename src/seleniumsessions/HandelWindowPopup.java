package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelWindowPopup {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		//if there are two windows 
		//to handel that window
		Set<String> handler=driver.getWindowHandles();//getWindowHandles gives you one set of objects but it can not store value in indexes so we can not use for loop so we have to use for loop
		//why string coz all the value is coming in string format
		//And iterator will not point to the location so to point location we have to call next()
		//In set  objects value are not stored in indexes so to handel that thing we need Iterator
		Iterator<String> it=handler.iterator();
		String parentwindowid=it.next();//will point to  first location and give first value that is parent window id
		System.out.println(parentwindowid);
		String childwindowid=it.next();//will point to  first location and give first value that is child window id
		System.out.println(childwindowid);
		//now we have to switch to parent window to child window
		driver.switchTo().window(childwindowid);
		System.out.println("child window popup is"+driver.getTitle());
		driver.close();//specific browser
		driver.switchTo().window(parentwindowid);
		System.out.println("parent window title"+driver.getTitle());
		//alerts-java script popup-alert API(accept,dismiss)
		//File upload popup-browse button-type-(file,sendKeys(path)
		//Browser window popup-Adversiment popup-(Window Handeler api-getWindowHandels)
		
		
	}
	

}
