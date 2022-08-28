package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_Text_Actitme3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		String expT="actiTIME - Enter Time-Track";
		String actT=driver.getTitle();
		if(actT.equals(expT))
		{
			System.out.println("home page is open and tast case is pass");
		}else
		{
			System.out.println("home page is not open and test case is fail");
		}
	}


}
