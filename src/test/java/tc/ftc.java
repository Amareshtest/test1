package tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ftc {

	public static void firsttestcase()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver.exe");
	       WebDriver wd = new ChromeDriver();
	       
			 wd.get("http://opensource.demo.orangehrmlive.com/");
			 wd.manage().window().maximize();
			 
			wd.findElement(By.id("txtUsername")).sendKeys("admin");
			wd.findElement(By.id("txtPassword")).sendKeys("admin");
			wd.findElement(By.id("btnLogin")).click();
	}
}
