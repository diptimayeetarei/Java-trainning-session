package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//to create object of properties file
		Properties prop= new Properties();
		FileInputStream fileobj= new FileInputStream("F:\\Core java naveen\\JavaTrainningSession\\src\\seleniumsessions\\config.properties");//inside this FileInputStream we have to tell where exactly my properties file is available so we have to give the path
		prop.load(fileobj);//to load file
		System.out.println(prop.getProperty("name"));//everything in prop so we have to call get property
		//how we will get that all value for future use
		String url=prop.getProperty("url");
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.out.println("firefox driver");
		}
		driver.get(url);
	}
	
	//no need to change these constant values in our script so its very easy and convinent
	

}
