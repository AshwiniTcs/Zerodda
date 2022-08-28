package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locators {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		
			driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
	String expT="actiTIME - Enter Time-Track";
		Thread.sleep(2000);
		
		String actT=driver.getTitle();
		if(actT.equals(expT))
		{
			System.out.println("Home page is open and tast case is pass");
		}
		else
		{
			System.out.println("home is fail and test case is fail");
		}
		
}


}
