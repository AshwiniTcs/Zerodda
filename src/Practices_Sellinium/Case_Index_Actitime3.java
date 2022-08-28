package Practices_Sellinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case_Index_Actitime3 {

	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Java Programs\\Core java\\src\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label)[1]")).click();
	     Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div)[13]")).click();
		
		String expT="actiTIME - Enter Time-Track";
		String actT=driver.getTitle();
		if(actT.equals(expT))
		{
			System.out.println("test case is fail");
		}else
		{
			System.out.println("test case is pass");
		}
		
	}
}
