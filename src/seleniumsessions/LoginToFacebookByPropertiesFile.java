package seleniumsessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebookByPropertiesFile {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop= new Properties();
		FileInputStream fileobj= new FileInputStream("F:\\Core java naveen\\JavaTrainningSession\\src\\seleniumsessions\\config.properties");//inside this FileInputStream we have to tell where exactly my properties file is available so we have to give the path
		prop.load(fileobj);//to load file
		String browsername=prop.getProperty("browser");
		String url1=prop.getProperty("urlfacebook");
//		String username=prop.getProperty("facebook_username");
//		String password=prop.getProperty("facebook_password");
//		String username_xpath=prop.getProperty("facebook_username_xpath");
//		String password_id=prop.getProperty("facebook_password_id");
//		String loginxpath=prop.getProperty("login_xpath");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:/Core java naveen/JavaTrainningSession/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("invalid browser name");
		}
		driver.get(url1);
		driver.findElement(By.xpath(prop.getProperty("facebook_username_xpath"))).sendKeys(prop.getProperty("facebook_username"));
		driver.findElement(By.id(prop.getProperty("facebook_password_id"))).sendKeys(prop.getProperty("facebook_password"));
		driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();

	}

}
